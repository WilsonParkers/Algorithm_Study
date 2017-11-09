package samsung_Level1;

import java.util.Scanner;

public class Samsung_Level1_division {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int a, b, c, d = 0;
		String str = "";
		for(int i=0; i<num; i++){
			a = sc.nextInt();						// 나눠지는 놈
			b = sc.nextInt();						// 나눌 놈
			str = "#" + (i+1) + " ";				// 출력 형식
			c = a/b;								// 몫
			d = a%b;								// 나머지
			System.out.println(str + c + " " + d);
		}
	}
}
