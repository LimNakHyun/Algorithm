package problem.lv2.구명보트;

import java.util.Arrays;

import library.sortingAlgorithm.CountingSort;

public class Main {
    
    public static void main(String[] args) {
        //제한사항
        // 무인도에 갇힌 사람 people의 길이는 1명 이상 50,000명 이하
        // 각 사람의 몸무게 people의 원소는 40kg 이상 240kg 이하
        // 구명보트의 무게 제한 limit는 40kg 이상 240kg 이하

        // int[] people = {70, 50, 80, 50};
        // int limit = 100;     // answer = 3

        // int[] people = {70, 80, 50};
        // int limit = 100;     // answer = 3

        int[] people = {40, 80, 70, 100, 40, 50, 80, 50, 90, 60};
        int limit = 130;

        CountingSort.countingSort(people, false);
        System.out.println("정렬한 무게: " + Arrays.toString(people));

        int limitMax = limit - people[0];
        System.out.println("한계최대: " + limitMax);

        int limitMaxIndex = 0;
        for(int i = 0; i < people.length; i++) {
            if(people[i] > limitMax) {
                limitMaxIndex = i - 1;
                break;
            }
        }
        System.out.println("한계 최대 인덱스: " + limitMaxIndex);

        int answer = 0;
        int temp = limitMaxIndex;
        boolean exit = false;
        for(int i = 0; i <= limitMaxIndex; i++) {
            // System.out.println("people요소 출력: " + people[i]);

            for(int j = temp; j > 0; j--) {
                if(people[i] + people[j] <= limit && j > i) {
                    System.out.println("answer++");
                    System.out.println("i번째: " + people[i]);
                    System.out.println("j번째: " + people[j]);
                    System.out.println();
                    answer++;
                    temp = --j;
                    break;
                }
                else if(people[i] + people[j] > limit || j <= i) {
                    System.out.println("break");
                    System.out.println("i번째: " + people[i]);
                    System.out.println("j번째: " + people[j]);
                    System.out.println();
                    answer += people.length - 2 * i;
                    exit = true;
                    break;
                }
            }
            if(exit) break;
        }

        System.out.println("답: " + answer);

    }

}