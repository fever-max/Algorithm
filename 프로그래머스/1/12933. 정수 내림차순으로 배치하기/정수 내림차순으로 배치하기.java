import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        // 자릿수 계산
        String numberStr = Long.toString(n);
        int length = numberStr.length();
        Integer[] digits = new Integer[length];

        // 배열 저장
        for (int i = 0; i < length; i++) {
            digits[i] = numberStr.charAt(i) - '0';
        }

        // 내림차순 정렬
        Arrays.sort(digits, Collections.reverseOrder());

        // 반환값 설정
        long sortedNumber = 0;
        for (int digit : digits) {
            sortedNumber = sortedNumber * 10 + digit;
        }

        return sortedNumber;
    }
}
