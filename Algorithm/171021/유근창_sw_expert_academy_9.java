package octo3rd;

import java.util.Scanner;
public class ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.nextLine().toCharArray();
		for(int i=0 ;i<arr.length; i++) {
			if(arr[i] >= 97 && arr[i] <= 122) System.out.print((char)(arr[i] -= 32));
			else System.out.print((char)arr[i]);
		}
	}
}
