package chap06.singleton;

public class Car1 {
	private static int serialNum = 1000000;
	private int carNum;
	
	public Car1() {
		serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum() {
		return carNum;
	}
	
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
}
