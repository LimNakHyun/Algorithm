package problem.lv0.짝수의_합;

class Solution {
    public int solution(int n) {
        return (n / 2) * (n / 2 + 1);
    }
}

public class Main {
	public static void main(String[] args) {

		Solution sol = new Solution();
		int ans = sol.solution(10);
		
		System.out.println("답 : " + ans);
		
	}
	
}
