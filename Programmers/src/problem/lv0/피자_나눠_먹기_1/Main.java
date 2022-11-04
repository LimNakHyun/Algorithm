package problem.lv0.피자_나눠_먹기_1;

public class Main {

    static int solution(int n) {
        int answer = n / 7;
        return answer = (n % 7 == 0) ? answer : ++answer;
    }

    public static void main(String[] args) {

        //머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 준다.
        //피자를 나눠먹을 사람의 수 n이 주어질 때,
        //모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 리턴

        int n = 15;
        System.out.println("필요한 피자 : " + solution(n));
    }
    
}
