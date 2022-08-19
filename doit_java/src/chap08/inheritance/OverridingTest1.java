package chap08.inheritance;

public class OverridingTest1 {
	public static void main(String[] args) {
		Customer customerIngu = new Customer(4636, "인구");
		customerIngu.bonusPoint = 1000;
		
		VIPCustomer customerRo = new VIPCustomer(2, "로동", 4829);
		customerRo.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerIngu.getCustomerName() + " 님이 지불해야 하는 금액은 "
		+ customerIngu.calcPrice(price) + "원입니다.");
		System.out.println(customerRo.getCustomerName() + " 님이 지불해야 하는 금액은 "
		+ customerRo.calcPrice(price) + "원입니다.");
	}
}
