class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            int width = size[0];
            int height = size[1];

            // 명함을 가로로 배치할 때
            int widthHor = Math.max(width, height);
            int heightHor = Math.min(width, height);
            
            // 명함을 세로로 배치할 때
            int widthVer = Math.min(width, height);
            int heightVer = Math.max(width, height);

            // 최대 크기
            maxWidth = Math.max(maxWidth, widthHor);
            maxHeight = Math.max(maxHeight, heightHor);
        }

        // 최종 지갑 크기 계산
        return maxWidth * maxHeight;
        
    }
}