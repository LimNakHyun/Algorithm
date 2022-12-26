package problem.lv0.문자열_계산하기;

public class Main {

    static int solution(String my_string) {
        
        String[] temp = my_string.split(" ");
        
        int answer = Integer.parseInt(temp[0]);
        
        for(int i = 1; i < temp.length; i += 2) {
            if(temp[i].equals("+")) answer += Integer.parseInt(temp[i + 1]);
            else if(temp[i].equals("-")) answer -= Integer.parseInt(temp[i + 1]);
        }
        
        return answer;
        
    }

    public static void main(String[] args) {
        //my_string은 "13 + 5"처럼 문자열로 된 수식이다. 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 리턴

        String my_string = "3 + 4";    //answer = 7

        System.out.println("[" + my_string + "] 을(를) 계산한 값: " + solution(my_string));

    }

}
