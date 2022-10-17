import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_2068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // test case

        for (int i = 0; i < t; i++) {
            int max = 0;
            String s = br.readLine();
            String[] arr = s.split(" ");

            for (int j = 0; j < 10; j++) {
                int n = Integer.parseInt(arr[j]);
                if (n > max) {
                    max = n;
                }
            }
            System.out.println("#" + (i+1) + " " + max);
        }
    }
}
