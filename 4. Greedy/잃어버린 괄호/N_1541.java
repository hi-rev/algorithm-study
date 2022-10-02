import java.util.Arrays;
import java.util.Scanner;

public class N_1541 {
    // key point : 최대한 많은 값을 덧셈으로 더해서 최대한 큰 수를 빼주어야 한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sub = sc.next().split("-"); // 문자열을 뺄셈으로 분리
//        System.out.println(Arrays.toString(sub));

        int res = 0;
        for (int i = 0; i < sub.length; i++) {
            int temp = 0;
            String[] add = sub[i].split("\\+");
//            System.out.println(Arrays.toString(add));
            for (int j = 0; j < add.length; j++) {
                temp += Integer.parseInt(add[j]);
            }
            if (i == 0) { // 첫번째 값은 무조건 양수이다.
                res = temp;
            } else {
                res -= temp;
            }
        }
        System.out.println(res);
    }
}
