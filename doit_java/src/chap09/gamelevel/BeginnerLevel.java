package chap09.gamelevel;

public class BeginnerLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("천천히 달립네다.");
	}
	
	@Override
	public void jump() {
		System.out.println("Jump할 줄 모른다 마.");
	}
	
	@Override
	public void turn() {
		System.out.println("Turn할 줄 모른다 마.");
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("***** 초급자 레벨입네다. *****");
	}
}
