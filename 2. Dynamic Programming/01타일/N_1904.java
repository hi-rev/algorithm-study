import java.util.Scanner;
// 00과 1로 구성된 이진타일 만들기
public class N_1904 {
    static int[] f;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f = new int[n+1];

        System.out.println(fib(n));
    }

    static int fib(int n) {
        f[0] = 1;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            // 연산의 분배법칙이 성립하기 때문에,
            // 배열에 저장할 때마다 나눠준다.
            f[i] = (f[i-1] + f[i-2]) % 15746;
        }
        return f[n];
    }
}
