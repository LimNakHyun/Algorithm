package problem.lv2.짝지어_제거하기;

import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // 문자열 s가 주어졌을 때, aa, bb, cc, ... 와 같은 문자열들을
        // 계속적으로 제거하여 길이를 0으로 만들 수 있으면 1을, 아니면 0을 리턴

        String s = "baabaa";    //stack 의 길이가 0이 되기 때문에 1을 리턴
        // String s = "abcde";    //stack 의 길이가 0이 되지않기 때문에 0을 리턴

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(0, i) + "[" + s.substring(i, i + 1) + "]" + s.substring(i + 1, s.length()));
            System.out.println(i + "번째 스택상태 (전) : " + stack);
            if(stack.empty() || (stack.peek() != s.charAt(i))) stack.push(s.charAt(i));
            else if (stack.peek() == s.charAt(i)) stack.pop();
            System.out.println(i + "번째 스택상태 (후) : " + stack);
            System.out.println();
        }
        // System.out.println(stack);
        // System.out.println(stack.size());
        // System.out.println(stack.peek());

        int answer = (stack.size() == 0) ? 1 : 0;
        System.out.println("답 : " + answer);

    }

}
