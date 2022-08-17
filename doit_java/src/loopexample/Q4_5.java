package loopexample;

public class Q4_5 {
	public static void main(String[] args) {
		for(int i = 1; i <= 7; i+=2) {
			for(int j = 1; j <= (7-i)/2; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println( );
		}
		for(int i = 5; i >= 1; i-=2) {
			for(int j = 1; j <= (7-i)/2; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println( );
		}
	}
}
