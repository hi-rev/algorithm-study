import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1979 {
    // 어디에 단어가 들어갈 수 있을까
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) { // test case
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 가로 세로 길이
            int k = Integer.parseInt(st.nextToken()); // 단어의 길이
            int[][] puzzle = new int[n+1][n+1];
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int l = 0; l < n; l++) {
                    puzzle[j][l] = Integer.parseInt(st.nextToken());
                }
            }

            int res = 0;
            // 가로 검증하기
            for (int j = 0; j < n; j++) {
                int cnt = 0;
                for (int l = 0; l < n; l++) {
                    if (puzzle[j][l] == 1) {
                        cnt++;
                    } else {
                        cnt = 0;
                    }

                    if (cnt == k && puzzle[j][l+1] != 1) {
                        res++;
                    }
                }
            }
            // 세로 검증하기
            for (int j = 0; j < n; j++) {
                int cnt = 0;
                for (int l = 0; l < n; l++) {
                    if (puzzle[l][j] == 1) {
                        cnt++;
                    } else {
                        cnt = 0;
                    }

                    if (cnt == k && puzzle[l+1][j] != 1) {
                        res++;
                    }
                }
            }
            System.out.println("#" + (i+1) + " " + res);
        }
    }
}
