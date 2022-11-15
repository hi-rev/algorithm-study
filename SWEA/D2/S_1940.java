import java.util.Scanner;

public class S_1940 {
    // 가랏! RC카!
    static int nSpeed;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int speed = 0; // 현재 속도를 나타내는 변수
            int distance = 0;

            for (int j = 0; j < n; j++) {
                int s = sc.nextInt(); // 가속 또는 감속
                if (s != 0) {
                    nSpeed = sc.nextInt();
                }

                switch (s) {
                    case 0: // 현재 속도 유지
                        distance += speed;
                        break;
                    case 1: // 가속
                        speed += nSpeed;
                        distance += speed;
                        break;
                    case 2: // 감속
                        if (speed < nSpeed) {
                            speed = 0;
                        } else {
                            speed -= nSpeed;
                            distance += speed;
                        }
                        break;
                }
            }
            System.out.println("#" + (i+1) + " " + distance);
        }
    }
}
