package problem.lv0.나이_출력;

class Solution {
    public int solution(int age) {
        return 2023 - age;
    }
}

public class Main {
	public static void main(String[] args) {

		Solution sol = new Solution();
		int ans = sol.solution(40);
		
		System.out.println("답 : " + ans);
		
	}
	
}
