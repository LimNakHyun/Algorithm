package chap10.bookshelf;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("퍼시잭슨 1");
		shelfQueue.enQueue("퍼시잭슨 2");
		shelfQueue.enQueue("퍼시잭슨 3");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}
}
