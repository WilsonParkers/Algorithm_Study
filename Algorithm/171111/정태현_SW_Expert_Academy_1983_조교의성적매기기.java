import java.util.*;

public class SWExpert_1983 {
    private static void main(String args[]) {
        char[] cs = {'+', '0', '-'};    // 알파벳 뒤에 붙을 점수
        for (int i = 1, t = nt(); i <= t; i++) {
            // c : 학생 수,  n :  점수를 확인할 학생 번호, j : 반복, d : 성적 중복 가능 갯수, tg : 타겟 점수
            int c = nt(), n = nt(), j = 0, d = c / 10, tg;
            Integer[] us = new Integer[c];
            while (j < c) {
                // 각 점수 마다 올바른 배율을 곱하여 총점을 배열에 넣습니다
                us[j] = nt() * 35 + nt() * 45 + nt() * 20;
                j++;
            }
            // 성적을 찾을 학생의 점수를 저장 합니다
            tg = us[n - 1];
            // 내림차순으로 정렬 합니다
            Arrays.parallelSort(us, (o1, o2) -> o2.compareTo(o1));
            for (int k = 0; k < c; k++) {
                // 위에서 부터 확인했을 때 해당 학생의 점수와 같을 경우
                if (us[k] == tg) {
                    // A 부터 시작하므로 65,
                    // 현재 학생의 등수 k
                    // 알파벳 뒤에 붙을 성적 단위가 3개 ( +, 0, -)
                    // =>12등이고 총 학생수가 20명일 경우, 65 + 12 / 3 / 2 => 65 + 4 / 2 =? 67 을 char 형태로 바꾸어 출력합니다
                    // 위에서 d 로 나누는 이유는 학생수가 10명씩 늘어날 때마다 같은 성적의 학생이 한명씩 늘어나기 때문 입니다
                    // 마지막으로 12 / 2 를 하고 6 % 3 을 하면 +, 0, - 를 구할 수 있습니다
                    System.out.println("#" + i + " " + (char) (65 + k / 3 / d) + "" + cs[k % 3]);
                    break;
                }
            }
        }
    }
    static int nt() {
        return sc.nextInt();
    }
}
