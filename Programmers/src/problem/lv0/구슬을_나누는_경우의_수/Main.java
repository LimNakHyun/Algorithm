package problem.lv0.구슬을_나누는_경우의_수;

import library.numberTheory.PascalsTriangle;

public class Main {

    static long solution(int balls, int share) {
        return PascalsTriangle.dynamicCombination(balls, share);
    }

    public static void main(String[] args) {
        //머쓱이는 구슬을 친구들에게 나누어주려고 하며, 구슬은 모두 다르게 생겼다.
        //머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
        //balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 리턴

        int balls = 15;
        int share = 7;    //answer = 6435;

        System.out.println(balls + "개의 구슬 중 " + share + "개를 고르는 모든 경우의 수: " + solution(balls, share));

    }

}
