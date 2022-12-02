package problem.lv0.배열_회전시키기;

import java.util.Arrays;

public class Main {
    
    static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("left")) {
            for(int i = 1; i < answer.length; i++) {
                answer[i - 1] = numbers[i];
            }
            answer[answer.length - 1] = numbers[0];
        }
        else {
            for(int i = 0; i < answer.length - 1; i++) {
                answer[i + 1] = numbers[i];
            }
            answer[0] = numbers[numbers.length - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        //정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어진다.
        //배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 리턴

        int[] numbers = {1, 2, 3};
        String direction = "right";     //answer = [3, 1, 2]

        System.out.println(direction + " 방향으로 한 칸씩 회전시킨 배열: " + Arrays.toString(solution(numbers, direction)));

    }

}
