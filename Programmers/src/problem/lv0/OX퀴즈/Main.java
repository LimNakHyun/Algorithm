package problem.lv0.OX퀴즈;

import java.util.Arrays;

public class Main {

    static boolean OXquiz(String formula) {
        String[] temp = formula.split(" ");
        boolean answer = (Integer.parseInt(temp[0]) + Integer.parseInt(temp[2]) * ((temp[1].equals("+")) ? 1 : (-1)) == Integer.parseInt(temp[4])) ? true : false;
        return answer;
    }
    
    static String[] solution(String[] quiz) {
        for(int i = 0; i < quiz.length; i++) {
            quiz[i] = OXquiz(quiz[i]) ? "O" : "X";
        }

        return quiz;
    }

    public static void main(String[] args) {
        //덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다. 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.

        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};    //answer = [X, O]

        System.out.println("주어진 문제: ");
        for(String problem: quiz) {
            System.out.println(problem);
        }
        System.err.print("에 대한 답안은 ");
        System.out.println(Arrays.toString(solution(quiz)) + " 입니다.");
        //출력: 주어진 문제: 
        //      3 - 4 = -3
        //      5 + 6 = 11
        //      에 대한 답안은 [X, O] 입니다.
    }

}
