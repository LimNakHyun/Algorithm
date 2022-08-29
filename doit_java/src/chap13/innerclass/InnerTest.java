package chap13.innerclass;

class OutClass {
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;	//내부 클래스 자료형 변수를 먼저 선언해 준다.
	
	public OutClass() {	//외부 클래스의 디폴트 생성자로, 외부 클래스가 생성된 후 내부 클래스 생성이 가능하다.
		inClass = new InClass();
	}
	
	class InClass {
		int inNum = 100;
//		static int sInNum = 200;	//인스턴스 내부 클래스에는 정적변수 선언이 불가능하다.
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
		}
		
		//static void sTest() {	//인스턴스 내부 클래스에는 정적 메소드 역시 선언 불가능
		//}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {	//정적 내부 클래스의 일반 메소드
			//num += 10;	//외부클래스의 인스턴스 변수는 사용할 수 없다.
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
		}
		
		static void sTest() {	//정적 내부 클래스의 정적 메소드
			//num += 10;	//외부 클래스의 인스턴스 변수는 사용할 수 없다.
			//inNum += 10;	//내부 클래스의 인스턴스 변수는 사용할 수 없다.
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용");
		}
		
	}
//	public void usingClass() {
//		inClass.inTest();
//	}
}

public class InnerTest {
	public static void main(String[] args) {
//		OutClass outClass = new OutClass();
//		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
//		outClass.usingClass();	//내부 클래스 기능 호출
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();	//외부 클래스를 생성하지 않고 바로 정적 내부 클래스를 생성 가능하다.
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		OutClass.InStaticClass.sTest();
	}
}
