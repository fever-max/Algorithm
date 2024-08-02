import java.util.*;

class Solution {
    public String solution(String s) {
        String[] list = s.split("");
        Arrays.sort(list, Collections.reverseOrder());
        return String.join("", list);
    }
}
