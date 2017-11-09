import java.util.Scanner;

public class SWExpert_2005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), n, r;
        String s = "";
        for (int i = 1; i <= t; i++) {
            n = sc.nextInt();
            int[][] is = new int[n][n];         // 각각의 삼각형 크기를 정합니다
            s += "#"+i+"\n";                    // 현재 테스트 정보를 출력 합니다 #i
            for (int j = 0; j < n; j++) {       // 0 번 부터 (맨 꼭대기) 시작하며
                for (int k = 0; k <= j; k++) {  // 현재 층 (꼭대기가 0) 만큼 반복
                    is[j][k] = r = k==0||j==k?1:is[j-1][k-1]+is[j-1][k];    // k 가 0 즉 더할 왼쪽이 없을 경우, k==j 즉 더할 오른쪽이 없을 경우 1을 주고
                                                                            // 위 두 사항이 아닐 경우 전 층의 양쪽을 더합니다
                    s += r+" ";
                }
                s += "\n";
            }
        }
        System.out.print(s);
    }
}
