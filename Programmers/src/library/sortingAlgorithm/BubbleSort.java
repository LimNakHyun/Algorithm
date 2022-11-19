package library.sortingAlgorithm;

import library.baseConcept.Swap;

public class BubbleSort {
	//시간복잡도가 O(n^2) 인 정렬 버블솔트

	public static void bubbleSort(int[] arr, boolean rev) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j] && rev) {
					Swap.swapInt(arr, i, j);
				}
				if(arr[i] > arr[j] && !rev) {
					Swap.swapInt(arr, i, j);
				}
			}
		}
	}
	
}
