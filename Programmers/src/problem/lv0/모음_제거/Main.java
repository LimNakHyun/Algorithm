package problem.lv0.모음_제거;

public class Main {
    
    static String solution(String my_string) {
        String answer = "";
        answer = my_string.replaceAll("[aeiou]", "");
        return answer;
    }

    public static void main(String[] args) {
        //문자열 my_string이 매개변수로 주어질 때
        //모음을 제거한 문자열을 리턴

        String my_string = "bus";   //answer = bs

        System.out.println(my_string + " 의 모음을 제거한 결과: " + solution(my_string));

    }

}
