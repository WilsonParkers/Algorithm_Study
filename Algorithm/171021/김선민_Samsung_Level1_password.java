package samsung_Level1;

import java.util.Scanner;

public class Samsung_Level1_password {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int pass = sc.nextInt();				// 비밀번호 입력
		int num = sc.nextInt();					// 테스트 수 입력
		int sum = 0;
		if((pass - num)>=0){
			sum = pass - num + 1;				// 결과
		}else{
			sum = 999 - num + 1 + pass + 1;		// 결과
		}
		System.out.println(sum);
	}
}
