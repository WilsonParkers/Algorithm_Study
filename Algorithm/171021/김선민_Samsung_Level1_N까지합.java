package samsung_Level1;

import java.util.Scanner;

public class Samsung_Level1_Nplus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num*(num+1)/2);		// 1~n까지 합
	}
}
