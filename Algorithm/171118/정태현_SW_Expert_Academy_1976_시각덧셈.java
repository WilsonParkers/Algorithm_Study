package algorithm.SwExpertAcademy.D2;

import java.util.Scanner;

public class SWExpert_1976 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Test Case, minute + minute
        int t = sc.nextInt(), mm;
        for (int i = 1; i <= t; i++) {
            // 시 분 시 분 으로 배열을 만듭니다
            int[] time = new int[4];
            for (int j = 0; j < 4; j++)
                time[j] = sc.nextInt();
            // 분 두개를 더한 값을 저장 합니다
            mm = time[1] + time[3];
            // tmp = (시 + 시 = 분의합/60)
            // 12시 까지 출력이 되어야 하므로
            // tmp/13 + tmp%13, 분의합%60
            int tmp = time[0] + time[2] + mm / 60;
            System.out.printf("#%d %d %d\n", i, tmp / 13 + tmp % 13, mm % 60);
        }
    }
}