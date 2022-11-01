import java.util.Scanner;

public class S_2005 {
    // 파스칼의 삼각형
    // -> 자신의 왼쪽과 오른쪽 위의 숫자의 합으로 구성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n+1];
            arr[0][1] = 1;

            for (int j = 1; j < n; j++) {
                for (int k = 1; k < j+2; k++) {
                    arr[j][k] = arr[j-1][k-1] + arr[j-1][k];
                }
            }
            // 정답 출력하기
            System.out.println("#" + (i+1));
            for (int j = 0; j < n; j++) {
                for (int k = 0; k <= n; k++) {
                    if (arr[j][k] != 0) {
                        System.out.print(arr[j][k] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
