import java.util.Scanner;

public class S_1989 {
    // 초심자의 회문 검사
    // "level"과 같이 거꾸로 읽어도 제대로 읽은 것과 같은 문장이나 낱말을 회문이라고 한다.
    static char[] arr;
    static int half;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            arr = s.toCharArray();
            half = s.length() / 2;

            System.out.println("#" + (i+1) + " " + solve());
        }
    }
    static int solve() {
        for (int j = 0; j < half; j++) {
            if (arr[j] != arr[arr.length-1-j]) {
                return 0;
            }
        }
        return 1;
    }
}
