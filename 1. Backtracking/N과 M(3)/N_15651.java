import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// N과 M (3)
// 모든 수열의 경우의 수
public class N_15651 {
    // BufferedWriter는 전역함수로 선언해주자.
    // seq()안에서 선언하여 사용할 경우 함수가 돌 때마다 flush()를 해줘야 하기 때문에
    // BufferedWriter의 빠른 강점을 십분 발휘 할 수 없다.
    // 따라서 모든 seq() 함수가 끝난 후 main문에서 flush와 close를 진행해주자.
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        int[] res = new int[m];
        seq(arr, res, 0, n, m);
        bw.flush();
        bw.close();
    }
    static void seq(int[] arr, int[] res, int depth, int n, int m) throws IOException {
        if (m == 0) {
            for (int i = 0; i < res.length; i++) {
                bw.write(res[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            // 순열이 차례로 돌아야하기 때문에
            // 따로 방문 여부를 확인할 필요가 없다.
            res[depth] = arr[i];
            seq(arr, res, depth + 1, n, m-1);
        }
    }
}
