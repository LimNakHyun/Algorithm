package problem.lv2.피보나치_수;

//import java.util.Arrays;
import library.numberTheory.Fibonacci;

public class Main {
	
	public static void main(String[] args) {
		//자연수 n이 주어졌을 때,
		//n번째 피보나치 숫자를 1234567로 나눈 값을 리턴

		int n = 10000;
//		for(int i = 0; i < 31; i++) {
//			System.out.println((i + 1) + "번째 피보나치 숫자 : " + reCursiveFibo(i));
//			System.out.println();
//		}
		
//		System.out.println(variableFibo(80));
//		System.out.println(Fibonacci.variableFibo(80) == 23416728348467685L);
//		System.out.println(variableFibo(100) == 354224848179261915075L);
		System.out.println("(10000번째 피보나치 수) % 1234567 = " + Fibonacci.dynamicFibo(n));
	}
	
}
