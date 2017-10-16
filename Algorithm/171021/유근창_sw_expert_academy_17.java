package octo3rd;

import java.util.Scanner;
//가위 1 바위 2 보 3
public class ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		switch(a) {
		case 1:
			if(b==2) print("B");
			else if(b==3) print("A");
		case 2:
			if(b==1) print("A");
			else if(b==3) print("B");
		case 3:
			if(b==1) print("B");
			else if(b==2) print("A");
		}
	}
	public static void print(String s) {
		System.out.println(s);
	}
}
