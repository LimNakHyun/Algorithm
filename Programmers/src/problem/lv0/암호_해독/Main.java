package problem.lv0.암호_해독;

public class Main {
    
    static String solution(String cipher, int code) {
        
        char[] res = new char[cipher.length() / code];
        for(int i = 0; i < cipher.length() / code; i++) {
            res[i] = cipher.charAt((i + 1) * code - 1);
        }
        
        return new String(res);
    }

    public static void main(String[] args) {
        //전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈다.

        // - 암호화된 문자열 cipher를 주고받는다.
        // - 그 문자열에서 code의 배수 번째 글자만 진짜 암호다.

        //문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 리턴

        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;   //answer = "attack"

        System.out.println(cipher + " 의 " + code + "의 배수번째 문자만 합한 문자열: " + solution(cipher, code));

    }

}
