import java.util.Scanner;

// 재귀 호출에 비해 동적 계획법이 얼마나 빠른지 알아봅시다.
// n의 피보나치 수 구하기
// 피보나치 수란? 첫째 및 둘째 항이 1이며 그 뒤 모든 항은 바로 앞 두 항의 합인 수열
public class N_24416 {
    static int cnt1 = 0;
    static int cnt2 = 0;
    static int[] f;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f = new int[n];

        fib(n);
        fibonacci(n);
        System.out.println(cnt1);
        System.out.println(cnt2);
    }

    // 피보나치 수 재귀
    static int fib(int n) {
        if (n == 1 || n == 2) {
            cnt1++;
            return 1;
        }
        return (fib(n - 1) + fib(n - 2));
    }

    // 피보나치 수 DP(동적 프로그래밍)
    // 동적 계획법에서는 반복되는 계산을 막기 위해 이전에 계산했던 내용을 배열에 저장한다.
    // 대표적으로는 top-down과 bottom-up이 있다고 한다.
    static int fibonacci(int n) {
        f[0] = 1;
        f[1] = 1;

        for (int i = 2; i < n; i++) {
            cnt2++;
            f[i] = f[i-2] + f[i-1];
        }
        return f[n-1];
    }
}
