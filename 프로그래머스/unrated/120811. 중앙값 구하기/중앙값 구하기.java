import java.util.Arrays;

class Solution {
	public int solution(int[] array) {
		Arrays.sort(array);
		int mid = array.length / 2;

		return (array.length % 2 == 0) ? (array[mid - 1] + array[mid]) / 2 : array[mid];
	}
}
