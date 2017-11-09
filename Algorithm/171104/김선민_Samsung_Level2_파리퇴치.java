package samsung_Level2;

import java.util.Scanner;

public class Samsung_Level2_fly {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int num = Integer.parseInt(sc.nextLine());
		for(int i=0; i<num; i++){
			System.out.println("n : m ");					
			int nn = sc.nextInt();							// 파리잡을곳 크기
			int mm = sc.nextInt();							// 파리채 크기
			sc.nextLine();
			int[][] fly = new int[nn][nn];					// 파리잡을곳
			for(int j=0; j<nn; j++){
				for(int k=0; k<nn; k++){
					System.out.print("fly : ");
					fly[j][k] = sc.nextInt();				// 파리 개수
				}
			}
			int max = 0;
			for(int x=0; x<(nn-mm+1); x++){					// 아래로 파리채 내려감
				for(int y=0; y<(nn-mm+1); y++){				// 옆으로 파리채 감
					int sum = 0;
					for(int j=x; j<x+(mm); j++){
						for(int k=y; k<y+(mm); k++){
							sum += fly[j][k];				// 파리채에 잡힌 파리개수
						}
					}
					max = max > sum ? max : sum;			// 최대값
				}
			}
			System.out.println("#" + (i+1) + " " + max);
		}
	}
}
