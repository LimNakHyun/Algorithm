package problem.lv0.문자열_정렬하기_2;

import library.sortingAlgorithm.BubbleSort;

public class Main {
    
    static String solution(String my_string) {
        
        //문자열을 소문자 char배열로 만들어줌
        char[] ch = my_string.toLowerCase().toCharArray();
        
        BubbleSort.charBubbleSort(ch, false);
        
        return new String(ch);
    }

    public static void main(String[] args) {
        //영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
        //my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 리턴

        String my_string = "Bcad";    //answer = abcd

        System.out.println(my_string + "을 소문자로 바꾼 후, 알파벳 순서대로 정렬한 문자열: " + solution(my_string));

    }

}
