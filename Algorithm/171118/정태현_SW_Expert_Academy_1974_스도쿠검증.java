package algorithm.SwExpertAcademy.D2;

import java.util.Scanner;

public class SWExpert_1974 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1, t = sc.nextInt(); i <= t; i++) {
            int r = 1, sum = 0;
            int[][] is = new int[9][9];
            // 스도쿠 배열에 값을 넣으면서 행이 알맞는지 체크
            for (int a = 0; a < 9; a++, r = sum != 45 ? 0 : r, sum = 0)
                for (int b = 0; b < 9; b++)
                    sum += is[a][b] = sc.nextInt();
            // 열이 알맞는지 체크
            for (int a = 0; a < 9; a++, r = sum != 45 ? 0 : r, sum = 0)
                for (int b = 0; b < 9; b++)
                    sum += is[b][a];
            // 3X3 이 알맞는지 체크
            for (int y1 = 0; y1 < 7; y1 += 3)
                for (int x1 = 0; x1 < 7; x1 += 3, r = sum != 45 ? 0 : r, sum = 0)
                    for (int y2 = y1; y2 < y1 + 3; y2++)
                        for (int x2 = x1; x2 < x1 + 3; x2++)
                            sum += is[x2][y2];
            System.out.println("#" + i + " " + r);
        }
    }
}
