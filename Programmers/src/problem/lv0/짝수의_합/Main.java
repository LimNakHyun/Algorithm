package problem.lv0.짝수의_합;

class Solution {
    public int solution(int n) {
        return (n / 2) * (n / 2 + 1);
    }
}

public class Main {
	public static void main(String[] args) {

		Solution sol = new Solution();
		//자연수 n이 주어졌을 때, n까지의 짝수의 합을 리턴

		int ans = sol.solution(10);
		//n = 10 이므로 2, 4, 6, 8, 10 의 합인 30을 리턴
		
		System.out.println("답 : " + ans);
		
	}
	
}
