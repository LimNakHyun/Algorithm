package chap04.loopexample;

public class Q4_4 {
	public static void main(String[] args) {
		for(int i = 1; i <= 7; i = i + 2) {
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
