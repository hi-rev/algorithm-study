import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 도시의 개수
        long[] len = new long[n-1]; // 도로의 길이
        String s = br.readLine();
        String[] arr = s.split(" ");
        for (int i = 0; i < n-1; i++) {
            len[i] = Long.parseLong(arr[i]);
        }

        Long[] oil = new Long[n]; // 도시별 기름값
        String s2 = br.readLine();
        String[] arr2 = s2.split(" ");
        for (int i = 0; i < n; i++) {
            oil[i] = Long.parseLong(arr2[i]);
        }
//        System.out.println(Arrays.toString(len));
//        System.out.println(Arrays.toString(oil));

        long cost = 0; // 비용 누적 저장하기
        int idx = 0; // 작은 값의 인덱스 찾기
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (oil[idx] > oil[i] || i == n-1) {
                for (int j = idx; j < idx + cnt; j++) {
                    cost += oil[idx] * len[j];
                }
                cnt = 1;
                idx = i;
            } else {
                cnt++;
            }
        }
        System.out.println(cost);
    }
}
