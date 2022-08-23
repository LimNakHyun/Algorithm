package chap10.interfaceex;

public class CompleteCalc extends Calculator {
	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1 / num2;
		} else {
			return Calc.ERROR;
		}
	}
	
	@Override
	public int square(int num) {
		return num * num;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

	@Override
	public void description() {
//		System.out.println("완벽한 정수 계산기를 구현합니다.");
		super.description();
	}
}
