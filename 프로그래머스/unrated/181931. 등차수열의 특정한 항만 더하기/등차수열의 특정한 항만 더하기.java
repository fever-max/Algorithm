class Solution {
	public int solution(int a, int d, boolean[] included) {
		int answer = 0;

		for (int i = 0; i < included.length; i++) {
			if (included[i]) { //참이면
				answer += a + i * d; //등차수열 공식
			}
		}
		return answer;
	}
}