package chap04.loopexample;

public class Q4_2 {
	public static void main(String[] args) {
		for(int dan = 2; dan <= 9; dan++) {
			if(dan % 2 != 0) {
				continue;
			}
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan +" X "+ i + " = " + dan * i);
			}
			System.out.println( );
		}
	}
}