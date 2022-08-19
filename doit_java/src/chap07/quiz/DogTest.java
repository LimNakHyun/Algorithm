package chap07.quiz;

public class DogTest {
	public static void main(String[] args) {
		Dog[] dogs = new Dog[5];

		dogs[0] = new Dog("MeMe", "idonno");
		dogs[1] = new Dog("DoDo", "cat1");
		dogs[2] = new Dog("LeLe", "cat2");
		dogs[3] = new Dog("HamJee", "Hamster");
		dogs[4] = new Dog("Dal", "mollu");
		
		for(Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}
	}
}
