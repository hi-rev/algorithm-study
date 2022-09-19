import java.io.*;
import java.util.StringTokenizer;

public class N_11659 {
    public static void main(String[] args) throws IOException {

        // 수 n개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String s = br.readLine();
        String strArr[] = s.split(" ");

        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            // 누적 합을 미리 배열에 연산하는 것이 핵심
            arr[i] = Integer.parseInt(strArr[i-1]) + arr[i-1];
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // i번째 수
            int b = Integer.parseInt(st.nextToken()); // j번째 수

            System.out.println(arr[b] - arr[a-1]);
        }
    }
}
