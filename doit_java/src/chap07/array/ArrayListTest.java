package chap07.array;
import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("검은방", "히가시노 게이코"));
		library.add(new Book("원피스", "오다 센세"));
		library.add(new Book("드래곤볼", "작가"));
		library.add(new Book("신과 함께", "주호민"));
		library.add(new Book("이말년 시리즈", "이말년"));
		
		for(int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("=== 향상된 for문 사용 ===");
		for(Book book: library) {
			book.showBookInfo();
		}
	}
}
