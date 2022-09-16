import java.util.Scanner;

public class N_1912 {
    static int[] arr;
    static Integer[] dp;
    static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        arr = new int[n];
        dp = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        dp[0] = arr[0];
        max = arr[0];

        numSum(n - 1);
        System.out.println(max);
    }

    // 첫 번째부터 계속 더해가면서
    // 더 큰수를 만나면 거기서부터 순서대로 더해가는 방식이다.
    static int numSum(int n) {
        if (dp[n] == null) {
            dp[n] = Math.max(numSum(n - 1) + arr[n], arr[n]);

            max = Math.max(dp[n], max);
        }
        return dp[n];
    }
}
