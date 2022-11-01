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
		//num_list가 주어졌을 때, 그 안에 있는 짝수 및 홀수의 개수를 구해서
		//각각을 배열의 안에 리턴한다.

		Solution sol = new Solution();
		int[] ans = sol.solution(num_list);	//짝수는 둘 홀수는 셋 이므로 [2, 3] 리턴
		
		System.out.println("답 : " + Arrays.toString(ans));
		
	}
	
}
