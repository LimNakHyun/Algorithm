package problem.lv0.이진수_더하기;

public class Main {

    static String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.valueOf(bin1, 2) + Integer.valueOf(bin2, 2));
    }

    public static void main(String[] args) {
        //이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 리턴

        String bin1 = "1001";
        String bin2 = "1111";    //answer = 11000

        System.out.println("이진수 " + bin1 + "과 " + bin2 + "의 합: " + solution(bin1, bin2));

    }

}
