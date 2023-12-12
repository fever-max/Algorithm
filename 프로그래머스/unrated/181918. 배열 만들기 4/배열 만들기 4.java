import java.util.Stack;

class Solution {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty() || stk.peek() < arr[i]) {
                stk.push(arr[i]);
                i++;
            } else if (stk.peek() >= arr[i]) {
                stk.pop();
            }
        }

        return stk;
    }
}