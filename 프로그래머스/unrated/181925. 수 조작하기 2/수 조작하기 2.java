public class Solution {
    public String solution(int[] numLog) {
        String result = "";

        for (int i = 1; i < numLog.length; i++) {
            int num = numLog[i] - numLog[i - 1];

            if (num == 1) {
                result += "w";
            } else if (num == -1) {
                result += "s";
            } else if (num == 10) {
                result += "d";
            } else if (num == -10) {
                result += "a";
            }
        }

        return result;
    }
}