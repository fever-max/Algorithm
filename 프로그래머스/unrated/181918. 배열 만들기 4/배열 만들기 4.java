import java.util.ArrayList;

class Solution {
	public ArrayList<Integer> solution(int[] arr) {
		ArrayList<Integer> stk = new ArrayList<>();
		int i = 0;

		while (i < arr.length) { // 빈 배열 이라면
			if (stk.size() == 0) {
				stk.add(arr[i]);
				i++;
			} else if (stk.get(stk.size() - 1) < arr[i]) {
				// str 마지막 인덱스가 arr[i]보다 작으면
				stk.add(arr[i]);
				i++;
			} else if (stk.get(stk.size() - 1) >= arr[i]) {
				// str 마지막 인덱스가 arr[i]보다 크거나 같으면
				stk.remove(stk.size() - 1);
			}
		}
		return stk;
	}
}