package chap07.array;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {
		bookName = "아무 책이가 업서요";
		author = "작가분을 몰루겠어요";
	}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
}
