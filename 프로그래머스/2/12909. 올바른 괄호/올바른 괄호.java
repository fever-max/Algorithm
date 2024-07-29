import java.util.*;
class Solution {
    boolean solution(String s) {
       Queue<Character> queue = new LinkedList<>();
    
    for (char ch : s.toCharArray()) {
        if (ch == '(') {
            //'('일 때만 큐에 누적
            queue.offer(ch);
        } else if (ch == ')') {
            if (queue.isEmpty()) {
                return false; 
            }
            // ')'로 짝이 맞을 때만 삭제
            queue.poll(); 
        }
    }
    return queue.isEmpty();
    }
}