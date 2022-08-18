package Chap03.operator;

public class OperationEx3 {
	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);	//논리 곱에서 앞 항의 결과 값이
		//거짓이므로 뒷 문장은 실행되지 않음(실행되어 봐야 이미 거짓이기 떄문에)
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);	//논리 합에서 앞 항의 결과 값이 참이므로
		//뒷 문장은 실행되지 않음(실행되어봐야 이미 참이기 때문에)
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}
}