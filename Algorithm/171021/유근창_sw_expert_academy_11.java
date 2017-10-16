package octo3rd;

import java.util.Scanner;
public class ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(Integer.parseInt(str.split(" ")[0])
				- Integer.parseInt(str.split(" ")[1]) + 1);
	}
}
