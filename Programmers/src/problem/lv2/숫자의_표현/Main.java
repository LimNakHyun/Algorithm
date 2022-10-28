package problem.lv2.숫자의_표현;

public class Main {
	public static void main(String[] args) {
		int n = 5;
		int a = 1;
		int d = 1;
		
		int sum = n * (2 * a + (n - 1) * d) / 2;
	    //System.out.println("수열의 합 : " + sum);
		
		int sumD1 = n * (2 * a + n - 1) / 2;
		System.out.println("수열의 합 : " + sum);
		
		int s = 15;
		int cnt = 1;
		
		for(int i = 1; i < s; i++) {
			for(int j = 1; j < 150; j++) {
				if(2 * s == j * (2 * i + j - 1)) {
					System.out.println("초항 : " + i);
					System.out.println("항 수 : " + j);
					System.out.println();
					cnt++;
				}
				else if(2 * s < j * (2 * i + j - 1)) break;
			}
		}
	    
	    System.out.println("갯수 : " + cnt);
	    
	}
}