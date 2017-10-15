package algorithm.Backjoon;

import java.util.*;

public class Backjoon_14612 {
    static List<Ord> arr = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();                                           // 명령어의 갯수
        sc.nextLine();
        for (int n = 0; n < c; n++) {
            char ch = sc.next().charAt(0);                              // o : order, s : sort, c : complete
            if (ch == 's') {
                arr.sort((o1, o2) -> {                                  // Array Sort
                    int i = o1.t2.compareTo(o2.t2);                     // 시간을 오름차순으로 정렬
                    if (i == 0)                                         // 시간이 같다면 테이블 번호가 적은 걸 앞에 정렬
                        i = o1.t.compareTo(o2.t);
                    return i;
                });
            } else if (ch == 'o') {
                arr.add(new Ord(sc.nextInt(), sc.nextInt()));           // order 테이블 추가
            } else {
                int t = sc.nextInt();                                   // complete t 번 테이블 제거
                arr.removeIf(ord -> ord.t == t);
            }
            print();
        }
    }

    static void print() {
        StringBuilder sb = new StringBuilder();
        if (arr.size() == 0)
            sb.append("sleep");
        else
            arr.stream().forEach(ord -> sb.append(ord.t + " "));
        System.out.println(sb.toString().trim());
    }

    static class Ord {
        Integer t, t2;                                                  // 테이블 번호, 주문 시간
        public Ord(int i, int i2) {
            t = i;
            t2 = i2;
        }
    }
}