package problem.lv0.제곱수_판별하기;

public class Main {

    static int solution(int n) {
        int answer = 2;
        if(Math.sqrt(n) == (int)Math.sqrt(n)) answer = 1;
        return answer;
    }

    public static void main(String[] args) {
        // 자연수 n이 주어졌을 때, 제곱수면 1 아니면 2를 리턴

        for(int i = 1; i < 20; i++) {
            System.out.println(i + "의 제곱수 판별(제곱수면 1) : " + solution(i));
        }
        
    }

}
