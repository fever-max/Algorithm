class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0, y = 0;

        // 강아지 위치
        for (int i = 0; i < park.length; i++) {
            if (park[i].contains("S")) {
                x = i;
                y = park[i].indexOf('S');
                break;
            }
        }

        for (String route : routes) {
            // 방향, 거리, 임시위치 지정
            char dir = route.charAt(0);
            int distance = Integer.parseInt(route.substring(2));
            int nx = x, ny = y;

            // 이동
            for (int i = 0; i < distance; i++) {
                if (dir == 'E') ny++;
                else if (dir == 'W') ny--;
                else if (dir == 'S') nx++;
                else if (dir == 'N') nx--;

                // 공원을 벗어나거나 장애물에 부딪히면 이동 중지
                if (nx < 0 || nx >= park.length || ny < 0 || ny >= park[0].length() || park[nx].charAt(ny) == 'X') {
                    nx = x;
                    ny = y;
                    break;
                }
            }

            // 이동가능하면 강아지 위치 변경
            x = nx;
            y = ny;
        }

        return new int[] {x, y};
    }
}
