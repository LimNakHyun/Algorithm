package problem.lv0.문자열안에_문자열;

public class Main {
    
    static int solution(String str1, String str2) {
        int answer = 2;
        
        if(str1.contains(str2)) answer -= 1;
        
        return answer;
    }

    public static void main(String[] args) {
        //문자열 str1, str2가 매개변수로 주어집니다.
        //str1 안에 str2가 있다면 1을 없다면 2를 리턴

        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";        //1을 리턴
        // String str1 = "ppprrrogrammers";
        // String str2 = "pppp";        //2를 리턴

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println();

        int indexOfString = str1.indexOf(str2);
        // System.out.println(str2.length());
        // System.out.println(str1.substring(indexOfString, indexOfString + str2.length()));
        
        if(indexOfString != -1) {
            System.out.println("문자열 str1 안에 문자열 str2가 존재한다.");
            System.out.println(str1.substring(0, indexOfString) + " [" + str2 + "] " + str1.substring(indexOfString + str2.length(), str1.length()));
        }
        else System.out.println("문자열 str1 안에 문자열 str2가 존재하지 않는다.");

        System.out.println();

    }

}
