package chap05.constructor;

public class PersonTest {
	public static void main(String[] args) {
		Person personLee = new Person();	//Person() 이 바로 생성자
		System.out.println(personLee.name);
		
		Person ingu = new Person("insu",180.8F,100.9F);
		System.out.println(ingu.name);
		System.out.println(ingu.height);
		System.out.println(ingu.weight);
	}
}
