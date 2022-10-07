import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class N_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            String arr[] = s.split("");
            int cnt = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals("(")) {
                    cnt++;
                } else {
                    if (cnt == 0) {
                        cnt = 0;
                    } else {
                        cnt--;
                    }
                }
            }
            if (cnt == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
