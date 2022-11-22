package problem.lv2.예상_대진표;

public class Main {
    
    public static void main(String[] args) {
        //△△ 게임대회가 개최되었다.
        //이 대회는 N명이 참가하고, 토너먼트 형식으로 진행된다.
        //N명의 참가자는 각각 1부터 N번을 차례대로 배정받는다.
        //그리고, 1번↔2번, 3번↔4번, ... , N-1번↔N번의 참가자끼리 게임을 진행한다.
        //각 게임에서 이긴 사람은 다음 라운드에 진출할 수 있다.
        //이때, 다음 라운드에 진출할 참가자의 번호는 다시 1번부터 N/2번을 차례대로 배정받는다.
        //만약 1번↔2번 끼리 겨루는 게임에서 2번이 승리했다면 다음 라운드에서 1번을 부여받고,
        //3번↔4번에서 겨루는 게임에서 3번이 승리했다면 다음 라운드에서 2번을 부여받게 된다.
        //게임은 최종 한 명이 남을 때까지 진행된다.
        
        //이때, 처음 라운드에서 A번을 가진 참가자는
        //경쟁자로 생각하는 B번 참가자와 몇 번째 라운드에서 만나는지 궁금해졌다.
        //게임 참가자 수 N, 참가자 번호 A, 경쟁자 번호 B가 함수 solution의 매개변수로 주어질 때,
        //처음 라운드에서 A번을 가진 참가자는 경쟁자로 생각하는 B번 참가자와 몇 번째 라운드에서 만나는지 리턴
        //단, A번 참가자와 B번 참가자는 서로 붙게 되기 전까지 항상 이긴다고 가정합니다.
        
        //제한사항
        //N : 2^1 이상 2^20 이하인 자연수 (2의 지수 승으로 주어지므로 부전승은 발생하지 않습니다.)
        //A, B : N 이하인 자연수 (단, A ≠ B 입니다.)

        int n = 8;
        int a = 4;
        int b = 7;
        //answer = 3

        int answer = 0;

        for(int i = 0; i < (int)(Math.log10(n) / Math.log10(2)); i++) {
            System.out.println((i + 1) + "번째 연산");
            System.out.println("a값: " + a);
            System.out.println("b값: " + b);
            if((b % 2 == 0 && a == b - 1) || (a % 2 == 0 && b == a - 1)) {
                answer++;
                break;
            }
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
            System.out.println();
            System.out.println("a값: " + a);
            System.out.println("b값: " + b);
            System.out.println();
            System.out.println();
        }

        System.out.println("답: " + answer);

        // System.out.println("로그함수: " + (int)(Math.log10(n) / Math.log10(2)));

    }

}
