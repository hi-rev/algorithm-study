import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 최빈수 구하기
public class S_1204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // test case

        for (int i = 0; i < t; i++) {
            int[] score = new int[101];

            int n = Integer.parseInt(br.readLine()); // test case number
            String s = br.readLine();
            String[] stu = s.split(" ");

            // 점수 인덱스에 ++
            for (int j = 0; j < stu.length; j++) {
                score[Integer.parseInt(stu[j])]++;
            }

            // 최빈값 구하기
            int max = 0;
            int res = 0;
            for (int j = 0; j < score.length; j++) {
                if (score[j] >= max) {
                    max = score[j];
                    res = j;
                }
            }
            System.out.println("#" + n + " " + res);
        }
    }
}
