package problem.lv0.팩토리얼;

public class Main {

    static int solution(int n) {
        int answer = 0;
        int factorial = 1;
        for(int i = 2; i < 10; i++) {
            factorial *= i;
            if(factorial > n) {
                answer = i - 1;
                break;
            }
        }
        return (answer == 0) ? 10 : answer;
    }

    public static void main(String[] args) {
        //i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미한다. 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 이다.
        //정수 n이 주어질 때 [i! ≤ n]를 만족하는 가장 큰 정수 i를 리턴

        int n = 3628800;    //answer = 10

        System.out.println(n + "이하의 가장 큰 i!: " + solution(n) + "!");

    }

}
