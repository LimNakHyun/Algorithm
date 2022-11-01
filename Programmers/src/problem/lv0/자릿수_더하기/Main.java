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
        //숫자 n이 주어졌을 때, 그 자릿수의 합을 리턴

		Solution sol = new Solution();
		int ans = sol.solution(n);  //여기서는 n = 930211 이므로, 16을 리턴함
		
		System.out.println("답 : " + ans);
		
	}
	
}
