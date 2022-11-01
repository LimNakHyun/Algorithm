package problem.lv0.배열의_평균값;

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i : numbers) answer += i;
        return answer / numbers.length;
    }
}

public class Main {
	public static void main(String[] args) {
		
		int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		//numbers 배열이 주어지면 배열을 순회하며 숫자를 더한 후 평균을 구한다.

		Solution sol = new Solution();
		double ans = sol.solution(numbers);
		
		System.out.println("답 : " + ans);
		
	}
	
}
