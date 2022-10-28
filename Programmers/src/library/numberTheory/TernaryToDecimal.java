package library.numberTheory;

public class TernaryToDecimal {
	//3진법을 10진법으로 바꿔줌
	public static int ternaryToDecimal(StringBuilder sb) {
		sb.reverse();
		int ans = 0;
		for(int i = 0; i < sb.length(); i++) {
			ans += Math.pow(3, i) * (sb.charAt(i) - '0');
			System.out.println("temp : " + ans);
			System.out.println("sb : " + sb.toString());
		}
		
		return ans;
	}
}
