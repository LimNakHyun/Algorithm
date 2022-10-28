package problem.lv1.삼진법_뒤집기;

public class Main {
	static int numToTernary(StringBuilder sb) {
		int ans = 0;
		for(int i = 0; i < sb.length(); i++) {
			ans += Math.pow(3, i) * (sb.charAt(i) - '0');
			System.out.println("temp : " + ans);
			System.out.println("sb : " + sb.toString());
		}
		
		return ans;
	}

	public static void main(String[] args) {
//		int n = 45;		//7
		int n = 125;	//229
//		System.out.println((int)'0');
		
		StringBuilder sb = new StringBuilder();
		while(n > 0) {
			sb.append(n % 3);
			n /= 3;
//			System.out.println("저장된 숫자 : " + sb.toString());
//			System.out.println("n 값 : " + n);
//			System.out.println();
		}
		
//		System.out.println("뒤집은 숫자 : " + sb.reverse());
//		
//		System.out.println("답 : " + numToTernary(sb));
		
		System.out.println("답 : " + Integer.parseInt(sb.toString(), 3));
		
	}
	
}
