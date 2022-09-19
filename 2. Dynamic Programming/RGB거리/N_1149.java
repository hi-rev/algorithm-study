import java.util.Scanner;

public class N_1149 {
    static int[][] cost;
    static int[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 집의 수

        cost = new int[n][3];
        dp = new int[n][3]; // 누적 값을 저장할 dp 배열 생성

        // RGB 비용 입력받기
        for (int i = 0; i < n; i++) {
            cost[i][0] = sc.nextInt();
            cost[i][1] = sc.nextInt();
            cost[i][2] = sc.nextInt();
        }

        // dp 배열 초기값 지정
        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];

        System.out.println(Math.min(rgbHouse(n-1, 0), Math.min(rgbHouse(n-1, 1), rgbHouse(n-1, 2))));
    }
    // Top-down 방법
    static int rgbHouse(int n, int color) {
        if (dp[n][color] == 0) {
            if (color == 0) { // 0일 때 1과 2를 찾음
                dp[n][0] = Math.min(rgbHouse(n-1, 1), rgbHouse(n-1, 2)) + cost[n][0];
            } else if (color == 1) { // 1일 때 0과 2를 찾음
                dp[n][1] = Math.min(rgbHouse(n-1, 0), rgbHouse(n-1, 2)) + cost[n][1];
            } else { // 2일 때 0과 1을 찾음
                dp[n][2] = Math.min(rgbHouse(n-1, 0), rgbHouse(n-1, 1)) + cost[n][2];
            }
        }
        return dp[n][color];
    }
}
