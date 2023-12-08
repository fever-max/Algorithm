import java.util.Arrays;

class Solution {
	public int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];

		for (int i = 0; i < queries.length; i++) {
			int s = queries[i][0];
			int e = queries[i][1];
			int k = queries[i][2];

			int min = value(arr, s, e, k);

			answer[i] = min;
		}

		return answer;
	}

	private int value(int[] arr, int s, int e, int k) {
		int minValue = Integer.MAX_VALUE;

		for (int i = s; i <= e; i++) {
			if (arr[i] > k && arr[i] < minValue) {
				minValue = arr[i];
			}
		}

		return minValue == Integer.MAX_VALUE ? -1 : minValue;
	}

}