import java.util.*;

class Solution {
    public long solution(long n) {
        char[] temp = Long.toString(n).toCharArray();

        Arrays.sort(temp);

        StringBuilder sb = new StringBuilder();
        for (char c : temp) sb.append(c);

        return Long.parseLong(sb.reverse().toString());
    }
}