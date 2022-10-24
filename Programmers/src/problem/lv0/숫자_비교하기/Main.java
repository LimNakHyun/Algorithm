package problem.lv0.숫자_비교하기;

class Solution {
    public int solution(int num1, int num2) {
        int answer = (num1 == num2) ? 1 : -1;	//두 수가 같으면 1 다르면 -1을 출력한다.
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {

		Solution sol = new Solution();
		int ans = sol.solution(2, 3);
		
		System.out.println("답 : " + ans);
		
	}
	
}
