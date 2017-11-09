package 백만장자;

import java.util.Scanner;

class Solution {
  static int result = 0;

  public static void main(String args[]) throws Exception {

    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for (int test_case = 0; test_case < T; test_case++) {
      int n = sc.nextInt();
      int[] arr = new int[n + 1];

      for (int i = 1; i <= n; i++) {
        arr[i] = sc.nextInt();
      }
      long max = arr[n];                //제일 마지막날을 최대값으로 잡음
      long cnt = 0;                     //구입한 개수
      long total = 0;                   //구입한 가격
      long result = 0;                  //이익
      boolean flag = false;             //첫날이 제일 비싼지 체크

      for (int i = n - 1; i > 0; i--) { //제일 마지막날부터 DP로 계산
        if (max <= arr[i]) {            //현재 최대값으로 잡힌값보다 큰값이 나오면 현재까지 산것들 팔고 이익 계산
          if (i == 1) {                 //배열 처음까지 탐색했으면 끝
            flag = true;                //첫날이 제일 비쌈 -> 수익 0
            break;
          }
          result += max * cnt - (total);//현재 최대값으로 잡힌값보다 큰값이 나오면 현재까지 산것들 팔고 이익 계산
          max = arr[i];                 //최대값 갱신
          total = 0;                    //다팔았기때문에 초기화
          cnt = 0;                      //다팔았기때문에 초기화
        }
        else {                          //현재 최대값으로 잡힌값보다 작으면 모두 산다.
          total += arr[i];              //구입가격 누적
          cnt++;                        //구입개수 누적
        }
      }


      if (flag) {                       //첫날이 제일 비쌈
        result = 0;
      } else {                          //아님 마지막 이익 누적
        result += (max * cnt) - (total);
      }

      System.out.println("#" + (test_case + 1) + " " + result);
    }
  }
}
