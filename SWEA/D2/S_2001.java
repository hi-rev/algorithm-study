import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2001 {
    // 누적합 배열로 풀어보기!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());  // test case

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 영역
            int m = Integer.parseInt(st.nextToken()); // 파리채
            int[][] area = new int[n+1][n+1];
            int[][] fly = new int[n+1][n+1]; // 누적합 배열

            for (int j = 1; j <= n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 1; k <= n; k++) { // 영역 배열 입력 받기
                    area[j][k] = Integer.parseInt(st.nextToken());
                    // 누적합 배열: 배열의 왼쪽 값 + 배열의 위쪽 값 - 배열의 왼쪽 위 대각선 값 + 자기 자신
                    fly[j][k] = fly[j][k-1] + fly[j-1][k] - fly[j-1][k-1] + area[j][k];
                }
            }

            int max = 0;
            for (int j = m; j <= n; j++) {
                for (int k = m; k <= n; k++) {
                    // 부분합 구하기: 자기 자신 - 부분 왼쪽 끝값 - 부분 위쪽 끝값 + 끝값의 대각선 값
                    max = Math.max(max, fly[j][k] - fly[j][k-m] - fly[j-m][k] + fly[j-m][k-m]);
                }
            }
            System.out.println("#" + (i+1) + " " + max);
        }
    }
}
