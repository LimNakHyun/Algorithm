package chap13.quiz;

import java.util.ArrayList;
import java.util.List;

class Book {
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

public class LibraryTest {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("탑", 25000));
		bookList.add(new Book("미드정글", 15000));
		bookList.add(new Book("바텀", 30000));
		
		int total = bookList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("라인 가격의 총합은 : " + total + "원 입니다.");
		
		System.out.println("== 2만원 이상 라인 명단을 정렬하여 출력 ==");
		bookList.stream().filter(c -> c.getPrice() >= 20000)
		.map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
	}
}
