package Q6_5;

public class 별다방 {
	int guest = 0;
	int money = 0;
	
	public void moneyCount(int money) {
		this.money += money;
		guest++;
	}
	
	public void 별다방Info() {
		System.out.println("별다방은 " + guest + "명의 손님을 받았으며, " + money + "원의 매출을 올렸습니다.");
	}
}
