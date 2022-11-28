package problem.lv0.대문자와_소문자;

public class Main {
    
    static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++) {
            
            if(my_string.charAt(i) < 'a') {
                sb.append((char)(my_string.charAt(i) + ('a' - 'A')));
            }
            else {
                sb.append((char)(my_string.charAt(i) - ('a' - 'A')));
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        //문자열 my_string이 매개변수로 주어질 때,
        //대문자는 소문자로 소문자는 대문자로 변환한 문자열을 리턴

        String my_string = "cccCCC";    //answer = CCCccc

        System.out.println("원래 문자열: " + my_string);
        System.out.println("바꾼 문자열: " + solution(my_string));

    }

}
