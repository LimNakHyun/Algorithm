package problem.lv0.안전지대;

import java.util.Arrays;

public class Main {

    static int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        int[][] b = new int[n + 2][n + 2];
        
        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                b[i][j] = board[i - 1][j - 1];
            }
        }
        
        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                if(b[i][j] == 0 && b[i][j - 1] == 0 && 
                b[i - 1][j - 1] == 0 && b[i - 1][j] == 0 &&
                b[i - 1][j + 1] == 0 && b[i][j + 1] == 0 && 
                b[i + 1][j + 1] == 0 && b[i + 1][j] == 0 &&
                b[i + 1][j - 1] == 0) answer++;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        //지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류한다.
        //지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재한다.
        //지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 리턴

        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};    //answer = 13

        System.out.println("지뢰지도:");
        for(int[] line: board) {
            System.out.println(Arrays.toString(line));
        }

        System.out.println("\n안전한 지역의 칸 수: " + solution(board));

        // 출력:
        // 지뢰지도:
        // [0, 0, 0, 0, 0]
        // [0, 0, 0, 0, 0]
        // [0, 0, 0, 0, 0]
        // [0, 0, 1, 1, 0]
        // [0, 0, 0, 0, 0]

        // 안전한 지역의 칸 수: 13

    }

}
