import java.util.Scanner;

public class N_10986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 전체 날짜 수
        int k = sc.nextInt(); // 연속적인 날짜 수

        // 온도 배열
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(temp));
        int idx;
        int[] res = new int[n-(k-1)];
        for (int i = 0; i < n-(k-1); i++) {
            idx = i;
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += temp[idx];
                idx++;
            }
            res[i] = sum;
        }
//        System.out.println(Arrays.toString(res));
        int max = res[0];
        for (int i = 1; i < res.length; i++) {
            if (res[i] > max) {
                max = res[i];
            }
        }
        System.out.println(max);
    }
}
