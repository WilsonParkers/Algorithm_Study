import java.util.Scanner;

public class SWExpert_2001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  테스트 케이스, 배열 크기, 파리채 크기, 파리채 사이즈, 결과 값
        int t = sc.nextInt(), s, m, d, r;
        for (int i = 1; i <= t; i++) {
            s = sc.nextInt();
            m = sc.nextInt() - 1;
            r = 0;
            int[][] is = new int[s][s]; // 배열 생성
            for (int j = 0; j < s; j++)
                for (int k = 0; k < s; k++) {
                    is[j][k] = sc.nextInt();
                    d = 0;
                    if (j >= m && k >= m) { // 배열을 만들면서 파리채 크기 이상 커졌을 경우 부터 최대값을 구한다
                        for (int j2 = j; j2 >= j - m; j2--)
                            for (int k2 = k; k2 >= k - m; k2--)
                                d += is[j2][k2];
                    }
                    r = r > d ? r : d;
                }
            System.out.printf("#%d %d\n", i, r);
        }
    }
}