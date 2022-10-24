package problem.lv0.문자열_뒤집기;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        return sb.reverse().toString();
    }
}

public class Main {
	public static void main(String[] args) {
		
		String my_string = "jaron";

		Solution sol = new Solution();
		String ans = sol.solution(my_string);
		
		System.out.println("답 : " + ans);
		
	}
	
}
