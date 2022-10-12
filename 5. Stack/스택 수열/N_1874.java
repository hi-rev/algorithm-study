import java.util.Scanner;
import java.util.Stack;

public class N_1874 {
    static Stack<Integer> stack;
    static StringBuilder sb;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();
        int n = sc.nextInt();
        // 구해야할 수열
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solve(n, arr));

    }
    static StringBuilder solve(int n, int[] arr) {
        stack = new Stack<>();
        int end = 0;

        // 스택 초기 상태
        for (int i = 0; i < arr[0]; i++) {
            stack.push(i+1);
            end = i+1; // 마지막으로 push 했던 값 저장
            sb.append("+").append("\n");
        }
        stack.pop();
        sb.append("-").append("\n");


        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i+1]) {
                if (stack.peek() == arr[i+1]) {
                    stack.pop();
                    sb.append("-").append("\n");
                } else {
                    return new StringBuilder("NO");
                }
            } else {
                for (int j = end+1; j <= arr[i+1]; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                    end = j; // 마지막으로 push 했던 값 저장
                }
                stack.pop();
                sb.append("-").append("\n");
            }
        }
        return sb;
    }
}
