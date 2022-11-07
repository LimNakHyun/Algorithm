package problem.lv0.점의_위치_구하기;

import java.util.Arrays;

public class Main {
    
    static int solution(int[] dot) {
        return (dot[0] > 0) ? ((dot[1] > 0) ? 1 : 4) : ((dot[1] > 0) ? 2 : 3);
    }

    public static void main(String[] args) {
        //좌표가 주어지면 몇사분면의 점인지 리턴


        int[] dot = {2, 4}; // [2, 4] 은(는) 1사분면 위의 점

        System.out.println(Arrays.toString(dot) + " 은(는) " + solution(dot) + "사분면 위의 점");
    }

}
