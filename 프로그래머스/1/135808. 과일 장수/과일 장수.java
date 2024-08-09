import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 사과 점수를 내림차순으로 정렬
        Arrays.sort(score);
        
        // 점수를 내림차순으로 변환 (높은 점수가 앞에 오도록)
        int n = score.length;
        int index = n - 1;
        
        // 상자에 담을 수 있는 사과의 개수
        while (index >= m - 1) {
            // 최저 점수
            int lowestScore = score[index - m + 1];
            // 이익
            answer += lowestScore * m;
            index -= m;
        }
        
        return answer;
    }
}