package octo3rd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		Collections.sort(arr);
		System.out.println(arr.get((n-1)/2)+"");
	}
}
