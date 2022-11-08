package problem.lv0.특정_문자_제거하기;

public class Main {
    
    static String solution(String my_string, String letter) {
        return my_string.replaceAll(letter,"");
    }

    public static void main(String[] args) {
        //문자열 my_string과 문자 letter이 매개변수로 주어질 때,
        //my_string에서 letter를 제거한 문자열을 리턴

        String my_string = "abcdef";
        String letter = "f";
        //result = "abcde";

        System.out.println("답 : " + solution(my_string, letter));

    }

}
