package Chap02.chapter2;

public class DoubleEx2 {
	public static void main(String[] args) {
		double dnum = 1;
		
		for (int i = 0; i < 10000; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);
	}
}

//부동 소수점 방식은 지수로 표현되는 값이 0을 나타낼 수 없기 떄문에,
//약간의 오차가 발생할 수 있다.
//그럼에도 더 넓은 범위의 실수 값을 표현하기 위해 부동 소수점 방식을 사용한다.
