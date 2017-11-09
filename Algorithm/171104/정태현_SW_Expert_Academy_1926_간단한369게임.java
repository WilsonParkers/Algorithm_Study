import java.util.Scanner;

public class SWExpert_1926 {
    public static void main(String[] args) {
        String s = "";
        char[] cs = {'3', '6', '9'};    // 3,6,9 를 걸러내기 위함 입니다
        for (int i = 1, t, n = new Scanner(System.in).nextInt(); i <= n; i++) {
            t = 0;
            for (char c : (i + "").toCharArray())   // 현재 숫자를 각각 char 로 바꾸어서 3,6,9가 포함된 만큼 - 를 출력 합니다
                for (char c2 : cs)
                    if (c == c2) {
                        s += "-";
                        t++;
                    }
            if (t == 0)     // 3,6,9 가 하나도 없을 경우 숫자 출력를 합니다
                s += i;
            s += " ";
        }
        System.out.print(s);
    }
}
