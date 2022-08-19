package chap07.array;

public class TwoDimension1_1 {
	public static void main(String[] args) {
		char ch = 'a';
		char[][] chArr = new char[13][2];
		
		for(char[] a : chArr) {
//			System.out.println(Arrays.toString(a));
			for(int i = 0; i < a.length; i++, ch++) {
				a[i] = ch;
			}
		}
		
		for(char[] a : chArr) {
			System.out.println(a[0] + " " + a[1]);
		}
	}
}
