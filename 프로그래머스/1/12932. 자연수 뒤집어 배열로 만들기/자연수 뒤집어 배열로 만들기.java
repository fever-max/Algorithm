class Solution {
    public int[] solution(long n) {
        // n을 문자열로 변환
        String str = "" + n;
        // 문자열을 뒤집기
        String reversed = new StringBuilder(str).reverse().toString();
        // 뒤집어진 문자열의 길이만큼 배열 생성
        int[] answer = new int[reversed.length()];
        // 각 문자를 숫자로 변환하여 배열에 저장
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Character.getNumericValue(reversed.charAt(i));
        }
        return answer;
    }
}
