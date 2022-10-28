package problem.lv2.이진_변환_반복하기;

import java.util.Arrays;

public class Main {
	static String zeroCnt(int[] a, String s) {
		int zTemp = s.length();
		s = s.replace("0", "");
		zTemp -= s.length();
		a[0]++;
		a[1] += zTemp;
		
//		System.out.println(Arrays.toString(a));
//		System.out.println(s);
		
		return s;
	}
	
	public static void main(String[] args) {
		String s = "110010101001";
		
		int[] answer = new int[2];
		while(!s.equals("1")) {
			s = zeroCnt(answer, s);
			s = Integer.toBinaryString(s.length());
			System.out.println("자릿수를 2진수로 : " + s);
		}
		
		System.out.println(Arrays.toString(answer));
		//System.out.println(s);
	}
}