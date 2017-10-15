package week5;

import java.util.Scanner;

public class Samsung_2071 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		double sum = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 10; j++) {
				int score = sc.nextInt();
				sum += score;
				
			}
			System.out.println("#"+(i+1)+ " "+(int)(Math.round(sum/10)));
			sum=0;
		}
	}
}
