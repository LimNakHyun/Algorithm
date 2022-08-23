package chap09.gamelevel;

public class SuperLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("엄청 빨리 달립네다.");
	}
	
	@Override
	public void jump() {
		System.out.println("아주 높이 jump합네다.");
	}
	
	@Override
	public void turn() {
		System.out.println("한 바퀴 돕네다.");
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("***** 고급자 레벨입네다 *****");
	}
}
