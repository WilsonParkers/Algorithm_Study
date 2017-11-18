package algorithm.SwExpertAcademy.D2;

import java.util.Scanner;

public class SWExpert_1970 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 원 지폐 배열
        int[] won = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        for (int i = 1, t = sc.nextInt(); i <= t; i++) {
            String result = "#" + i + '\n';
            // 거스름돈을 구할 금액
            int money = sc.nextInt();
            // 원 배열을 각각의 원소 마다 반복
            for (int w : won) {
                // result 에 금액/원 을 추가
                result += money / w + " ";
                // 남은 금액을 나타냅니다. 남은 금액 = 금액/원*원
                money -= money / w * w;
            }
            System.out.print(result + '\n');
        }
    }
}
