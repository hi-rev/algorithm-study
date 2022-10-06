import java.util.Scanner;

public class N_10828 {
    static int[] stack; // 스택
    static int cnt = 0;
    public static void main(String[] args) {
        // 정수를 저장하는 스택 구현하기
        // push, pop, size, empty, top
        Scanner sc = new Scanner(System.in);
        // StringBuilder를 사용해서 출력할 문자를 모아서 한꺼번에 출력하기!
        // -> 매번 System.out.println()을 해주면 시간초과가 남
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt(); // 명령의 수
        stack = new int[n];

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            switch (s) {
                case "push":
                    push(sc.nextInt());
                    break;

                case "pop":
                    sb.append(pop()).append("\n");
                    break;

                case "size":
                    sb.append(size()).append("\n");
                    break;

                case "empty":
                    sb.append(empty()).append("\n");
                    break;

                case "top":
                    sb.append(top()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int n) {
        stack[cnt] = n;
        cnt++;
    }

    public static int pop() {
        if (cnt == 0) {
            return -1;
        } else {
            int res = stack[cnt-1];
            stack[cnt-1] = 0;
            cnt--;
            return res;
        }
    }

    public static int size() {
        return cnt;
    }

    public static int empty() {
        if (cnt == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int top() {
        if (cnt == 0) {
            return -1;
        } else {
            return stack[cnt-1];
        }
    }
}
