import java.util.Scanner;

public class Backjoon_8320 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt(), count = 0;
        for (int i = 1; i <= c / 2; i++) {  // 사각형 갯수의 절반 보다 같거나 작을 때까지 반복하는 이유는 그 이후로 반복하는 것은 중복되기 때문입니다
            for (int j = i; i * j <= c; j++)  // 3개 5개 같은 갯수로 직사각형을 만들수 없으므로 j = i, 를 설정하였고, i 와 곱하여 c 보다 작을 때 까지 반복하면 열의 갯수 만큼 만들어지는 직사각형 갯수를 구할 수 있습니다 (1,2,3,.... 4,6,8,..)
                count++;
        }
        System.out.print(count == 0 ? 1 : count);
    }
}