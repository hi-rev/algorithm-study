import java.util.Scanner;

public class S_1976 {
    // 시각 덧셈
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) { // test case
            int h = sc.nextInt();
            int m = sc.nextInt();
            h += sc.nextInt();
            m += sc.nextInt();

            h += (m/60);
            m %= 60;

            if (h > 12) h -= 12;

            System.out.println("#" + (i+1) + " " + h + " " + m);
        }
    }
}
