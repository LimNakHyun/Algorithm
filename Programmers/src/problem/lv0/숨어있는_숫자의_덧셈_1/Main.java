package problem.lv0.숨어있는_숫자의_덧셈_1;

public class Main {
    
    static int solution(String my_string) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) < 'A') answer += (int)my_string.charAt(i) - '0';
        }
        return answer;
    }

    public static void main(String[] args) {
        //문자열 my_string이 매개변수로 주어진다.
        //my_string안의 모든 자연수들의 합을 리턴

        String my_string = "aAb1B2cC34oOp";     //answer = 10

        System.out.println("숨어있는 수들의 합: " + solution(my_string));

    }

}
