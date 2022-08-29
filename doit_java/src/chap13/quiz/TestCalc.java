package chap13.quiz;

public class TestCalc {
	public static void main(String[] args) {
		Calc addNum = (a, b) -> a + b;
		System.out.println(addNum.add(10, 4));
	}
}
