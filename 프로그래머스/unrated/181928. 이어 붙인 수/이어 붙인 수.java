class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "", even = "";

        for ( int i = 0; i < num_list.length; i++ ) {
            if ( num_list[i] % 2 == 1 ) {
                odd += num_list[i]; //문자니까 자동으로 뒤에 붙음
            } else even += num_list[i];
        }

        answer = Integer.parseInt(odd) + Integer.parseInt(even);

        return answer;
    }
}