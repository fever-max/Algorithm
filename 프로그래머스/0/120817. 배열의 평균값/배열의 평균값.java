class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int tot=0;                              //배열의 모든 값을 담을 변수tot
        for(int i=0; i<numbers.length; i++) {   
            tot+=numbers[i];                    //배열의 i번째 수를 tot에 더함
        }
        answer=(double) tot/numbers.length;     //총합을 배열의 크기만큼 나눔
        return answer;
    }
}
