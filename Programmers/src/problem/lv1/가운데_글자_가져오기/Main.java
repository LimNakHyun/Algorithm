package problem.lv1.가운데_글자_가져오기;

public class Main {

    static String solution(String s) {
        int len = s.length();
        if(len % 2 == 0) {
            return s.substring(len/2 - 1, len/2 + 1);
        } else{
            return s.substring(len/2, len/2 + 1);
        }
    }

    public static void main(String[] args) {
        // 문자열 s가 주어졌을 때, 그 문자열의 가운데 문자를 리턴

        String s = "abcde";
        System.out.println("가운데 글자 : " + solution(s)); // 가운데 글자인 c를 리턴
    }

}
