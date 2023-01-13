package problem.lv0.최빈값_구하기;

import java.util.Arrays;

public class Main {

    static int solution(int[] array) {
        int[] cnt = new int[1001];
        for(int i : array) cnt[i]++;

        int max = 0;
        int idx = 0;
        for(int i = 0; i < 1001; i++) {
            if(cnt[i] > max) {
                max = cnt[i];
                idx = i;
            }
        }

        int count = 0;
        for(int i : cnt) {
            if(i == max) count++;
        }

        return count == 1 ? idx : -1;
    }

    public static void main(String[] args) {
        //최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미한다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 리턴, 최빈값이 여러 개면 -1을 리턴

        int[] array = {1, 2, 3, 3, 3, 4};    //answer = 3

        int result = solution(array);

        if(result != -1) {
            System.out.println(Arrays.toString(array) + "의 최빈값: " + result);
        } else {
            System.out.println(Arrays.toString(array) + "에 최빈값은 존재하지 않습니다.");
        }
        //출력 : [1, 2, 3, 3, 3, 4]의 최빈값: 3
    }

}
