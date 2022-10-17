import java.util.Scanner;

public class S_2070 {
    public static void main(String[] args) {
        // 2개의 수를 입력 받아 크기를 비교하여 부등호 출력
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // test case

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b) {
                System.out.println("#" + (i+1) + " >");
            } else if (a < b) {
                System.out.println("#" + (i+1) + " <");
            } else {
                System.out.println("#" + (i+1) + " =");
            }
        }
    }
}
