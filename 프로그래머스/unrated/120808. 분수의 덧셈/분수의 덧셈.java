class Solution {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int numer = numer1 * denom2 + numer2 * denom1;
		int denom = denom1 * denom2;

		int common = gcd(numer, denom);

		int[] answer = { numer / common, denom / common };
		return answer;
	}

	public int gcd(int a, int b) { // 최대공약수 함수
		return b == 0 ? a : gcd(b, a % b);
	}
}