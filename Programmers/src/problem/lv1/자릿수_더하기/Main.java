package problem.lv1.자릿수_더하기;

public class Main {

    static int solution(int n) {
        int answer = 0;
        
        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        //자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 리턴
        //예를들어 N = 123이면 1 + 2 + 3 = 6을 리턴

        int N = 987;    //answer = 24

        System.out.println("자연수 " + N + "의 각 자릿수의 합: " + solution(N));

    }

}
