package problem.lv0.분수의_덧셈;

import library.numberTheory.EuclideanAlgorithm;

public class Main {

    static int[] solution(int denum1, int num1, int denum2, int num2) {
        int denum = denum1 * num2 + denum2 * num1;
        int num = num1 * num2;
        int gcd = EuclideanAlgorithm.GCD(denum, num);

        int[] answer = {denum / gcd, num / gcd};
        return answer;
    }

    public static void main(String[] args) {
        //첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어진다.
        //두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 리턴

        int numer1 = 9;
        int denom1 = 2;    //첫 번째 분수: 9/2
        int numer2 = 1;
        int denom2 = 3;    //두 번째 분수: 1/3
        //answer = [29, 6]: 29/6

        int[] answer = solution(numer1, denom1, numer2, denom2);
        System.out.println("(" + numer1 + " / " + denom1 + ") + (" + numer2 + " / " + denom2 + ") = (" + answer[0] + " / " + answer[1] + ")");

        //출력: (9 / 2) + (1 / 3) = (29 / 6)

    }

}
