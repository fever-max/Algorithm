class Solution {
	public int[] solution(int start_num, int end_num) {
		int[] nums = new int[(end_num - start_num) + 1];

		for (int i = start_num; i <= end_num; i++) {
			int index = i - start_num;
			nums[index] = i;
		}
		return nums;
	}
}