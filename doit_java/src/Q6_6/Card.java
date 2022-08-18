package Q6_6;

public class Card {
	private static int serialNum = 90000;
	private int cardNum;
	
	public Card() {
		serialNum++;
		cardNum = serialNum;
	}
	
	public int getCardNum() {
		return cardNum;
	}
	
	public void setCardNum(int cardnum) {
		cardNum = cardnum;
	}
}
