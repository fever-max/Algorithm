class Solution {
    public int[] solution(String[] wallpaper) {
        // 바탕화면 행과 열
        int numRows = wallpaper.length;
        int numCols = wallpaper[0].length();
        
        // 파일 좌표 초기화
        int top = numRows;
        int bottom = -1;
        int left = numCols;
        int right = -1;
        
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (wallpaper[row].charAt(col) == '#') {
                    // 좌표 갱신
                    if (row < top) top = row;
                    if (row > bottom) bottom = row;
                    if (col < left) left = col;
                    if (col > right) right = col;
                }
            }
        }
        
        return new int[] {top, left, bottom + 1, right + 1};
        
    }
}
