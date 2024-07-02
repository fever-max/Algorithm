class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();
        for (String listItem : str_list) {
            if (!listItem.contains(ex)) {
                answer.append(listItem);
            }
        }
        return answer.toString();
    }
}