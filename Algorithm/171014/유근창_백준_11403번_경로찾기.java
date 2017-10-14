package octo2nd;

import java.util.Scanner;

public class ex1 {
	static StringBuilder sb = new StringBuilder();
	static int[][] matrix = null;
	static int size = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(String.valueOf(sc.nextLine()));
		matrix = new int[size+1][size+1];
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				for(int k=0; k<size; k++) {
					if(matrix[j][i] == 1 && matrix[i][k] == 1 && matrix[j][k] == 0)
						matrix[j][k] = 1;
				}
			}
		}
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				sb.append(matrix[i][j] + " ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
	
	
}
