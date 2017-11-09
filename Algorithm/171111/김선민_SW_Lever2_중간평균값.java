import java.util.Arrays;
import java.util.Scanner;

public class SW_Lever2_중간평균값 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());					// 테스트 개수
		int[] nArr = new int[10];														// 테스트 숫자 저장할 배열
		for(int i=0; i<num; i++){
			for(int j=0; j<nArr.length; j++){				
				nArr[j] = sc.nextInt();													// 테스트 숫자 입력받음
			}
			Arrays.sort(nArr);																// 테스트 숫자 정렬
			double sum = 0;														
			for(int j=1; j<nArr.length-1; j++){
				sum += nArr[j];																	// 제일 큰 값(nArr[0]), 제일 작은 값(nArr[nArr.length-1])를 뺀 전체 합
			}
			sum = Math.round(sum/(nArr.length-2));						// 평균값 구하고 반올림
			System.out.println("#" + (i+1) + " " + (int)sum);
		}
	}
}
