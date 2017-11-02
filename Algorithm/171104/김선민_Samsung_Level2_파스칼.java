package samsung_Level2;

import java.util.Scanner;

public class Samsung_Level2_파스칼 {
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < num; i++) {
            System.out.println("#" + (i+1));					// 출력 형식
            int pascal = sc.nextInt();
            int[][] result = new int[pascal][pascal];			// 파스칼모양만들 배열
            for (int j = 0; j < pascal; j++) {
                for (int k = 0; k <= j; k++) {
                    if (k == 0 || k == j) {						// 시작과 끝은 1
                        result[j][k] = 1;
                        System.out.print(result[j][k] + " ");
                    } else {									// 파스칼 공식
                        result[j][k] = result[j - 1][k - 1] + result[j - 1][k];
                        System.out.print(result[j][k] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
