import java.util.Scanner;

// 간단한 369게임
public class S_1926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            clap(i);
        }
    }

    // 박수 몇번 쳐야하는지 검증하기
    static void clap(int n) {
        int num = n;
        int cnt = 0;

        while (num > 0) {
            if ((num % 10) == 3 || (num % 10) == 6 || (num % 10) == 9) {
                cnt++;
            }
            num /= 10;
        }

        if (cnt == 0) {
            System.out.print(n + " ");
        } else {
            for (int i = 0; i < cnt; i++) {
                System.out.print("-");
            }
            System.out.print(" ");
        }
    }
}
