package problem.lv0.외계어_사전;

import java.util.Arrays;

public class Main {

    static int solution(String[] spell, String[] dic) {
        int answer = 2;

        int spellsum = 0;
        for(String s : spell) {
            spellsum += (int)s.charAt(0);
        }

        for(String s : dic) {
            int temp = 0;
            for(int i = 0; i < s.length(); i++) {
                temp += (int)s.charAt(i);
            }

            if(temp == spellsum) {
                answer = 1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        //PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 한다.
        //알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어진다.
        //spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1, 존재하지 않는다면 2를 리턴

        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};    //answer = 2

        System.out.println("spell 배열: " + Arrays.toString(spell));
        System.out.println("dic 배열: " + Arrays.toString(dic) + "\n");
        
        int checkDic = solution(spell, dic);
        if(checkDic == 1) {
            System.out.println("spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다.");
        } else {
            System.out.println("spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재하지 않는다.");
        }

    }

}
