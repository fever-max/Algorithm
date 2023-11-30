class Solution {
	public String solution(String code) {
		String ret = "";
		char target = '1';
		int mode = 0;

		for (int i = 0; i < code.length(); i++) {

			if (mode == 0) {
				if (code.charAt(i) != target) {
					if (i % 2 == 0) {
						ret += code.charAt(i);
					}
				} else {
					mode = 1;
				}
			} else if (mode == 1) {
				if (code.charAt(i) != target) {
					if (i % 2 != 0) {
						ret += code.charAt(i);
					}
				} else {
					mode = 0;
				}
			}
		}
		return ret.length() == 0 ? "EMPTY" : ret.toString();
	}
}