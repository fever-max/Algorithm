class Solution {
	public int solution(int a, int b, int c) {
		int answer = 0;

		if (a == b && b == c) {
			answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
		} else if (a == b && a != c && b != c || b == c && b != a && c != a || a == c && a != b && b != c) {
			answer = (a + b + c) * (a * a + b * b + c * c);
		} else {
			answer = (a + b + c);
		}
		return answer;
	}
}