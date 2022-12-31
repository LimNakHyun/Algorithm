package problem.lv0.컨트롤_제트;

public class Main {

    static void push(String[] s, String n, int i) {
        s[i] = n;
    }
    
    static void pop(String[] s, int i) {
        s[i] = null;
    }
    
    static int solution(String s) {
        
        String[] arr = s.split(" ");
        int answer = 0;
        int ind = 0;

        String[] st = new String[arr.length];

        for(int i = 0; i < arr.length; i++) {
            if(!arr[i].equals("Z")) {
                push(st, arr[i], ind++);
            }
            else {
                if(ind != 0) {
                    pop(st, ind--);
                }
            }
        }

        for(int i = 0; i < ind; i++) {
            answer += Integer.parseInt(st[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        //숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어진다. 문자열에 있는 숫자를 차례대로 더하려고 한다.
        //이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻이다. 숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 구한 값을 리턴

        String s = "1 2 Z 3";    //answer = 4

        System.out.println("[" + s + "] 를 계산한 값: " + solution(s));

    }

}
