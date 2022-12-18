package problem.lv0.진료_순서_정하기;

import java.util.Arrays;

public class Main {

    static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < answer.length; i++) {
            int temp = 1;
            for(int j = 0; j < emergency.length; j++) {
                if(emergency[i] < emergency[j]) {
                    temp++;
                }
            }
            answer[i] = temp;
        }
        return answer;
    }

    public static void main(String[] args) {
        //외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 한다.
        //정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 리턴

        int[] emergency = {3, 76, 24};    //answer = [3, 1, 2]

        System.out.println("환자의 응급도가 " + Arrays.toString(emergency) + "일 때, 응급도가 높은 순서대로 정한 진료순서: " + Arrays.toString(solution(emergency)));

    }

}
