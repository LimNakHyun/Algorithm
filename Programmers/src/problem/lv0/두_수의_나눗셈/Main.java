package problem.lv0.두_수의_나눗셈;

class Solution {
    public int solution(int num1, int num2) {
        double a = (double) num1 / num2 * 1000;
        return (int) a;
    }
}

public class Main {
	public static void main(String[] args) {

		Solution sol = new Solution();
		//num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return함
		int ans = sol.solution(3, 2);	//answer = 1500
		
		System.out.println("답 : " + ans);
		
	}
	
}

//링크문제 :[유한소수 판별하기] https://school.programmers.co.kr/learn/courses/30/lessons/120878