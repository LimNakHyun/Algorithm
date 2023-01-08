package problem.lv0.특이한_정렬;

import java.util.Arrays;

import library.baseConcept.Swap;

public class Main {

    static void exBubbleSort(int[] arr, int n) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {

                if(Math.abs(n - arr[i]) > Math.abs(n - arr[j])) Swap.swapInt(arr, i, j);

                else if(Math.abs(n - arr[i]) == Math.abs(n - arr[j])) {
                    if(arr[j] > arr[i]) Swap.swapInt(arr, i, j);
                }
            }
        }
    }

    static int[] solution(int[] numlist, int n) {
        exBubbleSort(numlist, n);;
        return numlist;
    }

    public static void main(String[] args) {
        //정수 n을 기준으로 n과 가까운 수부터 정렬하려고 한다. 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치한다.
        //정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 리턴

        int[] numlist = {10000,20,36,47,40,6,10,7000};
        int n = 30;    //answer = [36, 40, 20, 47, 10, 6, 7000, 10000]

        System.out.println("numlist " + Arrays.toString(numlist) + "를 " + n + "에 가까운 순서대로 정렬: " + Arrays.toString(solution(numlist, n)));
        //출력 : numlist [10000, 20, 36, 47, 40, 6, 10, 7000]를 30에 가까운 순서대로 정렬: [36, 40, 20, 47, 10, 6, 7000, 10000]

    }

}
