class Solution {
	public int[] solution(int[] arr, int[][] queries) {
		int temp;

		for (int i = 0; i < queries.length; i++) { // 행

			int num = queries[i][0];
			int num2 = queries[i][1];

			temp = arr[num2];
			arr[num2] = arr[num];
			arr[num] = temp;

		}
		return arr;
	}
}
