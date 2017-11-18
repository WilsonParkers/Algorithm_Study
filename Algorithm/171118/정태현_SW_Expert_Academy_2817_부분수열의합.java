package algorithm.SwExpertAcademy.D3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SWExpert_2817 {
        static int v, k, c, n;
        static int[] is;

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            for(int i=1, t=sc.nextInt(); i<=t; i++){
                n=sc.nextInt(); // 수의 갯수
                k=sc.nextInt(); // 수의 합
                c=0;            // 합이 나오는 갯수
                is=new int[n];  // 수의 배열
                // 배열에 값을 넣습니다
                for(int j=0; j<n; j++)
                    is[j]=sc.nextInt();

                for(int j=0;j<n;j++){
                    // 선택된 것을 1로 표시
                    // ex) 00101 => 0 과 2번째를 선택했다는 뜻
                    // v 는 0001, 0010, 0100 식으로 초기화 됨
                    v = 1<<j;
                    System.out.println(String.format("V1=%"+n+"s",Integer.toBinaryString(v)).replaceAll(" ","0"));
                    cct(j, is[j]);
                    v &= ~1<<j; // 0000 으로 초기화
                    System.out.println(String.format("V2=%"+n+"s,%"+n+"s",Integer.toBinaryString(v),Integer.toBinaryString(-1<<j)).replaceAll(" ","0"));

                }
                System.out.printf("#%d %d\n",i,c);
            }
        }
        // i 번째를 시작으로 하여 순차 선택
        // 0010 을 시작으로 한다면 0110, 1110 순으로 선택
        static void cct(int i, int sum){
            if(k == sum) c++;
            for(int i2 = i+1;i2<n;i2++){
                if((v & 1<<i2) == 0){
                    v |= 1<<i2;
                    System.out.println(String.format("v1=%"+n+"s,%d,%d",Integer.toBinaryString(v), i, i2).replaceAll(" ","0"));
                    cct(i2, sum+is[i2]);
                    v &= ~1<<i2;
                    System.out.println(String.format("v2=%"+n+"s,%"+n+"s,%d,%d",Integer.toBinaryString(v),Integer.toBinaryString(-1<<i2), i, i2).replaceAll(" ","0"));
                }
            }
        }
}