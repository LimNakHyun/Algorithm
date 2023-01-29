package problem.lv1.평균_구하기;

import java.util.Arrays;

public class Main {

    static double solution(int[] arr) {
        double answer = 0;
        for (int i : arr) {
            answer += i;
        }
        return answer / (double)arr.length;
    }

    public static void main(String[] args) {
        //정수를 담고 있는 배열 arr의 평균값을 리턴

        int[] arr = {1,2,3,4};    //answer = 2.5

        System.out.println(Arrays.toString(arr) + "의 평균: " + solution(arr));
    }

}
