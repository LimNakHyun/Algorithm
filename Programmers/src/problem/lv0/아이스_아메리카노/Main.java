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

		Solution sol = new Solution();
		int[] ans = sol.solution(money);
		
		System.out.println("답 : " + Arrays.toString(ans));
		
	}
	
}
