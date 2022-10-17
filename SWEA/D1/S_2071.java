import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_2071 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // test case

        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            String[] arr = s.split(" ");
            int res = 0;

            for (int j = 0; j < 10; j++) {
                res += Integer.parseInt(arr[j]);
            }
            System.out.printf("#" + (i+1) + " " + Math.round(res/10.0));
            System.out.println();
        }
    }
}
