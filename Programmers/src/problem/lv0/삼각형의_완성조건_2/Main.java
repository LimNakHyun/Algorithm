package problem.lv0.삼각형의_완성조건_2;

import java.util.Arrays;

public class Main {

    static int solution(int[] sides) {
        return (2 * Math.min(sides[0], sides[1]) - 1);
    }

    public static void main(String[] args) {
        //선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 한다.
        // 조건) 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 한다.
        //삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어질 때, 나머지 한 변이 될 수 있는 정수의 개수를 리턴

        int[] sides = {11, 7};

        System.out.println("삼각형의 두 변: " + Arrays.toString(sides) + " 에 대해 나머지 한 변이 될 수 있는 정수의 개수: " + solution(sides) + "개");

    }

}
