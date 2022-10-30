package problem.lv1.폰켓몬;

public class Main {
	static int solution(int[] nums) {
        int answer = 0;
        
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            if(max < nums[i]) max = nums[i];
        }
        
        int[] types = new int[max + 1];
        for(int num : nums) types[num]++;
        
        int cnt = 0;
        for(int type : types) if(type > 0) cnt++;
        
        if(cnt >= nums.length / 2) answer = nums.length / 2;
        else answer = cnt;
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,4};
		
		System.out.println(solution(nums));
		
	}

}
