package problem.lv0.직사각형_넓이_구하기;

import java.util.Arrays;

public class Main {

    static int solution(int[][] dots) {
        int answer = Math.abs(dots[0][0] * dots[1][1] + dots[1][0] * dots[2][1] + dots[2][0] * dots[0][1]
            - dots[1][0] * dots[0][1] - dots[2][0] * dots[1][1] - dots[0][0] * dots[2][1]);
        return answer;
    }

    public static void main(String[] args) {
        //2차원 좌표 평면에 변이 축과 평행한 직사각형이 있다.
        //직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때, 직사각형의 넓이를 리턴

        int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};    //answer = 1

        System.out.print("직사각형의 네 꼭짓점의 좌표: ");
        for(int[] dot: dots) {
            System.out.print(Arrays.toString(dot) + " ");
        }
        System.out.println();
        System.out.print("직사각형의 넓이: ");
        System.out.println(solution(dots));

    }

}
