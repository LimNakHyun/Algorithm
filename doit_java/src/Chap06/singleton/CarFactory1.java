package Chap06.singleton;

public class CarFactory1 {
	private static CarFactory1 instance = new CarFactory1();
	private CarFactory1() {
		
	}
	
	public static CarFactory1 getInstance() {
		if(instance == null) {
			instance = new CarFactory1();
		}
		return instance;
	}
	
	public Car1 createCar() {
		Car1 car = new Car1();
		return car;
	}
}
