import java.util.Scanner;

public class S_2058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;

        // 각 자리수 나누는 연산
        while (n > 0) {
            res += n % 10;
            n /= 10;
        }

        System.out.println(res);
    }
}
