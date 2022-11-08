import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1959 {
    // 두 개의 숫자열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {  // test case
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            // n과 m 중 더 큰 크기로 배열을 만듦
            int max = Math.max(n, m);
            int[] aArr = new int[max];
            int[] bArr = new int[max];

            String[] aStrArr = br.readLine().split(" ");
            String[] bStrArr = br.readLine().split(" ");


            for (int j = 0; j < aStrArr.length; j++) {
                aArr[j] = Integer.parseInt(aStrArr[j]);
            }
            for (int j = 0; j < bStrArr.length; j++) {
                bArr[j] = Integer.parseInt(bStrArr[j]);
            }

            System.out.print("#" + (i+1) + " ");
            int start = 0;
            int maxNum = 0;
            if (m == max) { // m이 더 큰수라면?
                for (int j = 0; j <= m - n; j++) {
                    int[] init = aArr;
                    int idx = 0;
                    int res = 0;
                    for (int k = start; k < start + n; k++) {
                        res += init[idx] * bArr[k];
                        idx++;
                    }
                    if (res > maxNum) {
                        maxNum = res;
                    }
                    start++;
                }
                System.out.println(maxNum);

            } else { // n이 더 큰수라면?
                for (int j = 0; j < n - m; j++) {
                    int[] init = bArr;
                    int idx = 0;
                    int res = 0;
                    for (int k = start; k < start + m; k++) {
                        res += init[idx] * aArr[k];
                        idx++;
                    }
                    if (res > maxNum) {
                        maxNum = res;
                    }
                    start++;
                }
                System.out.println(maxNum);
            }
        }
    }
}
