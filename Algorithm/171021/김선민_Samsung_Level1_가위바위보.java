package samsung_Level1;

import java.util.Scanner;

public class Samsung_Level1_rock {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		while(true){
			if(a==b){							// 비겼을 때
				continue;
			}else if((a-b)==1 || (a-b)==-2){	// A 승
				System.out.println("A");
				break;
			}else{								// 나머지 B 승
				System.out.println("B");
				break;
			}
		}
	}
}

