import java.util.Scanner;

public class SW_Lever2_지그재그 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		for(int i=0; i<num; i++){
			int number = sc.nextInt();
			if(number%2==1) number = number/2+1;
			else number = -(number/2);
			System.out.println("#" + (i+1) + " " + number);
		}
	}
}
