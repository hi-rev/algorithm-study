import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N_1260 {
    // DFS와 BFS
    // 방문할 수 있는 정점이 여러개인 경우 번호가 작은 것부터 방문
    // 간선은 양방향이다.
    static int n;
    static int m;
    static int v;
    static int[][] check;
    static boolean[] checked;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 정점의 개수
        m = Integer.parseInt(st.nextToken()); // 간선의 개수
        v = Integer.parseInt(st.nextToken()); // 간선이 연결하는 두 정점의 번호

        check = new int[1001][1001]; // 좌표와 인덱스값 일치시키기 위해 크기 +1
        checked = new boolean[1001]; // 초기값 False

        // 간선 연결상태 저장
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            check[x][y] = check[y][x] = 1;
        }
        dfs(v); // DFS

        checked = new boolean[1001]; // 초기값 False
        System.out.println();

        bfs();
    }
    // 재귀로 풀기
    static void dfs(int v) { // 시작점을 변수로 받아 확인한다.
        checked[v] = true;
        System.out.print(v + " ");

        for (int i = 1; i <= n; i++) {
            if (check[v][i] == 1 && checked[i] == false) {
                dfs(i);
            }
        }
    }
    // Queue로 풀기
    static void bfs() {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(v); // 큐에 시작점 넣기
        checked[v] = true;
        System.out.print(v + " ");

        // Queue가 빌 때까지 반복한다.
        // 큐에 담아두고 순서대로 돌면서 출력하는 방식
        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int i = 1; i <= n; i++) {
                if (check[temp][i] == 1 && checked[i] == false) {
                    queue.offer(i);
                    checked[i] = true;
                    System.out.print(i + " ");
                }
            }


        }


    }
}
