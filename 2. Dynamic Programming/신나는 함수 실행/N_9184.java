import java.util.Scanner;

public class N_9184 {
    // 함수 w에서 a, b, c의 값이 20이 넘어가는 일은 없기 때문에 최대 길이인 인덱스 20까지 생성
    static int[][][] dp = new int[21][21][21]; // 배열의 길이는 0부터 20까지
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // a, b, c 반복하여 입력받기
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // 만일 모두 -1이 입력되면 종료
            if (a == -1 && b == -1 && c == -1) {
                break;
            }
            System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, w(a, b, c));
        }
    }

    // 재귀를 수행하며 나오는 값들을 모두 3차원 배열에 저장하도록 한다 : 메모이제이션
    static int w(int a, int b, int c) {

        // a, b, c가 범위를 벗어나지 않으면서 메모이제이션이 되어 있는 경우
        if(inRange(a, b, c) && dp[a][b][c] != 0) {
            return dp[a][b][c]; // 이미 저장되어 있는 값이 있으면 해당 값을 사용한다!
        }

        if(a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }

        if(a > 20 || b > 20 || c > 20) {
            return dp[20][20][20] = w(20, 20, 20);
        }

        if(a < b && b < c) {
            return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        }

        return dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
    }

    // 배열을 참고하려 할 때 a, b, c 중 하나라도 범위 밖의 수가
    // 나올 수 있기 때문에 이를 체크 해주기 위함
    static boolean inRange(int a, int b, int c) {
        return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
    }
}
