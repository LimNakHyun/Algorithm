package library.numberTheory;

public class Fibonacci {
	public static long dynamicFibo(int n) {
		if(n == 1 || n == 2) return 1;
		
		long[] temp = new long[n];
		temp[0] = temp[1] = 1;
		for(int i = 0; i < n - 2; i++) {
			temp[i + 2] = (temp[i + 1] + temp[i]) % 1234567;
		}
		
//		System.out.println(Arrays.toString(temp));
		
		return temp[n - 1];
	}

	public static int reCursiveFibo(int n) {
		if(n == 0 || n == 1) return 1;
		return reCursiveFibo(n - 1) + reCursiveFibo(n - 2);
	}
	
	public static long variableFibo(int n) {
		long i = 0;
		long j = 1;
		if(n == 0 && n == 1) return 1;
		for(int k = 0; k < n - 1; k++) {
			if(i > j) j += i;
			else i += j;		
		}
		
		return Math.max(i, j);
	}
	
}
