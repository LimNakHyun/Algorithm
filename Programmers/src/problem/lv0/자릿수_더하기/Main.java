package problem.lv0.자릿수_더하기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		
		int n = 930211;

		Solution sol = new Solution();
		int ans = sol.solution(n);
		
		System.out.println("답 : " + ans);
		
	}
	
}
