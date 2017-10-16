package octo3rd;
import java.util.Scanner;
public class ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			String str = sc.nextLine();
			if(isValid(str)) System.out.println("#"+(i+1)+" "+str.substring(0, 4)+"/"+str.substring(4,6)+"/"+str.substring(6));
			else System.out.println("#"+(i+1)+" -1");
		}
	}
	
	public static boolean isValid(String str) {
		int month = Integer.parseInt(str.substring(4,6));
		int day = Integer.parseInt(str.substring(6));
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(day <= 31 && day>=1) return true;
			else return false;
		case 4: case 6: case 9: case 11:
			if(day <= 30 && day>=1) return true;
			else return false;
		case 2:
			if(day <= 28 && day>=1 ) return true;
			else return false;
		default:
			return false;
		}
	}

}
