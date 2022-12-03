package problem.lv0.인덱스_바꾸기;

public class Main {
    
    static String solution(String my_string, int num1, int num2) {
        
        char[] c = my_string.toCharArray();
        
        char temp = c[num1];
        c[num1] = c[num2];
        c[num2] = temp;
        
        return new String(c);
    }

    public static void main(String[] args) {
        //문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
        //my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 리턴

        String my_string = "hello";

        int num1 = 1;
        int num2 = 2;   //answer = hlelo

        System.out.println(my_string + "의 " + num1 + "번째 문자와 " + num2 +"번째 문자를 바꾼 문자열: " + solution(my_string, num1, num2));

    }

}
