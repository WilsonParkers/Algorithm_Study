import java.util.Scanner;

public class SWExpert_1986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1, t = sc.nextInt(), r = 1; i <= t; i++, r = 1) {
            for (int j = 2, n = sc.nextInt(); j <= n; j++){
                r += j % 2 == 0 ? -j : j;   // 홀수 짝수인지 판별하여 더할지 뺄지 정합니다
            }
            System.out.println("#"+i+" "+r);
        }
    }
}
