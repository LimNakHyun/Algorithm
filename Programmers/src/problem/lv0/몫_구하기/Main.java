package problem.lv0.몫_구하기;

class Solution {
    public int solution(int num1, int num2) {
        return num1 / num2;
    }
}

public class Main {
	public static void main(String[] args) {

		Solution sol = new Solution();
		//좌측의 수를 우측의 수로 나눈 몫을 리턴
		int ans = sol.solution(7, 2);	//answer = 3
		
		System.out.println("답 : " + ans);
		
	}
	
}
