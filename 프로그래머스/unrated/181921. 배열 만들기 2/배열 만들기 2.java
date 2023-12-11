import java.util.ArrayList;
import java.util.Collections;

class Solution {
	public static int[] solution(int l, int r) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = l; i <= r; i++) {
			if (ck(i)) {
				list.add(i);
			}
		}

		if (list.isEmpty()) {
			return new int[] { -1 };
		}

		Collections.sort(list);
		int[] resultArray = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			resultArray[i] = list.get(i);
		}

		return resultArray;
	}

	private static boolean ck(int number) {
		String strNumber = Integer.toString(number);
		return strNumber.matches("[05]+");
	}
}
