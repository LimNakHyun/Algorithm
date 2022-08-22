package chap08.witharraylist;
import chap08.polymorphism.*;
import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerIngu = new Customer(8932, "인구");
		Customer customerJong = new Customer(5678, "종횩");
		Customer customerOok = new GoldCustomer(347, "동옥");
		Customer customerYou = new GoldCustomer(283, "유혁");
		Customer customerRo = new VIPCustomer(3, "로동", 7784);
		
		customerList.add(customerIngu);
		customerList.add(customerJong);
		customerList.add(customerOok);
		customerList.add(customerYou);
		customerList.add(customerRo);
		
		System.out.println("====== 고객 정보 출력 ======");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== 할인율과 보너스 포인트 계산 ======");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " +
			customer.getBonusPoint() + "점입니다.");
		}
	}
}
