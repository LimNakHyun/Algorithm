package problem.lv0.문자_반복_출력하기;

public class Main {
    
    static String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++) {
            sb.append(my_string.substring(i, i + 1).repeat(n));
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        //문자열 my_string과 정수 n이 매개변수로 주어질 때, 
        //my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 리턴

        String my_string = "hello";
        int n = 3;
        // result = "hhheeellllllooo";

        System.out.println("답 : " + solution(my_string, n));

    }

}
