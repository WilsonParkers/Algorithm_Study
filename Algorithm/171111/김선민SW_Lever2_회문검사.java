import java.util.Scanner;

public class SW_Lever2_회문검사 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());					// 테스트 개수
		for(int i=0; i<num; i++){
			String str = sc.nextLine();												// 문제
			int result = 1;																		// 결과값 저장변수
			System.out.print("#" + (i+1) + " ");
			for(int j=0; j<str.length()/2; j++){	
				if(str.charAt(j)!=str.charAt(str.length()-j-1))	// 회문아닌것 판별
					result=0;
			}
			System.out.println(result);
		}
	}
}
