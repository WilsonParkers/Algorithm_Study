package samsung_Level1;

import java.util.Scanner;

public class Samsung_Level1_double {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = "";
		for(int i=0; i<=num; i++){
			str = str + (int)(Math.pow(2, i)) + " ";	// 제곱근 
		}
		System.out.println(str);
	}
}
