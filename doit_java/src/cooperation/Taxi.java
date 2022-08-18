package cooperation;

public class Taxi {
	int taxiLicensePlate;
	int passengerCount;
	int money;
	
	public Taxi(int 택시번호판) {
		this.taxiLicensePlate = 택시번호판;
	}
	
	public void take(int 요금) {
		this.money += 요금;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(taxiLicensePlate + "택시의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
}
