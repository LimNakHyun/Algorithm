package problem.lv0.편지;

class Solution {
    public int solution(String message) {
        return message.length() * 2;
    }
}

public class Main {
	public static void main(String[] args) {
		
		String message = "happy birthday!";

		Solution sol = new Solution();
		int ans = sol.solution(message);
		
		System.out.println("답 : " + ans);
		
	}
	
}
