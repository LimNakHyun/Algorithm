package problem.lv0.두_수의_곱;

class Solution {
    public int solution(int num1, int num2) {
        return num1 * num2;
    }
}

public class Main {
	public static void main(String[] args) {

		Solution sol = new Solution();
		int ans = sol.solution(3, 4);
		
		System.out.println("답 : " + ans);
		
	}
	
}
