package Chap06.Q6_6;

public class CardCompanyTest {
	public static void main(String[] args) {
		CardCompany cardcompany = CardCompany.getInstance();
		Card card1 = cardcompany.createCard();
		System.out.println(card1.getCardNum());
	}
}
