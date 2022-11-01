package problem.lv0.편지;

class Solution {
    public int solution(String message) {
        return message.length() * 2;
    }
}

public class Main {
	public static void main(String[] args) {
		
		String message = "happy birthday!";
		//message 문자열이 주어지면 문자열 길이의 2배를 리턴

		Solution sol = new Solution();
		int ans = sol.solution(message);	//message의 길이가 15이므로 2배인 30을 리턴
		
		System.out.println("답 : " + ans);
		
	}
	
}
