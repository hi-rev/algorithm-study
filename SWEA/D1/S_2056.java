import java.util.Arrays;
import java.util.Scanner;

public class S_2056 {
    static int[] ymdArr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // test case

        for (int i = 0; i < t; i++) {

            String ymd = sc.next();

            ymdArr = new int[3];
            ymdArr[0] = Integer.parseInt(ymd.substring(0, 4));
            ymdArr[1] = Integer.parseInt(ymd.substring(4, 6));
            ymdArr[2] = Integer.parseInt(ymd.substring(6, 8));

            System.out.println("#" + (i+1) + " " + solve(ymd));

        }
    }

    static String solve(String ymd) {

        String res = ymd.substring(0, 4) + "/" + ymd.substring(4, 6) + "/" + ymd.substring(6, 8);

        if (ymdArr[1] >= 1 && ymdArr[1] <= 12) {

            if (ymdArr[1] == 2) {
                if (ymdArr[2] >= 1 && ymdArr[2] <= 28) {
                    return res;
                } else {
                    return "-1";
                }

            } else if (ymdArr[1] == 4 || ymdArr[1] == 6 || ymdArr[1] == 9 || ymdArr[1] == 11) {

                if (ymdArr[2] >= 1 && ymdArr[2] <= 30) {
                    return res;
                } else {
                    return "-1";
                }

            } else {

                if (ymdArr[2] >= 1 && ymdArr[2] <= 31) {
                    return res;
                } else {
                    return "-1";
                }

            }
        } else {
            return "-1";
        }
    }
}
