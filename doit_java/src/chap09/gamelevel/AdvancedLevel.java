package chap09.gamelevel;

public class AdvancedLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("빨리 달립네다.");
	}
	
	@Override
	public void jump() {
		System.out.println("높이 jump합네다.");
	}
	
	@Override
	public void turn() {
		System.out.println("Turn할 줄 모른다 마.");
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("***** 중급자 레벨입네다. *****");
	}
}
