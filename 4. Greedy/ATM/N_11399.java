import java.util.Arrays;
import java.util.Scanner;

public class N_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 사람의 수
        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            time[i] = sc.nextInt(); // 각 사람이 돈을 인출하는데 걸리는 시간
        }

        Arrays.sort(time);
//        System.out.println(Arrays.toString(time));
        int[] prefixSum = new int[n];
        prefixSum[0] = time[0];
        // 답은 누적합 배열의 합이다.
        // 따라서 time 배열(정렬값)의 누적합 배열을 구해주었다.
        for (int i = 1; i < n; i++) {
            prefixSum[i] = time[i] + prefixSum[i-1];
        }
//        System.out.println(Arrays.toString(prefixSum));
        int res = 0;
        for (int i = 0; i < prefixSum.length; i++) {
            res += prefixSum[i];
        }
        System.out.println(res);
    }
}
