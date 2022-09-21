import java.util.Scanner;

public class N_1932 {
    static int n;
    static int arr[][];
    static int dp[][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 삼각형의 크기

        // 2차원 배열 생성
        arr = new int[n][n];
        int end = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < end; j++) {
                arr[i][j] = sc.nextInt();
            }
            end++;
        }
//        System.out.println(Arrays.deepToString(arr));
        dp = new int[n][n];
        dp[0][0] = arr[0][0];
        triangle(1, 2);
//        System.out.println(Arrays.deepToString(dp));
        int max = dp[n-1][0];
        for (int i = 1; i < n; i++) {
            if (dp[n-1][i] > max) {
                max = dp[n-1][i];
            }
        }
        System.out.println(max);
    }
    static int triangle(int idx, int end) {
        if (idx == n) {
            return 1;
        }
        for (int i = 0; i < end; i++) {
            if (i == 0) {
                dp[idx][0] = dp[idx - 1][0] + arr[idx][0];
            } else {
                dp[idx][i] = Math.max(dp[idx-1][i], dp[idx-1][i-1]) + arr[idx][i];
            }
        }
        return triangle(idx+1, end+1);
    }
}
