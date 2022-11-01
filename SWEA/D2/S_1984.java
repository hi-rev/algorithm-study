import java.util.Scanner;

public class S_1984 {
    // 중간 평균값 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) { // test case
            int[] arr = new int[10];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }

            // 최대값 찾기
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < 10; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            // 최솟값 찾기
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < 10; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                }
            }

            // max, min 값 제외한 값 합산
            double res = 0.0;
            for (int j = 0; j < 10; j++) {
                if (arr[j] == max || arr[j] == min) {
                    res += 0;
                } else {
                    res += arr[j];
                }
            }
            System.out.println("#" + (i+1) + " " + Math.round(res/8));
        }
    }
}
