import java.util.Scanner;

public class S_1945 {
    // 간단한 소인수분해
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = {2, 3, 5, 7, 11};
        for (int i = 0; i < t; i++) { // test case
            int n = sc.nextInt();
            int[] res = new int[arr.length];

            for (int j = arr.length - 1; j >= 0; j--) {
                int cnt = 0; // 차수

                while (n % arr[j] == 0) {
                    n /= arr[j]; // 더 이상 정수로 나눌 수 없을 때 까지 나눠줌
                    cnt++; // 차수 증가
                }
                res[j] = cnt;
            }

            System.out.print("#" + (i+1) + " ");
            for (int j = 0; j < res.length; j++) {
                System.out.print(res[j] + " ");
            }
            System.out.println();
        }
    }
}
