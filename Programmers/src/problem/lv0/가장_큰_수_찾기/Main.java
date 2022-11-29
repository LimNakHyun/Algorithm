package problem.lv0.가장_큰_수_찾기;

import java.util.Arrays;

public class Main {
    
    static int[] solution(int[] array) {
        
        int[] answer = new int[2];
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        //정수 배열 array가 매개변수로 주어질 때,
        //가장 큰 수와 그 수의 인덱스를 담은 배열을 리턴

        int[] array = {1, 8, 3};    //answer = [8, 1]

        int[] answer = new int[2];
        answer = solution(array);

        System.out.println("답: " + Arrays.toString(answer) + "\n");
        System.out.println("가장 큰 수 answer[0]: " + answer[0]);
        System.out.println("가장 큰 수의 인덱스 answer[1]: " + answer[1]);

    }

}
