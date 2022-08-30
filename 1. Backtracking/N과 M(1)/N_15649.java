import java.util.Scanner;

// N과 M(1)
// 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
// 특정 배열에서 특정 개수를 모두 고른 경우의 수
public class N_15649 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // n 배열 만들기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        int res[] = new int[m];
        boolean[] visited = new boolean[n];

        perm(arr, res, visited, 0, n, m);
    }
    public static void perm(int[] arr, int[] res, boolean[] visited, int depth, int n, int m) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                res[depth] = arr[i];
                perm(arr, res, visited, depth + 1, n, m);
                visited[i] = false;
            }
        }
    }
}
