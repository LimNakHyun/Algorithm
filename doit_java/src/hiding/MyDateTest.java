package hiding;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(20, 2, 2000);
		System.out.println(date1.getDay());
		System.out.println(date1.getMonth());
		System.out.println(date1.getYear());
		System.out.println(date1.isValid());
	}
}
