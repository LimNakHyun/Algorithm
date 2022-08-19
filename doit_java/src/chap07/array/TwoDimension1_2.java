package chap07.array;

public class TwoDimension1_2 {
	public static void main(String[] args) {
		char[][] chArr = new char[13][2];
		char ch = 'a';
		
		for(int i = 0; i < chArr.length; i++) {
			for(int j = 0; j < chArr[i].length; j++) {
				chArr[i][j] = ch;
				System.out.print(chArr[i][j] + " ");
				ch++;
			}
			System.out.println();
		}
	}
}
