package samsung_Level2;

import java.util.Scanner;

public class Samsung_Level2_패턴마디 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        for(int j=0; j<num; j++){
            String str = sc.nextLine();
            System.out.print("#" + (j+1) + " ");							// 문제 형식
            int i=10;														// 패턴 최대수
            int result = 0;
            while(i>0){
                    if(str.substring(0, i).equals(str.substring(i, 2*i))){	// 최대 마디 세기
                        result = i;
                        i--;
                    }else{
                        i--;
                    }
            }
            System.out.print(result);
            System.out.println();
        }
    }
}
