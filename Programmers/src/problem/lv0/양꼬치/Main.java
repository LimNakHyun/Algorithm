package problem.lv0.양꼬치;

class Solution {
    public int solution(int n, int k) {
        return n * 12000 + (k - n / 10) * 2000;
    }
}

public class Main {
	public static void main(String[] args) {

		Solution sol = new Solution();
		//n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과
		//양꼬치 10인분마다 1개씩 공짜로 주는 음료수 k개를 먹었다면
		//총 얼마를 지불해야 하는지 리턴

		int ans = sol.solution(10, 3);
		//양꼬치를 10인분 시켰기 때문에
		//음료수 1개가 무료이므로 124000을 리턴
		
		System.out.println("답 : " + ans);
		
	}
	
}
