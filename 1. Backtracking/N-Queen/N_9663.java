import java.util.Scanner;

public class N_9663 {
    // N-Queen
    static int[] chess;
    static int n;
    static int cnt = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        chess = new int[n];

        nQueen(0);
        System.out.println(cnt);
    }
    // 첫번째 행부터 한 개씩 채워나가면서 놓을 수 있는 위치라면 재귀호출을 하며 채워나감
    static void nQueen(int row) {
        if (row == n) {
            cnt++;
            return;
        }

        for (int i = 0; i < n; i++) {
            chess[row] = i;

            if (check(row)) {
                nQueen(row+1);
            }
        }
    }
    // 퀸이 들어갈 수 있는 위치인지 검증하기
    static boolean check(int row) {
        for (int i = 0; i < row; i++) {
            // 퀸이 들어갈 위치의 열에 다른 퀸이 있는지 검증
            if (chess[row] == chess[i]) {
                return false;
            }
            // 열의 차와 행의 차가 같을 경우 대각선에 놓여있음
            else if (Math.abs(row - i) == Math.abs(chess[row] - chess[i])) {
                return false;
            }
        }
        return true;
    }
}
