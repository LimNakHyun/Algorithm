package problem.lv0.모스_부호_1;

import java.util.HashMap;

public class Main {

    static String solution(String letter) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
        "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        
        HashMap<String, Character> almo = new HashMap<>();
        for(int i = 0; i < morse.length; i++) {
            almo.put(morse[i], (char)(i + (int)'a'));
        }
        
        String[] leArr = letter.split(" ");
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < leArr.length; i++) {
            answer.append(almo.get(leArr[i]));
        }
        
        return answer.toString();
    }

    public static void main(String[] args) {
        //머쓱이는 친구에게 모스부호를 이용한 편지를 받았다. 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 한다.
        //문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 리턴

        String letter = ".... . .-.. .-.. ---";    //answer = hello

        System.out.println("모스 부호 [" + letter + "]" + "를 영어 소문자로 바꾼 문자열: " + solution(letter));

    }

}
