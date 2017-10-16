package octo3rd;

import java.util.Scanner;
public class ex18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i=1;i<=n;i++) {
			if(n%i==0) System.out.print(i + " ");
		}
	}
}
