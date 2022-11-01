package problem.lv0.아이스_아메리카노;

import java.util.Arrays;

class Solution {
    public int[] solution(int money) {
        return new int[] {money / 5500, money % 5500};
    }
}

public class Main {
	public static void main(String[] args) {
		
		int money = 15000;
		//money가 주어졌을 때, 5500원짜리 커피를 몇 잔 살수있는지, 
		//그리고 남은 거스름돈은 얼마인지 각각의 값을 배열에다 리턴하기

		Solution sol = new Solution();
		int[] ans = sol.solution(money);
		
		System.out.println("답 : " + Arrays.toString(ans));
		
	}
	
}
