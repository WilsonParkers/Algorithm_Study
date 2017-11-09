import java.util.Scanner;

public class SWExpert_1979 {
    // 배열 크기, 글자 크기, 글자가 들어갈 수 있는 크기 계산, 들어갈 수 있는 자리 수
    static int n, k, d, c;
    static int[][] is;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1, t = sc.nextInt(); i <= t; i++) {
            n = sc.nextInt();
            k = sc.nextInt();
            d = 0;
            c = 0;
            is = new int[n][n];
            // 배열 데이터 삽입
            for (int a = 0; a < n; a++, d = 0)
                for (int b = 0; b < n; b++)
                    is[a][b] = sc.nextInt();
            check(false);       // 가로 자리 구하기
            check(true);        // 세로 자리 구하기
            System.out.println("#" + i + ' ' + c);
        }
    }

    private static void check(boolean r) {
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                // true : 세로일 경우, false : 가로일 경우
                int i = r ? is[b][a] : is[a][b];
                // 들어갈 자리가 있다면
                if (i == 1)
                    d++;
                // 자리가 없거나 마지막 위치 일 경우
                // 지금까지 축적한 자리에 글자가 들어갈 수 있는지 확인
                if (i == 0 || b == n - 1) {
                    c = d == k ? c + 1 : c;
                    d = 0;
                }
            }
        }
    }
}
