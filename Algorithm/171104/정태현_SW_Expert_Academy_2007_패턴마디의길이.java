import java.util.Scanner;

public class SWExpert_2007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= t; i++) {
            String s = sc.nextLine(), s2;               // 한 줄을 읽어 옵니다
            for (int j = 2; j < s.length(); j++) {      // 최소 두개 이상의 문자를 자르기 시작합니다 (반복되는 문자의 크기를 최소 크기를 1로 잡을 경우)
                s2 = s.substring(0,j);                  // 비교할 다음 문자
                if(s2.equals(s.substring(j,j*2))){
                    System.out.printf("#%d %d\n",i,s2.length());
                    break;
                }
            }
        }
    }
}
