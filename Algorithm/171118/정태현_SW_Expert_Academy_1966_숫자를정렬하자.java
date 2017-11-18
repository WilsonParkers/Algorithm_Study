package algorithm.SwExpertAcademy.D2;

import java.util.Scanner;

public class SWExpert_1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1, t = sc.nextInt(); i <= t; i++) {
            String result = "#" + i;
            // 숫자들을 넣을 배열
            int[] is = new int[sc.nextInt()];
            // 배열에 값을 넣습니다
            for (int j = 0; j < is.length; j++)
                is[j] = sc.nextInt();
            // 오름차순으로 정렬합니다
            for (int j = 0; j < is.length; j++) {
                int min = j, tmp;
                for (int k = j + 1; k < is.length; k++)
                    min = is[min] > is[k] ? k : min;
                tmp = is[j];
                is[j] = is[min];
                is[min] = tmp;
            }
            // 결과 출력
            for (int j : is)
                result += " " + j;
            System.out.print(result + '\n');
        }
    }
}
