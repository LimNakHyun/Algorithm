package problem.lv0.두_수의_합;

class Solution {
    public int solution(int num1, int num2) {
        return num1 + num2;
    }
}

public class Main {
	public static void main(String[] args) {

		Solution sol = new Solution();
		//좌측과 우측의 합을 리턴
		int ans = sol.solution(2, 3);	//answer = 5
		
		System.out.println("답 : " + ans);
		
	}
	
}
