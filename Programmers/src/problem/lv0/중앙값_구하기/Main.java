package problem.lv0.중앙값_구하기;

import java.util.Arrays;

import library.sortingAlgorithm.BubbleSort;

public class Main {

    static int solution(int[] array) {

        BubbleSort.intBubbleSort(array, false);

        return array[array.length / 2];
    }

    public static void main(String[] args) {
        //중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미한다.
        //예를 들어 1, 2, 7, 10, 11의 중앙값은 7이다.
        //정수 배열 array가 매개변수로 주어질 때, 중앙값을 리턴

        int[] array = {1, 2, 7, 10, 11};    //answer = 7;

        System.out.println(Arrays.toString(array) +  " 의 중앙값: " + solution(array));
        
    }

}
