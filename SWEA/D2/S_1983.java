import java.util.Scanner;

public class S_1983 {
    // 조교의 성적 매기기
    static double[] exam;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] score = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
        for (int i = 0; i < t; i++) { // test case
            int n = sc.nextInt(); // 학생 수
            int k = sc.nextInt(); // 학점을 알고 싶은 학생의 번호
            exam = new double[n];
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt(); // 중간고사
                int b = sc.nextInt(); // 기말고사
                int c = sc.nextInt(); // 과제

                exam[j] = (a*0.35 + b*0.45 + c*0.2);
            }
            System.out.println("#" + (i+1) + " " + score[solve(k) / (n/10)]);
        }
    }
    static int solve(int k) {
        int cnt = 0;
        for (int i = 0; i < exam.length; i++) {
            if (exam[i] > exam[k-1]) {
                cnt++;
            }
        }
        return cnt;
    }
}
