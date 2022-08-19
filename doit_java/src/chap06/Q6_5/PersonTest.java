package chap06.Q6_5;

public class PersonTest {
	public static void main(String[] args) {
		Person person1 = new Person("김씨", 50000);
		person1.지갑Info();
		별다방 아메리카노 = new 별다방();
		person1.buy별다방(아메리카노);
		person1.지갑Info();
		아메리카노.별다방Info();
		
		Person person2 = new Person("이씨", 35000);
		person2.지갑Info();
		콩다방 라테 = new 콩다방();
		person2.buy콩다방(라테);
		person2.지갑Info();
		라테.콩다방Info();
	}
}
