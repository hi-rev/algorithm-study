import java.util.Arrays;
import java.util.Scanner;

public class N_2559 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 표의 크기
        int m = sc.nextInt(); // 합 구하는 횟수
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
//        System.out.println(Arrays.deepToString(arr));
        int[][] prefix = new int[n][n];
        prefix[0][0] = arr[0][0];
        for (int i = 1; i < n; i++) {
            prefix[0][i] = arr[0][i] + prefix[0][i-1];
        }
        for (int i = 1; i < n; i++) {
            prefix[i][0] = arr[i][0] + prefix[i-1][0];
        }
//        System.out.println(Arrays.deepToString(prefix));

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < j+1; k++) {
                    sum += arr[i][k];
                }
                prefix[i][j] = prefix[i-1][j] + sum;
            }
        }
//        System.out.println(Arrays.deepToString(prefix));

        for (int i = 0; i < m; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();


        }
    }
}
