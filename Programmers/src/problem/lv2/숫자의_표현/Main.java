package problem.lv2.숫자의_표현;

public class Main {
	public static void main(String[] args) {
		// int n = 5;
		// int a = 1;
		// int d = 1;
		
		// int sum = n * (2 * a + (n - 1) * d) / 2;
	    // System.out.println("수열의 합 : " + sum);
		
		// int sumD1 = n * (2 * a + n - 1) / 2;
		// System.out.println("수열의 합 : " + sumD1);

		//자연수 s가 주어졌을 때, 그 자연수를
		//연속된 자연수의 합으로 표현할 수 있는 방법의 경우의 수를 리턴
		
		int s = 15;
		int cnt = 1;
		//15의 경우
		//1+2+3+4+5 = 15
		//4+5+6 = 15
		//7+8 = 15
		//15
		//로 총 4가지가 있다.

		for(int i = 1; i < s; i++) {
			for(int j = 1; j < 150; j++) {
				if(2 * s == j * (2 * i + j - 1)) {
					// System.out.println("초항 : " + i);
					// System.out.println("항 수 : " + j);

					String st = "";
					for(int k = i; k < i + j; k++) {
						st = st + String.valueOf(k) + "+";
					}
					int len = st.length();
					System.out.println(st.substring(0, len - 1) + " = 15");
					// System.out.println();
					cnt++;
				}
				else if(2 * s < j * (2 * i + j - 1)) break;
			}
		}
		System.out.println(s + " = " + s);

	    System.out.println();
	    System.out.println("갯수 : " + cnt);
		System.out.println();
	    
	}
}
