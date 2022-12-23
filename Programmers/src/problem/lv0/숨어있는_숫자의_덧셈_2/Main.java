package problem.lv0.숨어있는_숫자의_덧셈_2;

public class Main {

    static int solution(String my_string) {
        String[] temp = my_string.split("[a-zA-Z]+");
        if(temp.length == 0) return 0;
        int answer = 0;
        
        answer += (temp[0].matches("[0-9]+")) ? Integer.parseInt(temp[0]) : 0;
        System.out.print("[");
        if(answer != 0) System.out.print(answer + ", ");
        
        for(int i = 1; i < temp.length; i++) {
            answer += Integer.parseInt(temp[i]);
            if(i == temp.length - 1) {
                System.out.print(temp[i] + "] 의 합: ");
            } else {
                System.out.print(temp[i] + ", ");
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        //문자열 my_string이 매개변수로 주어진다. my_string은 소문자, 대문자, 자연수로만 구성되어있다.
        //이때, my_string안의 자연수들의 합을 리턴

        String my_string = "aAb1B2cC34oOp";    //answer = 37

        System.out.println(solution(my_string));

    }

}
