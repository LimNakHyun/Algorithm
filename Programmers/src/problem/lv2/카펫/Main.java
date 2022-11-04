package problem.lv2.카펫;

import java.util.Arrays;

import library.algebra.QuadraticFormula;

public class Main {

    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;
        int quotient = 0;

        int[] answer = new int[2];

        // 1. 완전탐색을 활용한 풀이
        for(int i = 3; i < brown + yellow; i++) {
            boolean flag = false;
            if((brown + yellow) % i == 0) {
                quotient = (brown + yellow) / i;
                // System.out.println("i값 : " + i);
                // System.out.println("몫 : " + quotient);
            }

            if(quotient != 0) {
                if((i - 2) * (quotient - 2) == yellow) flag = true;
            }

            if(flag) {
                answer[0] = quotient;
                answer[1] = i;
                break;
            }
        }

        // System.out.println("답 : " + Arrays.toString(answer));


        // 2. 주어진 직사각형의 두 변의 길이의 곱과 합을 활용한 풀이
        int side = brown / 2 + 2;
        // System.out.println("side : " + side);
        int all = brown + yellow;

        double[] ans = QuadraticFormula.quadraticFormula(1, -side, all);
        System.out.println("답 : " + Arrays.toString(ans));
    }
}
