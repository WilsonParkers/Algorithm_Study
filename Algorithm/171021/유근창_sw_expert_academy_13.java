package octo3rd;

import java.util.Scanner;
//+ : 43, # : 35
public class ex13 {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			String str = "+++++";
			char[] arr = str.toCharArray();
			arr[i] = '#';
			System.out.println(arr);
		}
	}
}
