package chap13.innerclass;

class Outer2 {
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {	//익명 내부 클래스. Runnable 인터페이스 생성
			@Override
			public void run() {
				//num = 200;	//오류발생
				//i = 10;		//오류발생
				System.out.println(i);
				System.out.println(num);
			}
		};	//클래스 끝에 ;를 써준다.
	}
	
	Runnable runner = new Runnable() {	//익명 내부 클래스를 변수에 대입
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	};
}

public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runnerble = out.getRunnable(10);
		runnerble.run();
		out.runner.run();
	}
}