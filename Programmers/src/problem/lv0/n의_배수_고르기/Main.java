package problem.lv0.n의_배수_고르기;

import java.util.Arrays;

public class Main {

    static int[] solution(int n, int[] numlist) {
        int cnt = 0;
        for(int num : numlist) {
            if(num % n == 0) cnt++;
        }
        
        int[] answer = new int[cnt];
        
        int ind = 0;
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) answer[ind++] = numlist[i];
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        //정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
        //numlist에서 n의 배수가 아닌 수들을 제거한 배열을 리턴

        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};     //answer = [6, 9, 12]

        System.out.println(n + "의 배수가 아닌 수들을 제거한 배열: " + Arrays.toString(solution(n, numlist)));

    }

}
