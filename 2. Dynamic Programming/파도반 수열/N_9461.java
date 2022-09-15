import java.util.Scanner;

public class N_9461 {
    // 답이 int 범위를 넘어가기 때문에 long으로 만들어주어야 한다.
    // int의 범위는 약 21억까지이다.
    // 해당 문제에서 n의 최댓값인 100으로 계산하면 결과값이 약 8888억이 나온다.
    // 따라서 long 사용하여야 정답
    static long[] f;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            f = new long[n];

            if (n <= 3) {
                System.out.println(1);
            } else if (n <= 5) {
                System.out.println(2);
            } else {
                System.out.println(triangle(n));
            }
        }
    }
    static long triangle(int n) {
        f[0] = 1; f[1] = 1; f[2] = 1;
        f[3] = 2; f[4] = 2;
        for (int i = 5; i < n; i++) {
            f[i] = f[i-1] + f[i-5]; // 점화식
        }
        return f[n-1];
    }
}
