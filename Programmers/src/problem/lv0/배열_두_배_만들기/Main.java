package problem.lv0.배열_두_배_만들기;

import java.util.Arrays;

public class Main {
    
    static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) answer[i] = numbers[i] * 2;
        return answer;
    }

    public static void main(String[] args) {
        
        //정수 배열 numbers가 매개변수로 주어질 떄
        //numbers의 각 원소에 두배한 원소를 가진 배열을 리턴

        int[] numbers = {1, 2, 3, 4, 5};    // answer = [2, 4, 6, 8, 10]

        System.out.println("답 : " + Arrays.toString(solution(numbers)));

    }

}
