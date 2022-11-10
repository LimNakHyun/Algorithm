package library.baseConcept;

public class Swap {
	// 배열 arr 과 두 정수가 주어졌을 때,
	// 배열에서 주어진 두 정수의 인덱스 요소
    public static void swapInt(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void swapChar(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
