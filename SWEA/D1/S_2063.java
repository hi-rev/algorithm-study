import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S_2063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] arr = s.split(" ");
        int[] arrInt = new int[n];
        for (int i = 0; i < n; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(arrInt);
        int idx = n / 2;
        System.out.println(arrInt[idx]);
    }
}
