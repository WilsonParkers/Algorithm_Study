package octo3rd;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0; i<n; i++) {
			int sum=0;
			for(int j=0; j<10; j++) {
				int a = sc.nextInt();
				sum+=a;
			}
			if(sum % 10 >= 5 && sum % 10 < 10) {
				System.out.println("#" + (i+1) + " " + (sum/10 + 1));
			}else if(sum % 10 >= 0 && sum % 10 < 5) {
				System.out.println("#" + (i+1) + " " + sum/10);
			}
		}
		
	}

}
