import java.util.Scanner;

public class S_1946 {
    // 간단한 압축 풀기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) { // test case
            int n = sc.nextInt();
            String[] cArr = new String[n];
            int[] kArr = new int[n];
            for (int j = 0; j < n; j++) { // input
                cArr[j] = sc.next(); // 알파벳
                kArr[j] = sc.nextInt(); // 연속된 개수
            }

            System.out.println("#" + (i+1));
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < kArr[j]; k++) {
                    if (cnt == 10) { // 카운트가 10에 도달하면 초기화하고 줄바꾸기
                        cnt = 0;
                        System.out.println();
                    }
                    System.out.print(cArr[j]);
                    cnt++;
                }
            }
            // test case 할 때 개행이 잘 되었는지 최소 2개는 넣어보도록 하자.
            System.out.println();
        }
    }
}
