package octo3rd;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int sum = 0;
		for(int i=0;i<s.length();i++) {
			sum += s.charAt(i) - '0';
		}
		System.out.println(sum);
	}

}
