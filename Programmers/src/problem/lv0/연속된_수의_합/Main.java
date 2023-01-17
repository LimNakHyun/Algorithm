package problem.lv0.연속된_수의_합;

import java.util.Arrays;

public class Main {

    static int[] solution(int num, int total) {

        int[] answer = new int[num];

        int a0 = (((2 * total - num * num) / num) + 1) / 2;

        for(int i = a0; i < a0 + num; i++) {
            answer[i - a0] = i;
        }

        return answer;
    }

    public static void main(String[] args) {
        //연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5이다. 두 정수 num과 total이 주어진다.
        //연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 리턴

        int num = 3;
        int total = 12;    //answer = [3, 4, 5]

        System.out.println("연속된 수 " + num + "개를 더한 값이 " + total + "인 수들: " + Arrays.toString(solution(num, total)));

    }

}
