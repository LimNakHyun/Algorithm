package problem.lv0.가까운_수;

import java.util.Arrays;

public class Main {

    static int solution(int[] array, int n) {
        int diff = 100;
        int answer = 0;
        
        for(int i : array) {
            if(diff > Math.abs(i - n)) {
                diff = Math.abs(i - n);
                answer = i;
            }
            else if(diff == Math.abs(i - n)) {
                if(answer > i) answer = i;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        //정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 리턴

        int[] array = {3, 10, 28};
        int n = 20;    //answer = 28

        System.out.println("정수배열 " + Arrays.toString(array) + "에서 " + n + "과 가장 가까운 수: " + solution(array, n));

    }

}
