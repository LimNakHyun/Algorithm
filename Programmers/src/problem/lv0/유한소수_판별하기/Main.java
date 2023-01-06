package problem.lv0.유한소수_판별하기;

public class Main {

    static int solution(int a, int b) {
        int answer = (a * 1000) % b == 0 ? 1 : 2;
        return answer;
    }

    public static void main(String[] args) {
        //소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 한다. 분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 한다.
        //유한소수가 되기 위한 분수의 조건은 "기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 한다." 이다.
        //두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을, 무한소수라면 2를 리턴

        int a = 7;
        int b = 20;    //answer = 1

        System.out.print("분수 " + a + " / " + b);

        int isFiniteDecimal = solution(a, b);

        if(isFiniteDecimal == 1) {
            System.out.println(" 은(는) 유한소수로 나타낼 수 있다.");
        } else {
            System.out.println(" 은(는) 유한소수로 나타낼 수 없다.");
        }

        //결과 출력 : 분수 7 / 20 은(는) 유한소수로 나타낼 수 있다.
    }
}
