package problem.lv0.약수_구하기;

import java.util.Arrays;

public class Main {
    
    static int[] solution(int n) {
        int cnt = 0;
        for(int i = 1; i < (int)Math.sqrt(n) + 1; i++) {
            if(n % i == 0 && n / i != i) cnt += 2;
            else if((double)n / i == i) cnt++;
        }
        
        int[] answer = new int[cnt];
        int ind = 0;
        for(int i = 1; i < (int)Math.sqrt(n) + 1; i++) {
            if(n % i == 0) {
                answer[ind] = i;
                answer[cnt - 1 - ind++] = n / i;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        //정수 n이 매개변수로 주어질 때,
        //n의 약수를 오름차순으로 담은 배열을 리턴

        int n = 24;    //answer = [1, 2, 3, 4, 6, 8, 12, 24]

        System.out.println(n + "의 약수: " + Arrays.toString(solution(n)));

    }

}
