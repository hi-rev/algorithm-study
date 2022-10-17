import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_2072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // test case

        for (int i = 0; i < t; i++) {
            int res = 0;
            int n = 0;
            String s = br.readLine();
            String[] arr = s.split(" ");

            for (int j = 0; j < 10; j++) {
                n = Integer.parseInt(arr[j]);
                if (n % 2 != 0) { // 홀수일때
                    res += n;
                }
            }
            System.out.printf("#" + (i+1) + " " + res);
            System.out.println();
        }
    }
}
