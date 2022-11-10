import java.util.Scanner;

public class S_1948 {
    // 날짜 계산기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < t; i++) { // test case
            int m1 = sc.nextInt();
            int d1 = sc.nextInt();
            int m2 = sc.nextInt();
            int d2 = sc.nextInt();

            int res = 0;
            for (int j = m1-1; j < m2-1; j++) {
                res += date[j];
            }
            res = res + d2 - d1 + 1;
            System.out.println("#" + (i+1) + " " + res);
        }
    }
}
