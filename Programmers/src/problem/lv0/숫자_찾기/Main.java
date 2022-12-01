package problem.lv0.숫자_찾기;

public class Main {
    
    static int solution(int num, int k) {
        int answer = 0;
        int ind = 0;
        
        while(num > 0) {
            ind++;
            if(num % 10 == k) answer = ind;
            num /= 10;
        }
        
        return (answer == 0) ? -1 : ind - answer + 1;
    }

    public static void main(String[] args) {
        //정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면
        //num의 그 숫자가 있는 자리 수를 리턴하고 없으면 -1을 리턴

        int num = 29183;
        int k = 3;      //answer = 3

        System.out.println(num + " 의 숫자 중 " + k + " 의 자릿수: " + solution(num, k));

    }

}
