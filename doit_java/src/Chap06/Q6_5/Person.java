package Chap06.Q6_5;

public class Person {
	String personName;
	int money;
	
	public Person(String personName, int money) {
		this.personName = personName;
		this.money = money;
	}
	
	public void buy별다방(별다방 아메리카노) {
		아메리카노.moneyCount(4000);
		this.money -= 4000;
	}
	
	public void buy콩다방(콩다방 라테) {
		라테.moneyCount(4500);
		this.money -= 4500;
	}
	
	public void 지갑Info() {
		System.out.println(personName + "는 지갑에 " + money + "원이 남아있습니다.");
	}
}
