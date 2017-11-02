package samsung_Level1;

import java.util.Scanner;

public class Samsung_Level1_divisor {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print(1 + " ");				// 자기자신 나눔
		for(int i=num/2; i>=1; i--){			// 절반에서부터 비교
			if(num%i == 0){
				System.out.print(num/i + " ");
			}
		}
	}
}
