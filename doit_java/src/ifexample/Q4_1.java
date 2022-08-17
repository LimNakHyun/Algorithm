package ifexample;

public class Q4_1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		int result = 0;
		char operator = '+';
		
		switch(operator) {
		case '+' :
			result = num1 + num2;
		case '-' :
			result = num1 - num2;
		case '*' :
			result = num1 * num2;
		case '/' :
			result = num1 / num2;
		}
		System.out.println(result);
	}
}
