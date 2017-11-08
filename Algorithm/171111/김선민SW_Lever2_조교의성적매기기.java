import java.util.Arrays;
import java.util.Scanner;

public class SW_Lever2_조교의성적매기기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());					// 테스트 개수
		for(int i=0; i<num; i++){
			int n = sc.nextInt();												// 점수개수
			int k = sc.nextInt();												// 구하고자하는 애의 점수 순서
			sc.nextLine();
			String result = "";													// 학점
			String str = "";														// 점수 받을 변수
			String[] strArr = new String[3];						// 중간, 기말, 과제 저장할 변수
			double [] grade = new double[n];						// 총점계산하여 저장할 변수
			for(int j=0; j<n; j++){
				str = sc.nextLine();									
				strArr = str.split(" ");
				grade[j] =  (double) (Integer.parseInt(strArr[0])*0.35 + Integer.parseInt(strArr[1])*0.45 + Integer.parseInt(strArr[2])*0.2); // 총점 계산
			}
			double res = grade[k-1];										// 구하고자하는 애의 총점
			int rank = 0;
			Arrays.sort(grade);													// 총점 정렬
			for(int m=0; m<n; m++){
				if(grade[m]==res){												// 구하고자하는 애의 점수 순위 구하기
					rank = m;
					break;
				}
			}
			if(rank<n/10) result = "D0";
			else if(rank<n/10*2) result = "C-";
			else if(rank<n/10*3) result = "C0";
			else if(rank<n/10*4) result = "C+";
			else if(rank<n/10*5) result = "B-";
			else if(rank<n/10*6) result = "B0";
			else if(rank<n/10*7) result = "B+";
			else if(rank<n/10*8) result = "A-";
			else if(rank<n/10*9) result = "A0";
			else result = "A+";
			System.out.println("#" + (i+1) + " " + result);
		}
	}
}
