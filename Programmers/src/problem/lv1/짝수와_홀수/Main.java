package problem.lv1.짝수와_홀수;

public class Main {

    static String solution(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        //정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성하라

        int num = 3;    //answer = "Odd"

        System.out.println("숫자 " + num + ": " + solution(num));

    }

}
