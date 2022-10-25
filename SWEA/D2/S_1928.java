import java.util.Base64;
import java.util.Scanner;

public class S_1928 {
    // Base64 Decoder
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {  // test case
            String s = sc.next();
            String res = new String(Base64.getDecoder().decode(s));

            System.out.println("#" + (i+1) + " " + res);
        }
    }
}
