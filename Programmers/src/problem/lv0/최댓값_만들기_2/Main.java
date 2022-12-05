package problem.lv0.최댓값_만들기_2;

import java.util.Arrays;

public class Main {
    
    static int solution(int[] numbers) {
        int max1 = numbers[0];
        int max2 = numbers[1];
        int min1 = numbers[0];
        int min2 = numbers[1];
        
        int answer = 0;
        
        for(int i = 2; i < numbers.length; i++) {
            if(numbers[i] > max1) {
                if(max1 > max2) max2 = max1;
                max1 = numbers[i];
            }
            else if(numbers[i] > max2) {
                max2 = numbers[i];
            }
            
            if(numbers[i] < min1) {
                if(min1 < min2) min2 = min1;
                min1 = numbers[i];
            }
            else if(numbers[i] < min2) {
                min2 = numbers[i];
            }
        }
        answer = (max1 * max2 > min1 * min2) ? max1 * max2 : min1 * min2;
        
        return answer;
    }

    public static void main(String[] args) {
        //정수 배열 numbers가 매개변수로 주어진다.
        //numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 리턴

        int[] numbers = {1, 2, -3, 4, -5};    //answer = 15

        System.out.println("\n정수 배열 " + Arrays.toString(numbers) + "의 원소 중\n\n두 개를 곱해 만들 수 있는 수의 최댓값: " + solution(numbers) + "\n");

    }

}
