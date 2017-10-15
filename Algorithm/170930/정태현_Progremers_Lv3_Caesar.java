package algorithm.Progremers;

public class Progremers_Lv3_Caesar {

	// My Answer Success
	String caesar(String s, int n) {
		StringBuilder builder = new StringBuilder();
		int  a = 'a'
//			a = 97
				, z = 'z'
//			, z = 122
				, A = 'A'
//			, A = 65
				, Z = 'Z'
//			, Z = 90
				, p = 26;

		for (char c : s.toCharArray())
			if (c != ' ') {
				int	i = c
						, j = n % p	// 이동 값, cycle 을 돈 후 얼만큼 이동하는지에 대한 값
						, k = i + j	// 알파벳 ASCII i => c 로 대체
						, l = i <= Z ?	// Z 보다 작을 경우
						k <= Z ?	// j 만큼 이동한 후 Z 보다 작을 경우
								k	// true : (대문자라고 인식)
								:
								A + k - Z -1	// false : j 만큼 이동헀을 때 Z를 넘을 경우, A 부터 시작해서 이동
						:
						i <= z ?	// z 보다 작을 경우 (소문자일 경우)
								k <= z ?	// j 만큼 이동했을 때 z 보다 작을 경우
										k	// true : (소문자라고 인식)
										:
										a + k - z -1 : 0	// false : j 만큼 이동헀을 때 z를 넘을 경우, a 부터 시작해서 이동
						;
				builder.append((char) l);
			} else
				builder.append(" ");
		return builder.toString();
	}

	public static void main(String[] args) {
		Progremers_Lv3_Caesar_submit c = new Progremers_Lv3_Caesar_submit();
		System.out .println(c.caesar("c qNspuVBdK B ofgMAadCXJWbcGivOZXN gHO epj CGDtY O",35));
	}
}