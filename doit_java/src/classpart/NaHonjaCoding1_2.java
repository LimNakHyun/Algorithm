package classpart;

public class NaHonjaCoding1_2 {
	public static void main(String[] args) {
		shoppingMall shoppingmall = new shoppingMall();
		shoppingmall.getOrderNumber("201803120001");
		shoppingmall.getOrderID("abc123");
		shoppingmall.getOrderDate("2018년 3월 12일");
		shoppingmall.getOrderName("홍길순");
		shoppingmall.getOrderProductNumber("PD0345-12");
		shoppingmall.getShippingAddress("서울시 영등포구 여의도동 20번지");
		
		System.out.println("주문번호 : " + shoppingmall.orderNumber);
		System.out.println("주문자 아이디 : " + shoppingmall.orderID);
		System.out.println("주문 날짜 : " + shoppingmall.orderDate);
		System.out.println("주문자 이름 : " + shoppingmall.orderName);
		System.out.println("주문 상품 번호 : " + shoppingmall.orderProductNumber);
		System.out.println("배송 주소 : " + shoppingmall.shippingAddress);
	}
}

class shoppingMall {
	String orderNumber;
	String orderID;
	String orderDate;
	String orderName;
	String orderProductNumber;
	String shippingAddress;
	
	void getOrderNumber(String order) {
		orderNumber = order;
	}
	
	void getOrderID(String id) {
		orderID = id;
	}
	
	void getOrderDate(String date) {
		orderDate = date;
	}
	
	void getOrderName(String name) {
		orderName = name;
	}
	
	void getOrderProductNumber(String productnumber) {
		orderProductNumber = productnumber;
	}
	
	void getShippingAddress(String shippingaddress) {
		shippingAddress = shippingaddress;
	}
}
