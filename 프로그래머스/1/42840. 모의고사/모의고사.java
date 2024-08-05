import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        //수포자 패턴
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] count = new int[3];
        
        //정답 계산
         for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1[i % pattern1.length]) count[0]++;
            if (answers[i] == pattern2[i % pattern2.length]) count[1]++;
            if (answers[i] == pattern3[i % pattern3.length]) count[2]++;
        }
        
        //가장 많은 문제
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        
        //맞춘 사람 세팅
        List<Integer> result = new ArrayList<>();
        if (count[0] == max) result.add(1);
        if (count[1] == max) result.add(2);
        if (count[2] == max) result.add(3);
        
        //배열로 변환
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        
        return resultArray;
    }
}