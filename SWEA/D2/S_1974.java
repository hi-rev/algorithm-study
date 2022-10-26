import java.util.Scanner;

public class S_1974 {
    static int[][] sudoku;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // test case

        for (int i = 0; i < t; i++) {
            // 스도쿠 배열 입력받기
            sudoku = new int[9][9];
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    sudoku[j][k] = sc.nextInt();
                }
            }
            System.out.println("#" + (i+1) + " " + solve());
        }
    }
    static int solve() {
        // 가로 배열마다 중복 확인하기
        for (int j = 0; j < 9; j++) {
            int[] test = new int[10];
            for (int k = 0; k < 9; k++) {
                test[sudoku[j][k]]++;
            }
            for (int i = 1; i <= 9; i++) {
                if (test[i] != 1) {
                    return 0;
                }
            }
        }

        // 세로 배열마다 중복 확인하기
        for (int i = 0; i < 9; i++) {
            int[] test = new int[10];
            for (int j = 0; j < 9; j++) {
                test[sudoku[j][i]]++;
            }
            for (int j = 1; j <= 9; j++) {
                if (test[j] != 1) {
                    return 0;
                }
            }
        }

        // 구간마다 중복 확인하기
        int one = 0;
        int two = 0;
        for (int i = 0; i < 9; i++) {
            int[] test = new int[10];
            for (int j = one; j < one+3; j++) {
                for (int k = two; k < two+3; k++) {
                    test[sudoku[j][k]]++;
                }
            }
            if (i < 2) {
                two += 3;
            } else if (i == 2) {
                two = 0;
            } else if (i < 5) {
                one = 3;
                two += 3;
            } else if (i == 5) {
                two = 0;
            } else {
                one = 6;
                two += 3;
            }
            for (int j = 1; j <= 9; j++) {
                if (test[j] != 1) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
