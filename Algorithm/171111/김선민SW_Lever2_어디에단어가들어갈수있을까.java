import java.util.Scanner;

public class SW_Lever2_어디에단어 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		for(int i=0; i<num; i++){
			int n = sc.nextInt();											// 테스트 개수
			int len = sc.nextInt();										// 문자 길이
			sc.nextLine();
			int xcnt = 0;															// 행에 들어갈수 있는 개수
			int ycnt = 0;															// 열에 들어갈수 있는 개수
			int result = 0;														// 정답
			int[][] test = new int[n][n];							// 문제 저장할 배열
			for(int j=0; j<n; j++){
				for(int k=0; k<n; k++){
					test[j][k] = sc.nextInt();						// 문제 입력받음
				}
			}
			for(int x=0; x<n; x++){
				xcnt = 0;
				ycnt = 0;
				for(int y=0; y<n; y++){
					if(test[x][y] == 1){									// 행에서 1이면 xcnt 1개 증가
						xcnt++;
					}else{																// 행에서 0이면 xcnt와 문자길이(len) 비교 후 
						if(xcnt==len) result++;							// 같으면 result 1증가 그리고 xcnt 0으로만듬
						xcnt=0;
					}
					if(test[y][x] == 1){									// 열에서 1이면 ycnt 1개 증가
						ycnt++;
					}else{																// 열에서 0이면 ycnt와 문자길이(len) 비교 후 
						if(ycnt==len) result++;							// 같으면 result 1증가 그리고 ycnt 0으로만듬
						ycnt=0;
					}
					if(y==n-1){														// 행, 열이 마지막에 닿았을 때 1인경우
						if(xcnt==len) result++;						  // 문자길이(len)과 같으면 result 1증가
						if(ycnt==len) result++;
					}
				}
			}
			System.out.println("#" + (i+1) + " " + result);
		}
	}
}
