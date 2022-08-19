package chap07.quiz;

public class Quiz2 {
	public static void main(String[] args) {
		char ch = 'A';
		char[][] chArr = new char[13][2];
		
		for(char[] a : chArr) {
			for(int i = 0; i < a.length; i++, ch++) {
				a[i] = ch;
			}
		}
		
		for(char[] a : chArr) {
			System.out.println(a[0] + ", " + a[1]);
		}
	}
}
