package problem.lv0.문자열_정렬하기_1;

import java.util.Arrays;

import library.sortingAlgorithm.BubbleSort;

public class Main {

    //1. my_string에 숫자가 몇개 있는지 체크
    static int numberCount(String my_string) {
        int n = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if((int)my_string.charAt(i) < 'a') n++;
        }
        return n;
    }

    //3. my_string 생성한 배열에 숫자를 집어넣음
    static void appendNumber(int[] arr, String my_string) {
        int temp = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if((int)my_string.charAt(i) < 'a') arr[temp++] = (int)my_string.charAt(i) - 48;
        }
    }

    static int[] solution(String my_string) {
        int[] answer = new int[numberCount(my_string)]; //2. my_string에 있는 숫자의 개수로 배열 생성
        appendNumber(answer, my_string);
        BubbleSort.bubbleSort(answer, false);       //4. 배열에 넣은 숫자들을 BubbleSort로 정렬
        return answer;
    }
    
    public static void main(String[] args) {
        //문자열 my_string이 매개변수로 주어질 때,
        //my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 리턴

        String my_string = "hi12392";   //answer = [1, 2, 2, 3, 9]

        System.out.println("숫자만 골라 오름차순 정렬: " + Arrays.toString(solution(my_string)));

    }

}
