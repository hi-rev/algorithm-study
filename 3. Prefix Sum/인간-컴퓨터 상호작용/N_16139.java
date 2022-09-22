import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N_16139 {
    public static void main(String[] args) throws IOException {
        // 문자열의 길이와 질문의 수가 제한 없을 경우 ?
        // 질문할 때마다 매번 문자열을 탐색한다면 오래 걸리므로, 누적합을 이용하여 구간개수를 계산한다.
        // 한 문자에서 알파벳 26문자에 대해 누적 횟수를 기록한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine(); // 탐색할 문자열
        int q = Integer.parseInt(br.readLine());

        // 누적합 저장 배열 prefix
        int[][] prefix = new int[s.length()][26];
        prefix[0][s.charAt(0) - 'a']++;
//        System.out.println(Arrays.deepToString(prefix));
        for (int i = 1; i < s.length(); i++) {
            int tmp = s.charAt(i)-'a';
            for (int j = 0; j < 26; j++) {
                prefix[i][j] = prefix[i-1][j];
            }
            prefix[i][tmp]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char find = st.nextToken().charAt(0);
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            if (l == 0) {
                sb.append(prefix[r][find - 'a']).append('\n');
            } else {
                sb.append(prefix[r][find - 'a'] - prefix[l - 1][find - 'a']).append('\n');
            }
        }
        System.out.println(sb);
    }
}
