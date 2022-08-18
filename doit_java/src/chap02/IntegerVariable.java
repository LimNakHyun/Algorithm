package chap02;

public class IntegerVariable {
	public static void main(String[] args) {
		short sVal = 10;
		byte bVal = 20;
		System.out.println(sVal + bVal);
	}
}

//프로그램이 실행되어 정수 값을 연산할 때 4바이트를 기본 단위로 사용하기 때문에,
//두 정수를 더하기 전, 두 정수는 모두 int형으로 변환된다. 또한 더한 결과 값도 int형으로 저장된다.
//즉 정수의 기본형은 int형이며, byte형이나 short형은 컴퓨터가 연산을 편리하게 하려고 내부적으로
//int형으로 변환한다.
//그렇지만 int형 외에 다른 자료형이 필요없는것은 아니다. 1바이트 단위로 데이터를 조작하는 경우도 있으며,
//C나 C++과 같은 다른 언어와 호환이 가능하도록 short형을 사용하는 경우도 있다.
