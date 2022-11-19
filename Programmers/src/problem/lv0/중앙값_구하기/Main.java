package problem.lv0.중앙값_구하기;

import library.sortingAlgorithm.BubbleSort;

public class Main {
    
    // static int solution(int[] array) {
    //     int temp = 0;

    //     for(int i = 0; i < array.length - 1; i++) {
    //         for(int j = i + 1; j < array.length; j++) {
    //             if(array[i] > array[j]) {
    //                 temp = array[j];
    //                 array[j] = array[i];
    //                 array[i] = temp;
    //             }
    //         }
    //     }
    //     return array[array.length / 2];
    // }

    static int solution(int[] array) {
        // int temp = 0;

        // for(int i = 0; i < array.length - 1; i++) {
        //     for(int j = i + 1; j < array.length; j++) {
        //         if(array[i] > array[j]) {
        //             temp = array[j];
        //             array[j] = array[i];
        //             array[i] = temp;
        //         }
        //     }
        // }

        BubbleSort.bubbleSort(array, false);

        return array[array.length / 2];
    }

    public static void main(String[] args) {
        //중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미한다.
        //예를 들어 1, 2, 7, 10, 11의 중앙값은 7이다.
        //정수 배열 array가 매개변수로 주어질 때, 중앙값을 리턴

        int[] array = {1, 2, 7, 10, 11};    //answer = 7;

        System.out.println("답: " + solution(array));
        
    }

}
