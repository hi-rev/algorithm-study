import java.util.Scanner;

public class N_15650 {

    public static int[] arr;
    public static boolean[] visit;

    public static int N;
    public static int M;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();

        visit = new boolean[N];
        arr = new int[M];

        solution(1, 0);
    }

    public static void solution(int pos, int depth) {

        //깊이가 M과 같아지면 출력
        if (depth == M) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

            //전 상태로 돌아감
            return;
        }

        //현재 위치부터 반복
        for (int i = pos; i <= N; i++) {
            arr[depth] = i;
            solution(i + 1, depth + 1);
        }
    }
}
