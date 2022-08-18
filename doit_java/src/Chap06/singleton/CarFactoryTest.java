package Chap06.singleton;

public class CarFactoryTest {
	public static void main(String[] args) {
		CarFactory1 factory = CarFactory1.getInstance();
		Car1 mySonata = factory.createCar();
		Car1 yourSonata = factory.createCar();
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
	}
}
