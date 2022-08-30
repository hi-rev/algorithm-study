import java.util.Scanner;
// N과 M(1)
// 중복 없이 배열 경우의 수 구하기
public class N_15650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 1부터 N까지 순열 배열 생성
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        // 방문 값 생성
        boolean[] visited = new boolean[n];

        noDup(arr, visited, 0, n, m);
    }

    static void noDup(int[] arr, boolean[] visited, int start, int n, int m) {
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    System.out.print((i+1) + " ");
                }
            }
            System.out.println();
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            noDup(arr, visited, i + 1, n, m - 1);
            visited[i] = false;
        }
    }
}
