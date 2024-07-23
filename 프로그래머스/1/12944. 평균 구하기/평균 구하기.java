class Solution {
    public double solution(int[] arr) {
        int num = 0;
        for (int a : arr) {
            num += a;
        }
        double answer = (double) num / arr.length;
        return answer;
    }
}