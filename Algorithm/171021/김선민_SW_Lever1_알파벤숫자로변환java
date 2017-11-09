package samsung;

import java.util.Scanner;

public class SW_Lever1_MaxNum {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("개수 ");
			int line = Integer.parseInt(sc.nextLine());	// 테스트 개수
			int num=0;																	// 테스트 수

			for(int i=0; i<line; i++){
				int max = 0;															// 최대값
				String result = "#"+ (i+1) +" ";					// 출력 형식
				for(int j=0; j<10; j++){
					System.out.print("수 ");
					num = sc.nextInt();
					max = max > num ? max : num;						// 최대값 찾기
				}
				System.out.println(result + max);
			}
	}
}
