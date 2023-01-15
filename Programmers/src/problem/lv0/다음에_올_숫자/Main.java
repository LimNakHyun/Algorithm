package problem.lv0.다음에_올_숫자;

import java.util.Arrays;

public class Main {

    static int solution(int[] common) {
        return (common[0] + common[2] == 2 * common[1]) ? common[common.length - 1] + common[1] - common[0] : common[common.length - 1] * common[1] / common[0];
    }

    public static void main(String[] args) {
        //등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 리턴

        int[] common = {2, 4, 8};

        System.out.println("등차수열 및 등비수열 " + Arrays.toString(common) + "의 다음에 올 숫자: " + solution(common));

    }

}
