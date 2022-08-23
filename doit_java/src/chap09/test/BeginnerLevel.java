package chap09.test;

public class BeginnerLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("천천히 달림");
	}

	@Override
	public void jump() {
		System.out.println("jump할 줄 모름");
	}

	@Override
	public void turn() {
		System.out.println("Turn할 줄 모름");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 초보 레벨 *****");
	}
}
