package problem.lv0.등수_매기기;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        //영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 한다.
        //영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때,
        //영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 리턴

        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};   //answer = [1, 2, 4, 3]

        // int[][] score = {{70, 70}, {70, 70}, {70, 70}, {70, 70}};

        int[] sorting = new int[201];
        for(int[] i: score) {
            sorting[i[0] + i[1]]++;
        }

        int[] answer = new int[score.length];

        for(int i = 0; i < score.length; i++) {
            int temp = 0;
            for(int j = 200; j > score[i][0] + score[i][1]; j--) {
                temp += sorting[j];
            }
            answer[i] = ++temp;
        }

        System.out.println("답: " + Arrays.toString(answer));

    }

}
