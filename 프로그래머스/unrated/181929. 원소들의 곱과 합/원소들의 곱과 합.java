class Solution {
	public int solution(int[] num_list) {
		int sum = 1, superSum = 0;

		for (int i = 0; i < num_list.length; i++) {
			sum *= num_list[i];
			superSum += num_list[i];
		}
		
		return (sum > superSum * superSum) ? 0 : 1;

	}
}
