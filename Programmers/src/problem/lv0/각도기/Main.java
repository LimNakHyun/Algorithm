package problem.lv0.각도기;

class Solution {
    public int solution(int angle) {
        int answer = angle / 45;
        return (angle % 45 != 0) && (answer == 2) || (answer == 0) ? ++answer : answer;
    }
}

public class Main {
	public static void main(String[] args) {

		Solution sol = new Solution();
		int ans = sol.solution(91);	//예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return함
		
		System.out.println("답 : " + ans);
		
	}
	
}
