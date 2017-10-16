package octo3rd;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			int sum = 0;
			for(int j=0;j<10;j++) {
				int a = sc.nextInt();
				if(a % 2 != 0) sum += a;
			}
			System.out.println("#" + (i+1) + " " + sum);
			sc.nextLine();
		}
		
	}
}
