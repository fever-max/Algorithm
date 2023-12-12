import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n != 1) {
            list.add(n);

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
        }
        // 마지막 숫자 1 추가
        list.add(1);
        return list;
    }
}