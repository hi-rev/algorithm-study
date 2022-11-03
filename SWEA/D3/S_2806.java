import java.util.Scanner;

public class S_2806 {
    // N-Queen
    // 백트래킹 알고리즘
    static int n;
    static int[] chess;
    static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) { // test case
            n = sc.nextInt(); // n개의 퀸
            chess = new int[n]; // nXn 체스판
            cnt = 0;

            nQueen(0);
            System.out.println("#" + (i+1) + " " + cnt);
        }
    }
    static void nQueen(int depth) {
        if (depth == n) {
            cnt++;
            return;
        }

        for (int i = 0; i < n; i++) {
            chess[depth] = i;

            if (check(depth)) {
                nQueen(depth+1);
            }
        }
    }

    static boolean check(int depth) {
        for (int i = 0; i < depth; i++) {
            if (chess[depth] == chess[i]) {
                return false;
            } else if (Math.abs(depth - i) == Math.abs(chess[depth] - chess[i])) {
                return false;
            }
        }
        return true;
    }
}
