import java.util.Scanner;

public class N_10773 {
    static int[] stack;
    static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        stack = new int[k];
        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            if (n == 0) {
                pop();
            } else {
                push(n);
            }
        }

        int res = 0;
        for (int i = 0; i < k; i++) {
            res += stack[i];
        }
        System.out.println(res);
    }
    public static void pop() {
        stack[cnt-1] = 0;
        cnt--;
    }

    public static void push(int item) {
        stack[cnt] = item;
        cnt++;
    }
}
