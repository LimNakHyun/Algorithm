package Chap02.chapter2;

public class Constant {
	public static void main(String[] args) {
		final int MAX_NUM = 100;	//final은 변수값을 변하지 않게 하여 상수로 만듦
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 1000;	//오류 발생. 상수는 값을 변경할 수 없음
	}
}
