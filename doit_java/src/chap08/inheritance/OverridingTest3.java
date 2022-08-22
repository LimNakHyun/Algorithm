package chap08.inheritance;

public class OverridingTest3 {
	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerIngu = new Customer(8936, "린구");
		System.out.println(customerIngu.getCustomerName() + " 님이 지불해야 하는 금액은" + 
		customerIngu.calcPrice(price) + "원입니다.");
		
		VIPCustomer customerHyo = new VIPCustomer(3, "로동", 007);
		System.out.println(customerHyo.getCustomerName() + " 님이 지불해야 하는 금액은" +
		customerHyo.calcPrice(price) + "원입니다.");
		
		Customer jong = new VIPCustomer(37, "종횩", 2000);
		System.out.println(jong.getCustomerName() + " 님이 지불해야 하는 금액은" + 
		jong.calcPrice(price) + "원입니다.");
	}
}
