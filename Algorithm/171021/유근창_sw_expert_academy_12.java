package octo3rd;

import java.util.Scanner;
public class ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			String str = sc.nextLine();
			int a = Integer.parseInt(str.split(" ")[0]), 
					b = Integer.parseInt(str.split(" ")[1]);
			sb.append("#" + (i+1) + " " + (a/b) + " " + (a%b) + "\n");
		}
		System.out.print(sb.toString());
	}
}
