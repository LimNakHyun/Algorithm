package problem.lv0.게임369;

public class Main {
    
    static int solution(int order) {
        
        int answer = 0;
        
        while(order > 0) {
            if(order % 10 == 3 || order % 10 == 6 || order % 10 == 9) answer++;
            order /= 10;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        //머쓱이는 친구들과 369게임을 하고 있다.
        //369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임이다.
        //머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 리턴

        int order = 29423;    //answer = 2

        System.out.println("주어진 숫자가 " + order + " 일 때, 쳐야할 박수 횟수: " + solution(order));

    }

}
