package week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Samsung_2068 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 10; j++) {
				int score = sc.nextInt();
				al.add(score);
			}
			Collections.sort(al);
			System.out.println("#" + (i + 1) + " " + al.get(al.size() - 1));
			al.clear();
		}
	}

}
