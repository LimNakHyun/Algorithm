package problem.lv0.양꼬치;

class Solution {
    public int solution(int n, int k) {
        return n * 12000 + (k - n / 10) * 2000;	// n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면 총 얼마를 지불해야 하는지 return
    }
}

public class Main {
	public static void main(String[] args) {

		Solution sol = new Solution();
		int ans = sol.solution(10, 3);
		
		System.out.println("답 : " + ans);
		
	}
	
}
