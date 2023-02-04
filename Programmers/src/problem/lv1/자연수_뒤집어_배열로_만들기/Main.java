package problem.lv1.자연수_뒤집어_배열로_만들기;

import java.util.Arrays;

public class Main {

    static int[] solution(long n) {
        int len = (int)(Math.log10(n) + 1);
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            int temp = (int)(n % 10);
            answer[i] = temp;
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        //자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴
        //예를들어 n이 12345이면 [5,4,3,2,1]을 리턴

        int n = 12345;

        System.out.println("자연수 " + n + "을 뒤집은 배열: " + Arrays.toString(solution(n)));

    }

}
