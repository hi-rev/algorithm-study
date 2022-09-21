import java.util.Scanner;

public class N_16139 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // 알파벳 소문자
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
//        System.out.println(Arrays.toString(arr));

        int q = sc.nextInt(); // 질문의 수
        for (int i = 0; i < q; i++) {
            char a = sc.next().charAt(0);
            int l = sc.nextInt(); // l부터
            int r = sc.nextInt(); // r까지

            int cnt = 0;
            for (int j = l; j < r+1; j++) {
                if (arr[j] == a) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
