package samsung_Level1;

import java.util.Scanner;

public class Samsung_Level1_diagonal {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String sharp = "#";							// #
		String plus = "+";							// +
		for(int i=0; i<5; i++){
			String str = "";						
			for(int j=0; j<5; j++){
				str = str + ((i==j) ? sharp : plus);// i 일때 # 아니면 +
			}
			System.out.println(str);
		}
	}
}
