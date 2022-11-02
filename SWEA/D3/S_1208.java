import java.util.Arrays;
import java.util.Scanner;

public class S_1208 {
    public static void main(String[] args) {
        // 1. 정렬을 수행한다.
        // 2. 맨 앞의 값은 +1, 맨뒤값은 -1 연산을 수행
        Scanner sc = new Scanner(System.in);
        int t = 10;
        int n = 100;
        for (int i = 0; i < t; i++) {
            int dump = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) { // 입력 받기
                arr[j] = sc.nextInt();
            }

            for (int j = 0; j < dump; j++) {
                Arrays.sort(arr);
                arr[0]++;
                arr[99]--;
            }
            Arrays.sort(arr);
            System.out.println("#" + (i+1) + " " + (arr[99] - arr[0]));
        }
    }
}

// test case 9/10
// 3번 오답
//public class S_1208 {
//    // Flatten
//    static int cnt;
//    static int n;
//    static int res;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 10; i++) {
//            n = sc.nextInt(); // 덤프 횟수
//
//            int[] arr = new int[100];
//            for (int j = 0; j < 100; j++) {
//                arr[j] = sc.nextInt();
//            }
//
//            cnt = 0;
//            res = 0;
//            change(arr);
//            System.out.println("#" + (i+1) + " " + res);
//        }
//    }
//
//    static int maxNum(int[] arr) {
//        int max = 0;
//        int maxIdx = 0;
//        for (int i = 0; i < 100; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//                maxIdx = i;
//            }
//        }
//        return maxIdx;
//    }
//
//    static int minNum(int[] arr) {
//        int min = Integer.MAX_VALUE;
//        int minIdx = 0;
//        for (int i = 0; i < 100; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//                minIdx = i;
//            }
//        }
//        return minIdx;
//    }
//
//    static void change(int[] arr) {
//        if (cnt == n+1) {
//            res = arr[maxNum(arr)] - arr[minNum(arr)];
//            return;
//        }
//        arr[maxNum(arr)]--;
//        arr[minNum(arr)]++;
//        cnt++;
//
//        change(arr);
//    }
//}
