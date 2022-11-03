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
		System.out.println(s);
		
		return s;
	}
	
	public static void main(String[] args) {
		//2진수 s가 주어졌을 때,

		//루틴
		//1. 그 2진수의 0을 모두 지운다.
		//2. 0이 모두 지워진 2진수의 자릿수를 2진수로 만든 후 1번으로

		//위 과정을 반복하여 1이 나왔을때,
		//지워진 0의 수와 실행된 루틴의 수를 배열에 넣어서 리턴

		String s = "110010101001";
		//11111 [1, 6] -> 110
		//11	[2, 7] -> 10
		//1		[3, 8] 리턴		
		
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
