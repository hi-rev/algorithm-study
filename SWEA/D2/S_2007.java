import java.util.Scanner;

public class S_2007 {
    // 패턴 마디의 길이
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String s = sc.next();
            for (int j = 1; j < s.length(); j++) {
                String a = s.substring(0, j);
                String b = s.substring(j, j+j);
                if (a.equals(b)) {
                    System.out.println("#" + (i+1) + " " + j);
                    break;
                }
            }
        }
    }
}
