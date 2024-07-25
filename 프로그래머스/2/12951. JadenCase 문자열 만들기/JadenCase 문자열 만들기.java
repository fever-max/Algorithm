class Solution {
    public String solution(String s) {
        String answer = "";
        boolean b = true;
        
        for (char c : s.toCharArray()) {
            //전체 문자 순회
            if (c == ' ') {
                //공백이면 그대로 입력
                answer += c;
                b = true;
            } else if (b) {
                //공백 다음에 오는 문자는 대문자로 처리
                answer += Character.toUpperCase(c);
                b = false;
            } else {
                //다른 글자들은 소문자로
                answer += Character.toLowerCase(c);
            }
        }

        return answer;
    }
}