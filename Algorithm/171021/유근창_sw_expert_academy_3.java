package octo3rd;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a>b) System.out.println("#" + (i+1) + " >");
			else if(a==b) System.out.println("#" + (i+1) + " =");
			else if(a<b) System.out.println("#" + (i+1) + " <");
			sc.nextLine();
		}
	}
}
