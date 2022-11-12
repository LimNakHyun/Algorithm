package problem.lv0.짝수는_싫어요;

import java.util.Arrays;

public class Main {
    
    static int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2];
        for(int i = 1; i <= n; i += 2) answer[i / 2] = i;
        return answer;
    }

    public static void main(String[] args) {
        //정수 n이 매개변수로 주어질 때,
        //n 이하의 홀수가 오름차순으로 담긴 배열을 리턴

        int n = 10;     //[1, 3, 5, 7, 9] 리턴
        // int n = 15;     //[1, 3, 5, 7, 9, 11, 13, 15] 리턴

        System.out.println("리턴된 배열: " + Arrays.toString(solution(n)));
    }

}
