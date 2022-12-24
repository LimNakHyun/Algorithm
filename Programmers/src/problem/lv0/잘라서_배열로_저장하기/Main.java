package problem.lv0.잘라서_배열로_저장하기;

import java.util.Arrays;

public class Main {

    static String[] solution(String my_str, int n) {
        
        String[] answer = new String[(my_str.length() % n == 0) ? my_str.length() / n : my_str.length() / n + 1];
        
        for(int i = 0; i < answer.length - 1; i++) {
            answer[i] = my_str.substring(i * n, (i + 1) * n);
        }
        answer[answer.length - 1] = my_str.substring((answer.length - 1) * n, my_str.length());
        
        return answer;
    }

    public static void main(String[] args) {
        //문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 리턴

        String my_str = "abc1Addfggg4556b";
        int n = 6;    //answer = ["abc1Ad", "dfggg4", "556b"]

        System.out.println("[" + my_str + "] 문자열을 길이 " + n + "씩 잘라서 저장한 배열: " + Arrays.toString(solution(my_str, n)));

    }

}
