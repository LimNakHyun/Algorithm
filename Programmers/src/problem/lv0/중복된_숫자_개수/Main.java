package problem.lv0.중복된_숫자_개수;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i : array) {
            if(i == n) answer++;
        }
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		
		int[] array = {1, 1, 2, 3, 4, 5};
		int n = 1;

		Solution sol = new Solution();
		int ans = sol.solution(array, n);
		
		System.out.println("답 : " + ans);
		
	}
	
}
