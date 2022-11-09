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

            int[] aArr = new int[n];
            int[] bArr = new int[m];

            String[] aStrArr = br.readLine().split(" ");
            String[] bStrArr = br.readLine().split(" ");

            for (int j = 0; j < aStrArr.length; j++) {
                aArr[j] = Integer.parseInt(aStrArr[j]);
            }
            for (int j = 0; j < bStrArr.length; j++) {
                bArr[j] = Integer.parseInt(bStrArr[j]);
            }

            // aArr가 작은쪽 bArr가 큰쪽
            if (aArr.length > bArr.length) {
                int[] temp = aArr;
                aArr = bArr;
                bArr = temp;
            }

            System.out.print("#" + (i+1) + " ");
            int start = 0;
            int maxNum = 0;
            int max = Math.max(n, m);
            int min = Math.min(n, m);

            for (int j = 0; j <= max - min; j++) {
                int[] init = aArr;
                int idx = 0;
                int res = 0;
                for (int k = start; k < start + min; k++) {
                    res += init[idx] * bArr[k];
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
