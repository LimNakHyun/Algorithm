package problem.lv0.저주의_숫자_3;

public class Main {

    static int solution(int n) {
        int[] no3Array = new int[101];

        int ind = 1;
        for(int i = 1; i < 200; i++) {
            if(no3Array[no3Array.length - 1] != 0) break;
            if((i % 3 != 0) && !String.valueOf(i).contains("3")) {
                no3Array[ind++] = i;
            }
        }

        return no3Array[n];
    }

    public static void main(String[] args) {
        //3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않는다.
        //정수 n이 매개변수로 주어질 때, n을 3x 마을에서 사용하는 숫자로 바꿔 리턴

        int n = 15;    //answer = 25

        System.out.println(n + "을 3x 마을에서 사용하는 숫자로 바꾸면 " + solution(n) + "가 된다.");

    }

}
