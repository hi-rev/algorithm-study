import java.util.Scanner;

public class S_1970 {
    // 쉬운 거스름돈
    public static void main(String[] args) {
        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) { // test case
            int n = sc.nextInt();
            System.out.println("#" + (i+1));

            for (int j = 0; j < money.length; j++) {
                System.out.print(n / money[j] + " ");
                n %= money[j];
            }
            System.out.println();
        }
    }
}
