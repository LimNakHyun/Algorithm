package Chap06.cooperation;

public class TakeTrans {
	public static void main(String[] args) {
//		Student studentJames = new Student("James", 5000);
//		Student studentTomas = new Student("Tomas", 10000);
		Student studentEdward = new Student("Edward", 47000);
		
//		Bus bus100 = new Bus(100);
//		studentJames.showInfo();
//		studentJames.takeBus(bus100);
//		studentJames.showInfo();
//		bus100.showInfo();
//		
//		Subway subwayGreen = new Subway(2);
//		studentTomas.showInfo();
//		studentTomas.takeSubway(subwayGreen);
//		studentTomas.showInfo();
//		subwayGreen.showInfo();
		
		Taxi taxi2 = new Taxi(4885);
		studentEdward.showInfo();
		studentEdward.takeTaxi(taxi2);
		studentEdward.showInfo();
		taxi2.showInfo();
	}
}
