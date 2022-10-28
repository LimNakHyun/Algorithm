package library.sortingAlgorithm;

public class CountingSort {
	//시간복잡도가 O(n + k) (k 는 최댓값) 인 카운팅 솔트
	static int valueSetting(int[] arr, int[] temp, int ind, int i) {
		for(int j = 0; j < temp[i]; j++) {
			arr[ind++] = i;
		}
		return ind;
	}

	public static void countingSort(int[] arr, boolean rev) {
		int k = 0;
		for(int i : arr) {
			if(i > k) k = i;
		}
		
		int[] temp = new int[k + 1];
		for(int i : arr) {
			temp[i]++;
		}
		
		int ind = 0;
		if(!rev) {
			for(int i = 0; i < temp.length; i++) {
				ind = valueSetting(arr, temp, ind, i);
			}
		}
		if(rev) {
			for(int i = temp.length - 1; i >= 0; i--) {
				ind = valueSetting(arr, temp, ind, i);
			}
		}
	}
	
}
