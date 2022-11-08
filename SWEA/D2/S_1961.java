import java.util.Scanner;

public class S_1961 {
    // 숫자 배열 회전
    static int[][] arr;
    static int n;
    static int[][] newArr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) { // test case
            n = sc.nextInt();
            arr = new int[n][n]; // n X n 행렬
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }
            int[][] init;
            init = arr;

            int idx = 0;
            System.out.println("#" + (i+1));
            // NX3번씩 회전시켜 출력해야함
            for (int j = 0; j < n; j++) {
                // 초기화 후 다시 회전시키기
                arr = init;
                for (int k = 0; k < 3; k++) {
                    // 새로운 배열에 회전값 저장하기
                    // 기존 배열에 덧씌우면 값이 맞지 않음
                    newArr = new int[n][n];
                    rotation(newArr);

                    for (int l = 0; l < n; l++) {
                        // 인덱스 0부터 한줄씩 출력한다.
                        System.out.print(newArr[idx][l]);
                    }
                    System.out.print(" ");
                    arr = newArr;
                }
                idx++;
                System.out.println();
            }


        }
    }

    // 회전시켜주는 함수
    static void rotation(int[][] newArr) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newArr[i][j] = arr[n-j-1][i];
            }
        }
    }
}
