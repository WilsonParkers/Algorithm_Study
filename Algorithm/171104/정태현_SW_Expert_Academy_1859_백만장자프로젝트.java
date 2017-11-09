import java.util.Scanner;

public class SWExpert_1859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1, t = sc.nextInt(); i <= t; i++) {    // t 는 테스트 케이스 수
            int d = sc.nextInt();                           // d = 예측 날짜 수
            long b = 0;                                     // b 는 이득 ( 결과가 int 의 크기를 넘어서기 때문에 long 으로 할당)
            int[] is = new int[d];
            for (int j = 0; j < d; j++)                     // 초기 데이터 생성
                is[j] = sc.nextInt();
            for (int j = d - 1, m = is[j]; j > 0; j--) {    // j = 뒤에서 부터 실행, m = 최대 초기 값
                if (m > is[j - 1])                          // m 이 전 날 가격보다 비살 때
                    b += m - is[j - 1];                     // 이득에 최대값 - 전 날 가격 을 더한다
                else
                    m = is[j - 1];                          // 그렇지 않을 경우 m 을 바꾸고 다시 for 를 돌린다
            }
            System.out.printf("#%d %d\n", i, b);
        }
    }
}