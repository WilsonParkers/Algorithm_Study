import java.util.Scanner;

public class Backjoon_9417 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine()); // 열의 갯수
        for (int i = 0; i < count; i++) {
            String[] arr = sc.nextLine().split(" "); // 하나의 line 을 String[] 로 변환 합니다
            int max = 0, size = arr.length; // 최대 공약수, 숫자의 갯수
            for (int j = 0; j + 1 < size; j++) {    // 기준이 되는 숫자 (10 20 30 40 일 경우 40을 제외한 숫자들이 기준이 되는 숫자입니다)
                int i1 = Integer.parseInt(arr[j]);
                for (int k = j + 1; k < size; k++) {    // 비교할 숫자 (10이 기준이 되는 숫자일 경우 10을 제외한 모든 숫자가 비교할 숫자입니다)
                    int i2 = Integer.parseInt(arr[k]);
                    for (int m = Math.min(i1, i2); m > 0; m--) {    // 최대 공약수를 구하기 위해서 두 숫자 중 작은것을 max 로 설정하고 하나씩 감소시켜서 공약수인지 판별합니다
                        if (i1 % m == 0 && i2 % m == 0) {   // 공약수 일 경우 max 설정
                            max = Math.max(max, m);
                            break;
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }
}