package problem.lv0.옹알이_1;

import java.util.Arrays;

public class Main {

    static int solution(String[] babbling) {
        int answer = 0;
        
        for(String s : babbling) {
            s = s.replaceAll("ayaaya|yeye|woowoo|mama", "-");

            String[] temp = s.split("aya|ye|woo|ma");
            if(temp.length == 0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        //머쓱이는 태어난 지 6개월 된 조카를 돌보고 있다.
        //조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못한다.
        //문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 리턴

        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println("매개변수로 주어진 단어 " + Arrays.toString(babbling) + "중 발음할 수 있는 단어의 개수: " + solution(babbling));

        //출력 결과:
        //매개변수로 주어진 단어 [ayaye, uuuma, ye, yemawoo, ayaa]중 발음할 수 있는 단어의 개수: 3

    }

}
