import java.util.Scanner;

public class SWExpert_1989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1, t = Integer.parseInt(sc.nextLine()), r = 0; i <= t; i++) {
            StringBuffer sb = new StringBuffer(sc.nextLine());
            if (sb.toString().equals(sb.reverse().toString()))      // StringBuffer 를 이용하여 String 을 reverse 하여 비교 합니다
                r = 1;
            else
                r = 0;
            System.out.println("#" + i + " " + r);
        }
    }
}
