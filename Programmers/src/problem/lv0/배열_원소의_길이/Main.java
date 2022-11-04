package problem.lv0.배열_원소의_길이;

import java.util.Arrays;

public class Main {

    static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        
        return answer;
    }

    public static void main(String[] args) {
        
        //문자열 배열 strlist가 매개변수로 주어진다.
        //strlist 각 원소의 길이를 담은 배열을 리턴

        String[] strlist = {"We", "are", "the", "world!"};

        System.out.println(Arrays.toString(solution(strlist))); //answer = [2, 3, 3, 6]

    }

}
