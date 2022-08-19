package chap08.inheritance;

public class CustomerTest2 {
	public static void main(String[] args) {
		VIPCustomer customerHo = new VIPCustomer(7, "호동", 68584);
//		customerHo.setCustomerID(7);
//		customerHo.setCustomerName("호동");
		customerHo.bonusPoint = 8999;
		System.out.println(customerHo.showCustomerInfo());
	}
}
