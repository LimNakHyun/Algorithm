package problem.lv0.배열_자르기;

import java.util.Arrays;

public class Main {

    static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        for(int i = 0; i < answer.length; i++) answer[i] = numbers[i + num1];
        return answer;
    }

    public static void main(String[] args) {
        //정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
        //numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 리턴

        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;

        //answer = [2, 3, 4]
        System.out.println("자른 배열 : " + Arrays.toString(solution(numbers, num1, num2)));

    }

}
