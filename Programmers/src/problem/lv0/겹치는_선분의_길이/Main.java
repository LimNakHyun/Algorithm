package problem.lv0.겹치는_선분의_길이;

import java.util.Arrays;

public class Main {

    static int solution(int[][] lines) {
        
        int doubleIntersect1 = Math.min(lines[0][1], lines[1][1]) - Math.max(lines[0][0], lines[1][0]);
        doubleIntersect1 = doubleIntersect1 > 0 ? doubleIntersect1 : 0;
        
        int doubleIntersect2 = Math.min(lines[1][1], lines[2][1]) - Math.max(lines[1][0], lines[2][0]);
        doubleIntersect2 = doubleIntersect2 > 0 ? doubleIntersect2 : 0;
        
        int doubleIntersect3 = Math.min(lines[0][1], lines[2][1]) - Math.max(lines[0][0], lines[2][0]);
        doubleIntersect3 = doubleIntersect3 > 0 ? doubleIntersect3 : 0;
        
        int tripleIntersect = Math.min(Math.min(lines[0][1], lines[1][1]), lines[2][1]) - Math.max(Math.max(lines[0][0], lines[1][0]), lines[2][0]);
        tripleIntersect = tripleIntersect > 0 ? tripleIntersect : 0;
        
        int answer = doubleIntersect1 + doubleIntersect2 + doubleIntersect3 - 2 * tripleIntersect;
        
        return answer;
    }

    public static void main(String[] args) {
        //선분 3개가 평행하게 놓여 있다.
        //세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때,
        //두 개 이상의 선분이 겹치는 부분의 길이를 리턴

        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};    //answer = 2

        System.out.println("세 선분: ");
        for(int[] line: lines) {
            System.out.println(Arrays.toString(line));
        }
        System.out.println("세 선분에 대해 두 개 이상의 선분이 겹치는 길이: " + solution(lines));
    }

}
