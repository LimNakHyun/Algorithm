package problem.lv0.칠의_개수;

import java.util.Arrays;

public class Main {

    static int sevenCount(int num) {
        int count = 0;
        
        while(num > 0) {
            if(num % 10 == 7) count++;
            num /= 10;
        }
        
        return count;
    }
    
    static int solution(int[] array) {
        int answer = 0;
        
        for(int i : array) {
            answer += sevenCount(i);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        //머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.

        int[] array = {7, 77, 17};    //answer = 4

        System.out.println("배열 " + Arrays.toString(array) + "에서 7의 개수는 " + solution(array) + "개 이다.");

    }

}
