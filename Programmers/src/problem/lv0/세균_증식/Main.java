package problem.lv0.세균_증식;

public class Main {
    
    static int solution(int n, int t) {
        return n * (int)Math.pow(2, t);
    }

    public static void main(String[] args) {
        //1시간에 두배만큼 증식하는 세균이 있다. 
        //처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 리턴

        int n = 2;
        int t = 10;

        System.out.println(n + "마리의 세균이 " + t + "시간 후의 마리수: " + solution(n, t));

    }

}
