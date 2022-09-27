import java.util.Arrays;
import java.util.Scanner;

public class N_11047 {
    public static void main(String[] args) {
        // n개의 동전 중 골라서 그 가치의 합을 k로 만들려고 한다.
        // 필요한 동전 개수의 최솟값을 구하기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] price = new int[n]; // 금액별 배열(오름차순)
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

//        System.out.println(Arrays.toString(price));
        int idx = 0;
        while (price[idx] <= k) {
            idx++; // 입력받은 금액 k보다 작은 인덱스가 몇 번째 인덱스까지인지 구함

            if (idx == n) break; // 배열의 개수인 n이 될 때까지만 탐색한다. 인덱스아웃 방지
        }
//        System.out.println(idx);

        int res = 0;
        for (int i = idx-1; i >= 0; i--) { // 인덱스 idx-1부터 0까지
            if (k >= price[i]) {
                int m = k / price[i]; // 몫을 m에 저장
                res += m; // 여기서 구한 몫은 res(동전의 개수)에 추가해준다.
                k -= (m*price[i]); // 구한 값을 제외하고 남은 값 다시 k에 저장
            }
        }
        System.out.println(res);
    }
}
