package problem.lv0.배열의_유사도;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    
    static int solution(String[] s1, String[] s2, ArrayList list) {
        int answer = 0;
        
        for(String s : s1) {
            for(String t : s2) {
                if(s.equals(t)) {
                    answer++;
                    list.add(s);
                    break;
                }
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        //두 배열이 얼마나 유사한지 확인해보려고 한다.
        //문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 리턴

        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        //answer = 2;
        ArrayList<String> list = new ArrayList<>();

        System.out.println("s1 배열 : " + Arrays.toString(s1));
        System.out.println("s2 배열 : " + Arrays.toString(s2));
        System.out.println();

        int answer = solution(s1, s2, list);
        System.out.println("같은 원소 : " + list);
        System.out.println();
        
        System.out.println("답 : " + answer);

    }

}
