import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int pick = (int) Arrays.stream(nums).distinct().count();
        int maxPick = nums.length / 2;
        return Math.min(pick, maxPick);
    }
}