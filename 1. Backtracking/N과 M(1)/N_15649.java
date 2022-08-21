import java.util.Scanner;

public class N_15649 {

    public static int[] arr;
    public static boolean[] visit;

    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        arr = new int[M]; //
        visit = new boolean[N];

        solution(N, M, 0);
    }

    public static void solution(int N, int M, int depth) {

        // 재귀 깊이가 M과 같아지면 탐색과장에서 담았던 배열을 출력
        // 한 줄 출력됨
        if (depth == M) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {

            //해당 값을 방문하지 않았다면
            if (!visit[i]) {
                visit[i] = true;

                //해당 깊이를 index로 하여 i + 1 값 저장
                arr[depth] = i + 1;

                // 다음 숫자 방문을 위해 depth + 1 후 재귀호출
                solution(N, M, depth + 1);

                // 한 바퀴 다 돌고 출력이 끝나면 방문하지 않은 상태로 변경
                visit[i] = false;
            }
        }
    }
}
