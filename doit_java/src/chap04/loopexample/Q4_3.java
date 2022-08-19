package chap04.loopexample;

public class Q4_3 {
	public static void main(String[] args) {
		for(int dan = 2; dan <= 9; dan++) {
			for(int i = 1; i <= 9; i++) {
				if(i > dan) {
					break;
				}
				System.out.println(dan + " X " + i + " = " + dan * i);
			}
			System.out.println( );
		}
	}
}
