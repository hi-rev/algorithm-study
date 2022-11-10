import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S_1954 {
    // 달팽이 숫자
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        // 우, 하, 좌, 상 순서로 방향 배열 만들기
        int dx[] = {0, 1, 0, -1};
        int dy[] = {1, 0, -1, 0};

        for (int i = 0; i < t; i++) { // test case
            int n = Integer.parseInt(br.readLine());

            int[][] arr = new int[n][n];
            boolean visited[][] = new boolean[n][n];

            // 빈칸 모두 채우기
            int dir = 0; // 방향
            int x = 0;
            int y = 0;
            for (int j = 1; j <= n*n; j++) {
                arr[x][y] = j;
                visited[x][y] = true;

                // 다음칸 갈 수 있는지 확인하기
                int nextX = x + dx[dir];
                int nextY = y + dy[dir];

                if (nextX >= n || nextY >= n || nextX < 0 || nextY < 0 || visited[nextX][nextY]) {
                    dir = (dir+1)%4;
                }

                x = x + dx[dir];
                y = y + dy[dir];
            }
            System.out.println("#" + (i+1));
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(arr[j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
