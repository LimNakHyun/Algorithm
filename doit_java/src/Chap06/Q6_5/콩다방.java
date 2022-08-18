package Chap06.Q6_5;

public class 콩다방 {
	int guest = 0;
	int money = 0;
	
	public void moneyCount(int money) {
		this.money += money;
		guest++;
	}
	
	public void 콩다방Info() {
		System.out.println("콩다방은" + guest + "명의 손님들이 왔다갔으며, " + money + "원의 매출을 울렸습니다.");
	}
}
