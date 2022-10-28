package problem.lv2.최솟값_만들기;

import java.util.Arrays;

//import library.sortingAlgorithm.BubbleSort;
import library.sortingAlgorithm.CountingSort;

public class Main {
	
	public static void main(String[] args) {
		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		
		int answer = 0;
		
		System.out.println("array A : " + Arrays.toString(A));
		System.out.println("array B : " + Arrays.toString(B));
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
//		
		
		CountingSort.countingSort(A, false);
		System.out.println("sorted A : " + Arrays.toString(A));
		
		System.out.println();
		
		CountingSort.countingSort(B, true);
		System.out.println("sorted B : " + Arrays.toString(B));
		
		for(int i = 0; i < A.length; i++) {
			answer += A[i] * B[i];
		}
		
		System.out.println("답 : " + answer);
		
	}
}