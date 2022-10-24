package problem.lv0.머쓱이보다_키_큰_사람;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i : array) {
            if(i > height) answer++;
        }
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		
		int[] array = {149, 180, 192, 170};
		int height = 167;

		Solution sol = new Solution();
		int ans = sol.solution(array, height);
		
		System.out.println("답 : " + ans);
		
	}
	
}
