import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        // 참가자 카운트 (동명이인일시 +1)
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        
        // 완주자 카운트 (완주할 시 -1)
        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                return entry.getKey();
            }
        }

        return "";
    }
}
