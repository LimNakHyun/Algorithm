package chap08.polymorphism;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customerIngu = new Customer();
		customerIngu.setCustomerID(8932);
		customerIngu.setCustomerName("인구");
		customerIngu.bonusPoint = 1000;
		
		System.out.println(customerIngu.showCustomerInfo());
		
		Customer customerHyo = new VIPCustomer(3, "로동", 007);
		customerHyo.bonusPoint = 1000;
		
		System.out.println(customerHyo.showCustomerInfo());
		System.out.println("====== 할인율과 보너스 포인트 계산 ======");
		
		int price = 10000;
		int InguPrice = customerIngu.calcPrice(price);
		int HyoPrice = customerHyo.calcPrice(price);
		
		System.out.println(customerIngu.getCustomerName() + " 님이 " + InguPrice + "원 지불하셨습니다.");
		System.out.println(customerIngu.showCustomerInfo());
		System.out.println(customerHyo.getCustomerName() + " 님이 " + HyoPrice + "원 지불하셨습니다.");
		System.out.println(customerHyo.showCustomerInfo());
	}
}
