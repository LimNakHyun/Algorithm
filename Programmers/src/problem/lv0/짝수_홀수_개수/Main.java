package problem.lv0.짝수_홀수_개수;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0};
        for(int i : num_list) answer[i % 2]++;
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		
		int[] num_list = {1, 2, 3, 4, 5};

		Solution sol = new Solution();
		int[] ans = sol.solution(num_list);
		
		System.out.println("답 : " + Arrays.toString(ans));
		
	}
	
}
