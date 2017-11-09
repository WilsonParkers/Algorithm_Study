package 간단한369게임;

import java.util.Scanner;

class Solution {
	
	
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String result="";
		for(int i=1; i<=T; i++) {
			int x=cnt(i);									//cnt 메서드는 3,6,9의 개수를 반환한다.
			if(x==0) {										//3,6,9 개수가 0개이면 숫자만 스트링에 더 하기
				result+=i+" ";
			}else {
				String v="";
				for(int j=0; j<x; j++) {		//3,6,9 개수만큼 - 추가
					v+="-";
				}
				result+=v+" ";
			}
			
		}
		System.out.println(result);
		
	}

	//N은 10이상 1,000이하의 정수이다. (10 ≤ N ≤ 1,000)
	public static int cnt(int n) {
		int cnt=0;

		//10이하에서는 3으로 나누어떨어지면 무조건 1개 -> 3,6,9
		if(n<10) {
			if(n%3==0) {
				return 1;
			}
		}

		//10이상 100미만
		else if(n<100) {
			String j=String.valueOf(n);

			//두자리수이므로 십의자리, 일의자리 두번 만 체크
			for(int i=0; i<2; i++) {
				if(j.charAt(i)=='3'||j.charAt(i)=='6'||j.charAt(i)=='9') {
					cnt++;
				}
			}
			return cnt;
		}

		//100이상 1000미만 -> 1000은 어차피 0개
		else if(n<1000){
			String j=String.valueOf(n);
			for(int i=0; i<3; i++) {
				if(j.charAt(i)=='3'||j.charAt(i)=='6'||j.charAt(i)=='9') {
					cnt++;
				}
			}
			return cnt;
		}
		
		return cnt;
	}
}


