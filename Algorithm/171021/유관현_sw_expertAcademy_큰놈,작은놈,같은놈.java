package week5;

//2개의 수를 입력 받아 크기를 비교하여 등호 또는 부등호를 출력하는 프로그램을 작성하라.
//
//
//[제약 사항]
//
//각 수는 0 이상 10000 이하의 정수이다.
//
//
//[입력]
//
//가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.
//
//각 테스트 케이스의 첫 번째 줄에는 2개의 수가 주어진다.
//
//
//[출력]
//
//출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.
//
//(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)
// 
//입력
//3
//3 8 
//7 7 
//369 123      
// 
//출력
//#1 <
//#2 =
//#3 >

import java.util.ArrayList;
import java.util.Scanner;
 
public class Samsung_2070 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                int score = sc.nextInt();
                al.add(score);
            }
            if (al.get(0) < al.get(1)) {
                System.out.println("#" + (i + 1) + " " + "<");
            } else if (al.get(0) > al.get(1)) {
                System.out.println("#" + (i + 1) + " " + ">");
            } else {
                System.out.println("#" + (i + 1) + " " + "=");
            }
            al.clear();
        }
    }
}
