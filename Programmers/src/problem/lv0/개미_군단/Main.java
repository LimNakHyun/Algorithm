package problem.lv0.개미_군단;

public class Main {
    
    static int solution(int hp) {
        int answer = 0;
        int[] dmg = {5, 3, 1};
        
        for(int i = 0; i < 3; i++) {
            answer += hp / dmg[i];
            hp %= dmg[i];
        }
        
        return answer;
    }

    public static void main(String[] args) {
        //개미 군단이 사냥을 나가려고 한다.
        //개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 한다.
        //장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있다.
        //사냥감의 체력 hp가 매개변수로 주어질 때,
        //사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 리턴

        int hp = 23;    //answer = 5;

        System.out.println(hp + "의 대미지를 주기 위해 필요한 개미의 최소 마릿수: " + solution(hp));

    }

}
