package chap05.classpart;

public class FunctionTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum + " 입니다");
		System.out.println(minus(num1, num2));
		System.out.println(multiple(num1, num2));
		System.out.println(divide(num2, num1));
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public static int multiple(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public static int divide(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}
}
