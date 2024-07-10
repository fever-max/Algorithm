class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        for (int index : index_list) {
            if (index >= 0 && index < my_string.length()) {
                answer.append(my_string.charAt(index));
            }
        }
        return answer.toString();
    }
}