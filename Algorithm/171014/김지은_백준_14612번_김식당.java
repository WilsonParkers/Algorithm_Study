import java.util.Scanner;

public class Main {
  // 현재 모든 오더 출력
	public static void print(int[][] order, int cnt) {
		for (int i = 0; i < cnt; i++) // 0 번 부터 cnt-1 까지 조회
		{
			// 쌓인 오더를 출력
			System.out.print(order[i][0]);

			// 테이블 번호에 공백을 주고 출력하기 위함
			if (i != cnt - 1) {
				// k가 마지막 오더가 아니라면
				System.out.print(" "); // 공백추가
			} else {
				// k가 마지막 오더라면
				System.out.println(); // 개행
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); // 첫줄
		String[] init_temp = input.split(" ");
		int N = Integer.parseInt(init_temp[0]); // 입력의 첫째 줄에 질의의 수 N과 테이블의 수 M이 주어진다. (1≤N, M≤100)
		int M = Integer.parseInt(init_temp[1]);
		int order[][] = new int[N][2]; // 질문들어오는 순서대로의 오더, order와 포스트잇에 적어둘 주문 순서, sort 도 적용된다, 뒷자리는 시간!
		int cnt = 0; // cnt는 0부터 시작하며, 아무 값도 없을 때 0 이고 들어왔을 때 부터 1이된다.
		// N개의 테스트 케이스 입력 받기
		for (int i = 0; i < N; i++) {
			input = sc.nextLine();
			String swith_case;
			if (!input.equals("sort")) // sort 명령 시 split 하지 말아야함
			{
				String[] temp = input.split(" ");
				swith_case = temp[0];
			} else {
				swith_case = input;
			}
			// cnt현재 몇번째 질문 ? 오더가 들어 올때마다 증가해야함
			switch (swith_case) 
			{
				case "order": {
					cnt++; // 현재 몇번째 오더? order 시 증가, complete 시 감소
					String[] temp = input.split(" ");
					// System.out.println("주문들어왔습니다! "+temp[1]+" 번 테이블입니다.");
					order[cnt - 1][0] = Integer.parseInt(temp[1]); // 테이블넘버
					order[cnt - 1][1] = Integer.parseInt(temp[2]); // 시간
	
					// order 값이 비어 있을 때 까지 출력
					print(order, cnt);

					break;
				}
				case "sort": 
				{
					// System.out.println("빠른 순으로.");
					// sort 는 주문이 0인 경우에는 sleep 를 출력, 1개인 경우에는 하나의 오더만 출력
					if (cnt == 0) {
						System.out.println("sleep");
					} else if (cnt == 1) {
						System.out.println(order[0][0]); // 하나 출력
					} else 
					{
						// 주문이 2개 이상 있는 경우 ( if cnt >= 2 )
						for (int x = 0; x < cnt - 1; x++) 
						{
							for (int y = x + 1; y < cnt; y++) 
							{
								if (order[x][1] > order[y][1]) // 해당 주문의 시간을 비교, 오름차순으로 정렬
								{
									int[] tmp = new int[2];
									tmp = order[x];
									order[x] = order[y];
									order[y] = tmp;
								}else if (order[x][1] == order[y][1])
								{
									if(order[x][0] > order[y][0])
									{
										int[] tmp = new int[2];
										tmp = order[x];
										order[x] = order[y];
										order[y] = tmp;
									}
								}
							}						
						}
						// order 값이 비어 있을 때 까지 출력
						print(order, cnt);
					}
					break;
				}
				case "complete": // 주문이 하나도 없거나, 한 테이블의 주문이 2개 이상인 경우에는 complete 명령을 안씀
				{
					String[] temp = input.split(" ");
					// System.out.println("요리 나가세요! "+temp[1]+" 번 테이블입니다.");
	
					// 전체 검사해서 해당 테이블 제거 temp[0]
					for (int k = 0; k < cnt; k++) {
						if (order[k][0] == Integer.parseInt(temp[1])) {
							for (int x = k; x < cnt; x++) // complete 시 해당 오더를 제거하고 뒷열에 있는 오더를 하나씩 당김
							{
								// 해당하는 테이블 제거
								order[x][0] = order[x + 1][0];
								order[x][1] = order[x + 1][1];
							}
							cnt--;
							break; // complete는 해당하는 테이블 번호가 오직 1개뿐이므로 하나 해당하면 바로 break 시켜도됨
						}
					}
					// order 값이 비어 있을 때 까지 출력
					if (order[0][0] == 0) {
						System.out.println("sleep");
					}else
					{
						print(order, cnt);
					}					
					break;
				}
			}
		}
	}
}
