import java.util.Scanner;

// 재귀 호출에 비해 동적 계획법이 얼마나 빠른지 알아봅시다.
// n의 피보나치 수 구하기
// 피보나치 수란? 첫째 및 둘째 항이 1이며 그 뒤 모든 항은 바로 앞 두 항의 합인 수열
public class N_24416 {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int[] f = new int[n];
    static int cnt1 = 0;
    static int cnt2 = 0;
    public static void main(String[] args) {
        fib(n);
        fibonacci(n);
        System.out.print(cnt1 + " ");
        System.out.println(cnt2);
    }

    // 피보나치 수 재귀
    static int fib(int n) {
        cnt1++;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

    // 피보나치 수 DP(동적 프로그래밍)
    // 동적 계획법에서는 반복되는 계산을 막기 위해 이전에 계산했던 내용을 배열에 저장한다.
    // 대표적으로는 top-down과 bottom-up이 있다고 한다.
    static int fibonacci(int n) {
        cnt2++;
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < n; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}
