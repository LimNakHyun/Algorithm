package problem.lv0.배열_뒤집기;

import java.util.Arrays;

class Solution {
    public static int[] reverseArray(int[] num_list) {
        int n = num_list.length;
        int temp = 0;
        for(int i = 0; i < n / 2; i++) {
            temp = num_list[i];
            num_list[i] = num_list[n - 1 - i];
            num_list[n - 1 - i] = temp;
        }
        return num_list;
    }
    
    public int[] solution(int[] num_list) {
        return reverseArray(num_list);
    }
}

public class Main {
	public static void main(String[] args) {
		
		int[] num_list = {1, 2, 3, 4, 5};
		//num_list 가 주어지면 뒤집어서 리턴

		Solution sol = new Solution();
		int[] ans = sol.solution(num_list);	//answer = [5, 4, 3, 2, 1]
		
		System.out.println("답 : " + Arrays.toString(ans));
		
	}
	
}
