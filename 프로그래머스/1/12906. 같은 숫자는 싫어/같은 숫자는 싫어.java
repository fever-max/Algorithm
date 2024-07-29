import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            //값이 비어있거나 직전값이 다르면 추가
            if (stack.empty() || !stack.peek().equals(i)) {
                stack.push(i);
            }
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }
}