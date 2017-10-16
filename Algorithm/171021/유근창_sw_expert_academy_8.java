package octo3rd;

import java.util.Scanner;

//a~z : 97~122, A~Z : 65~90
public class ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
				System.out.print((str.charAt(i) - 64) + " ");
			else
				System.out.print((str.charAt(i) - 96) + " ");
		}
	}
}
