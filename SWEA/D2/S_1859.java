import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_1859 {
    static long answer;
    static int n;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // test case
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            String[] sArr = s.split(" ");
            arr = new int[n];
            for (int j = 0; j < n; j++) { // 배열 만들기
                arr[j] = Integer.parseInt(sArr[j]);
            }

            answer = 0;
            max(0);
            System.out.println("#" + (i+1) + " " + answer);
        }
    }

    static void max(int start) {
        // 가장 큰 값 찾기
        int max = 0;
        int idx = 0;
        for (int i = start; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }

        // 가장 큰값까지 사고 팔기
        long res = 0;
        int cnt = 0;
        for (int i = start; i < idx; i++) {
            res += arr[i];
            cnt++;
        }

        answer += (max * cnt) - res;

        if (idx == n-1) { // 종료 코드
            return;
        }
        max(idx+1);
    }
}
