import java.util.Scanner;
// 앞자리보다 큰 수만 출력하는 경우의 수
public class N_15652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // n 배열 만들기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        int[] res = new int[m]; // 반환값
        seq4(arr, res, 0, 0, n, m);
    }

    static void seq4(int[] arr, int[] res, int start, int depth, int n, int m) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < n; i++) {
            res[depth] = arr[i];
            seq4(arr, res, i, depth+1, n, m);
        }
    }
}
