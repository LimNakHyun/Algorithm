package problem.lv1.약수의_합;

public class Main {

    static int solution(int n) {
        int answer = 0;

        for (int i = 1; i < (int)Math.sqrt(n) + 1; i++) {
            answer += (n % i == 0) && (i * i != n) ? (i + n / i) : 0;
            answer += (n % i == 0) && (i * i == n) ? i : 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        //정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴

        int n = 12;    //answer = 28

        System.out.println(n + "의 약수를 모두 더한 값: " + solution(n));

    }

}
