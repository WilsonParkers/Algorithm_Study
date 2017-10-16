package octo3rd;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			int max = 0;
			for(int j=0;j<10;j++) {
				int a = sc.nextInt();
				if(max < a) max = a; 
			}
			System.out.println("#" + (i+1) + " " + max);
		}
	}
}
