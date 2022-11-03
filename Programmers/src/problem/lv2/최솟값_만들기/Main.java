package problem.lv2.최솟값_만들기;

import java.util.Arrays;

//import library.sortingAlgorithm.BubbleSort;
import library.sortingAlgorithm.CountingSort;

public class Main {
	
	public static void main(String[] args) {
		//두 배열 A, B가 주어졌을 때, 비 복원추출로 뽑은
		//각각의 원소들의 곱의 합의 최소값을 리턴

		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		//위 예제에서는 1*5 + 2*4 + 4*4 = 29 일 때가 최소


		int answer = 0;
		
		System.out.println("배열 A 출력 : " + Arrays.toString(A));
		System.out.println("배열 B 출력 : " + Arrays.toString(B));
		System.out.println();
		
//		BubbleSort.bubbleSort(A, false);
//		BubbleSort.bubbleSort(B, true);
//		
//		System.out.println("sorted A : " + Arrays.toString(A));
//		System.out.println("revsort B : " + Arrays.toString(B));
//		
//		for(int i = 0; i < A.length; i++) {
//			answer += A[i] * B[i];
//		}
		
		CountingSort.countingSort(A, false);
		System.out.println("배열 A 정방정렬 : " + Arrays.toString(A));
		
		CountingSort.countingSort(B, true);
		System.out.println("배열 B 역순정렬 : " + Arrays.toString(B));
		
		System.out.println();

		String s = "";
		for(int i = 0; i < A.length; i++) {
			answer += A[i] * B[i];
			s = s + String.valueOf(A[i]) + "*" + String.valueOf(B[i]) + " + ";
		}
		
		System.out.println("곱의 합 최소값 : " + s.substring(0, s.length() - 2) + "= " + answer);
		
	}
}
