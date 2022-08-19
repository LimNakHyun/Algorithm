package chap07.array;

public class CharArray {
	public static void main(String[] args) {
		int size = 'Z' - 'A' + 1;
		char[] alphabets = new char[size];
		char ch = 'A';
		
		for(int i = 0; i < size; i++, ch++) {
			alphabets[i] = ch;
		}
		
		for(int i = 0; i < size; i++) {
			System.out.println(alphabets[i] + "," + (int)alphabets[i]);
		}
	}
}
