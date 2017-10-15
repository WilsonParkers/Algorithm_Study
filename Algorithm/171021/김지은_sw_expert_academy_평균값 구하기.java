import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();		// 첫줄 읽기
		int t = Integer.parseInt(input);	// 테스트 케이스
		int result = 0;
		for(int n = 0; n < t; n++)
		{			
			String tmp = sc.nextLine();
			for(int i = 0 ; i < 10; i++)
			{
				int temp = Integer.parseUnsignedInt(tmp.split(" ")[i]);				
				result += temp;								
			}		
			System.out.println("#"+(n+1)+" "+(int)(result / 10.0f * 10 + 5) / 10);	// "#t 결과값" 형식으로 답 출력
            result = 0;
		}
	}
}
