import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        // 값의 빈도수 계산
        for (int num : array) {
            // num을 key로 설정하고, num이 없으면 0을 있으면 ++ value에 저장
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = 0; // 가장 높은 빈도수
        int answer = 0; // 최빈값
        boolean multipleModes = false; // 최빈값 여부

        // 맵을 순회하여 최빈값 찾기
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            // 현재 값의 빈도수가 최빈값의 빈도수보다 높으면 갱신
            if (count > max) {
                max = count;
                answer = num;
                multipleModes = false;
            } else if (count == max) {
                // 최빈값이 여러개인 경우
                multipleModes = true;
            }
        }

        if (multipleModes) {
            // 최빈값이 여러개인 경우
            return -1;
        } else {
            return answer;
        }
    }
}