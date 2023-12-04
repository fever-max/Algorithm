class Solution {
	public int solution(int n, String control) {
		char[] array = control.toCharArray();

		for (char ch : array) {
			if (ch == 'w')
				n += 1;
			else if (ch == 's')
				n -= 1;
			else if (ch == 'd')
				n += 10;
			else if (ch == 'a')
				n -= 10;
		}
		
		return n;
	}
}