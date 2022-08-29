package chap13.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
	public static void main(String[] args) {
		TravelCustomer customerIngu = new TravelCustomer("인구", 40, 100);
		TravelCustomer customerLingu = new TravelCustomer("린구", 20, 100);
		TravelCustomer customerIndu = new TravelCustomer("인두", 13, 50);
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerIngu);
		customerList.add(customerLingu);
		customerList.add(customerIndu);
		
		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용 : " + total + "만원");
		
		System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
		customerList.stream().filter(c -> c.getAge() >= 20)
		.map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
	}
}
