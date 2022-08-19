package chap08.inheritance;

public class OverridingTest3 {
	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerIngu = new Customer(8936, "린구");
		System.out.println(customerIngu.getCustomerName() + " 님이 지불해야 하는 금액은" + 
		customerIngu.calcPrice(price) + "원입니다.");
	}
}
