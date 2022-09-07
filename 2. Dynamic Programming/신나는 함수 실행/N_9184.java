import java.util.Scanner;

public class N_9184 {
    // 함수 w에서 a, b, c의 값이 20이 넘어가는 일은 없기 때문에 최대 길이인 인덱스 20까지 생성
    static int[][][] dp = new int[21][21][21]; // 배열의 길이는 0부터 20까지
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }

    static int w(int a, int b, int c) {
        if (a <= 0 || a <= 0 || c <= 0) {
            return 1;
        }

        if (a > 20 || b > 20 || c > 20) {
            w(20, 20, 20);
        }

        if (a < b && b < c) {
            return w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
        }

        return w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
    }
}
