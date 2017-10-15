import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();		// 첫줄 읽기
		int t = Integer.parseInt(input);	// 테스트 케이스
		for(int n = 0; n < t; n++)
		{			
			int [] target = new int[2];
			String tmp = sc.nextLine();
			target[0] = Integer.parseUnsignedInt(tmp.split(" ")[0]);												
			target[1] = Integer.parseUnsignedInt(tmp.split(" ")[1]);				
			System.out.println("#"+(n+1)+" "+ (target[0]<target[1]?"<":target[0]==target[1]?"=":">"));
		}
	}
}
