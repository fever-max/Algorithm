class Solution {
	public int solution(int[] num_list) {
		StringBuilder a = new StringBuilder();
		StringBuilder b = new StringBuilder();
		int sum1 = 0, sum2 = 0;

		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {
				a.append(num_list[i]); // 짝수만 순서대로 추가
			} else {
				b.append(num_list[i]); // 홀수만 순서대로 추가
			}
		}

		// 문자로 반환 후 정수로 변환
		sum1 = Integer.parseInt(a.toString());
		sum2 = Integer.parseInt(b.toString());

		return sum1 + sum2;
	}
}