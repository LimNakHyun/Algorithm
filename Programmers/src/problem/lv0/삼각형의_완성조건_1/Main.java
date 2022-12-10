package problem.lv0.삼각형의_완성조건_1;

import java.util.Arrays;

import library.sortingAlgorithm.BubbleSort;

public class Main {
    
    static int solution(int[] sides) {
        BubbleSort.intBubbleSort(sides, false);
        return (sides[0] + sides[1] > sides[2]) ? 1 : 2;
    }

    public static void main(String[] args) {
        //세 개로 삼각형을 만들기 위해서는 다음의 조건을 만족해야 한다.

        //-가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 한다.-

        //삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어진다.
        //세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 리턴

        int[] sides = {199, 72, 222};    //answer = 1;

        int checkTriangle = solution(sides);

        if(checkTriangle == 1) {
            System.out.println("주어진 세 변" + Arrays.toString(sides) + "으로 삼각형을 만들 수 있다.");
        } else {
            System.out.println("주어진 세 변" + Arrays.toString(sides) + "으로 삼각형을 만들 수 없다.");
        }

    }

}
