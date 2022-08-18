package Chap06.cooperation;

public class Student {
	public String studentName;
	public int grade;
	public int money;
	int count = 0;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		if (count == 0) {
			System.out.println(studentName + "님이 현재 가진 돈은 " + money + "원 입니다.");
			count++;
		} else {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
		}
	}
}
