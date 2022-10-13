import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_18258 {
    static int[] queue;
    static int front = 0;
    static int back = 0;
    static int size = 0;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // 명령의 수
        queue = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push": push(Integer.parseInt(st.nextToken())); break;
                case "pop": pop(); break;
                case "size": size(); break;
                case "empty": empty(); break;
                case "front": front(); break;
                case "back": back(); break;
            }
        }
        System.out.println(sb);
    }
    static void push(int num) {
        queue[back] = num; // 큐 배열에 값 넣기
        back++;
        size++;
    }

    static void pop() {
        if (size == 0) {
            sb.append(-1).append("\n");
        } else {
            sb.append(queue[front]).append("\n");
            queue[front] = 0;
            front++;
            size--;
        }
    }

    static void size() {
        sb.append(size).append("\n");
    }

    static void empty() {
        if (size == 0) {
            sb.append(1).append("\n");
        } else {
            sb.append(0).append("\n");
        }
    }

    static void front() {
        if (size == 0) {
            sb.append(-1).append("\n");
        } else {
            sb.append(queue[front]).append("\n");
        }
    }

    static void back() {
        if (size == 0) {
            sb.append(-1).append("\n");
        } else {
            sb.append(queue[back-1]).append("\n");
        }
    }
}
