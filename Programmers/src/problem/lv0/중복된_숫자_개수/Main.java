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
        //배열 array와 숫자 n이 주어졌을 때,
        //array 안에 n이 몇개 있는지 리턴

		Solution sol = new Solution();
		int ans = sol.solution(array, n);   //array 안에 n값인 1이 2개 있기 때문에 2를 리턴
		
		System.out.println("답 : " + ans);
		
	}
	
}
