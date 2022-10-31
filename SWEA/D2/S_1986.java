import java.util.Scanner;

public class S_1986 {
    // 지그재그 숫자
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int res = 0;

            for (int j = 1; j <= n; j++) {
                if (j % 2 != 0) {
                    res += j;
                } else {
                    res -= j;
                }
            }
            System.out.println("#" + (i+1) + " " + res);
        }
    }
}
