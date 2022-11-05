package problem.lv0.피자_나눠_먹기_3;

public class Main {
    
    static int solution(int slice, int n) {
        int answer = n / slice;
        return answer = (n % slice == 0) ? answer : ++answer;
    }

    public static void main(String[] args) {

        //피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
        //n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지 리턴

        int slice = 7;
        int n = 10; //시킬 피자의 수 : 2

        System.out.println("시킬 피자의 수 : " + solution(slice, n));

    }

}
