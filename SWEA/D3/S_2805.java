import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_2805 {
    // 농작물 수확하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) { // test case
            int n = Integer.parseInt(br.readLine());
            int[][] value = new int[n][n];

            for (int j = 0; j < n; j++) { // input
                String s = br.readLine();
                for (int k = 0; k < n; k++) {
                    value[j][k] = s.charAt(k) - '0';
                }
            }

            int idx = n/2;
            int res = 0;
            int start = 0;
            int end = n;
            int up = 0;

            System.out.print("#" + (i+1) + " ");
            for (int j = 0; j < n/2 + 1; j++) {
                for (int k = start; k < end; k++) {
                    if (start == 0) {
                        res += value[idx][k];
                        continue;
                    }
                    res += value[idx][k];
                    res += value[idx+up][k];
                }
                start++;
                end--;
                idx--;
                up+=2;
            }
            System.out.println(res);
        }
    }
}
