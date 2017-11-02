package 파스칼의삼각형;


import java.util.Scanner;

class Solution {
	
	
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 0; test_case < T; test_case++) {

			int n=sc.nextInt();
			int[][] arr = new int[n][n];
			arr[0][0]=1;

			for(int i=1; i<n; i++){
				for(int j=0; j<=i; j++){									//열은 행번호 만큼 출력하면됨
					if(j==0 || j==i){												//인덱스가 0이거나 제일 끝자리면 1
						arr[i][j]=1;
					}else{																	//아니면 arr[i-1][j-1]+arr[i-1][j]
						arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
					}

				}
			}


			System.out.println("#"+(test_case+1));
			for(int i=0; i<n; i++){
				for(int j=0; j<=i; j++){
					System.out.print(arr[i][j]+" ");
				}
				System.out.println("");
			}

		}
	}
	
}


