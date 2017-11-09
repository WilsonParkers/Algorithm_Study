import java.util.Scanner;

public class SWExpert_1984 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1, t = sc.nextInt(); i <= t; i++) {
            double j = 0, n, mx = 0, mn = 10000, r = 0;
            while (j < 10) {
                n = sc.nextInt();
                mx = mx < n ? n : mx;   // 최대값
                mn = mn < n ? mn : n;   // 최소값
                r += n;
                j++;
            }
            // 총 합에 최대값, 최소값을 뺀 값의 평균을 구합니다
            System.out.println("#" + i + ' ' + Math.round((r-mx-mn)/8));
        }
    }
}
