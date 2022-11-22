package problem.lv1.두_개_뽑아서_더하기;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        //정수 배열 numbers가 주어진다.
        //numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서
        //만들 수 있는 모든 수를 배열에 오름차순으로 담아 리턴

        int[] numbers = {2,1,3,4,1};    //answer = [2,3,4,5,6,7]

        int[] sums = new int[201];
        int count = 0;


        //두 수의 합을 카운팅 솔트 기법으로 sums에 표시함
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(sums[numbers[i] + numbers[j]] == 0) {
                    sums[numbers[i] + numbers[j]]++;
                    count++;
                }
            }
        }

        //sums에서 0이 아닌 값의 인덱스를 배열로 불러옴
        int[] answer = new int[count--];
        for(int i = sums.length - 1; i >= 0; i--) {
            if(sums[i] != 0) {
                answer[count--] = i;
            }
        }

        System.out.println("답: " + Arrays.toString(answer));

    }

}
