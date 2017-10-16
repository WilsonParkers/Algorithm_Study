package octo3rd;

import java.util.Scanner;
public class ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0;i<=n;i++) {
			System.out.print((int)Math.pow(2, i)+" ");
		}
	}
}
