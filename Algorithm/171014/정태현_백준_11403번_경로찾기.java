import java.util.Scanner;

public class Backjoon_14726 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        /*
         2중 배열을 담기 위한 arr
         0 1 0
         0 0 1
         1 0 0
        */
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        // arr 배열 세팅

        for (int i = 0; i < n; i++)
            // (x, y) 에서 x 를 의미하는 i 번째 정점
            for (int j = 0; j < n; j++)
                // (x, y) 에서 y 를 의미하는 j 번째 정점
                for (int k = 0; k < n; k++)
                    // arr[j][i] : j 번째 정점에서 i 로 갈 수 있는지 판별 하기 위함
                    // arr[i][k] : 비교 대상인 i 번째 정점이 갈 수 있는 정점
                    if ((arr[j][i] & arr[i][k]) == 1)
                        arr[j][k] = 1;
                        /*
                        0 1 0
                        0 0 1
                        1 0 0

                        ex) i = 0, j =2, k=1
                        0 (i,k) 0
                        0 0 1
                        (j,i) 0 0

                        (j,i) 가 1번째 라인 ( 1 0 0) 을 갈 수 있을 때, 1번째 라인이 1번째 라인을 갈 수 있으니 ( 0 1 0 )
                        (j,i) 도 2번째 라인을 갈 수 있다 ( 1, 1, 0)
                     */

        // 결과 출력
        for (int[] i : arr) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}