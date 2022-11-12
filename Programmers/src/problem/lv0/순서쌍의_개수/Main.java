package problem.lv0.순서쌍의_개수;

public class Main {

    static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= (int)Math.sqrt(n - 1); i++) {
            if(n % i == 0) answer++;
        }
        return (int)Math.sqrt(n - 1) == (int)Math.sqrt(n) - 1 ? answer * 2 + 1 : answer * 2;
    }
    
    public static void main(String[] args) {
        //순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기한다.
        //자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 리턴

        // int n = 20;      //answer = 6
        int n = 100;        //answer = 9

        System.out.println("순서쌍의 개수: " + solution(n));
    }

}
