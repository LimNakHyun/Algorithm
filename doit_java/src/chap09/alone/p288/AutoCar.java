package chap09.alone.p288;

public class AutoCar extends Car {
	@Override
	public void run() {
		System.out.println("차가 달립니다.");
	}
	
	@Override
	public void refuel() {
		System.out.println("휘발유를 주유합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("오토카가 멈춥니다.");
	}
	
	public void load() {
		System.out.println("짐을 싣습니다.");
	}
}
