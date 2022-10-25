import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_1206 {
    static int[] height;
    // View
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) { // test case

            int n = Integer.parseInt(br.readLine()); // 건물의 개수
            String s = br.readLine();
            String[] arr = s.split(" "); // 건물 높이 배열
            height = new int[n];
            for (int j = 0; j < n; j++) {
                height[j] = Integer.parseInt(arr[j]);
            }

            int res = 0;
            for (int j = 2; j < n - 2; j++) {
                res += view(j);
            }
            System.out.println("#" + (i+1) + " " + res);
        }
    }

    static int view(int i) {
        int a = height[i-2];
        int b = height[i-1];
        int c = height[i+1];
        int d = height[i+2];

        if (height[i] <= a || height[i] <= b || height[i] <= c || height[i] <= d) {
            return 0;
        }

        int max = Math.max(Math.max(Math.max(a, b), c), d);
        return height[i] - max;

    }
}
