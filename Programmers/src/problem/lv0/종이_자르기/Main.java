package problem.lv0.종이_자르기;

public class Main {

    static int solution(int M, int N) {
        return M * N - 1;
    }

    public static void main(String[] args) {
        //머쓱이는 큰 종이를 1 x 1 크기로 자르려고 한다. 예를 들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세 번이 필요하다.
        //정수 M, N이 매개변수로 주어질 때, M x N 크기의 종이를 최소로 가위질 해야하는 횟수를 리턴

        int M = 2;
        int N = 5;    //answer = 9

        System.out.println("[" + M + " x " + N + "] 크기의 종이를 1 x 1 크기로 자르기 위해 필요한 가위질: " + solution(M, N));

    }

}
