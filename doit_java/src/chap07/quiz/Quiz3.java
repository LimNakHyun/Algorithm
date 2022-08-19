package chap07.quiz;
import java.util.Arrays;

public class Quiz3 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				arr[(i/2)-1] = i;
			}
		}
		for(int num : arr) {
			sum += num;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
	}
}
