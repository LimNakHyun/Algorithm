package chap07.quiz;
import java.util.ArrayList;

public class DogTestArrayList {
	public static void main(String[] args) {
		ArrayList<Dog> list = new ArrayList<Dog>();
		list.add(new Dog("MeMe", "idonno"));
		list.add(new Dog("DoDo", "cat1"));
		list.add(new Dog("LeLe", "cat2"));
		list.add(new Dog("HamJee", "Hamster"));
		list.add(new Dog("Dal", "mollu"));
		
		for(Dog dog : list) {
			System.out.println(dog.showDogInfo());
		}
		System.out.println();
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).showDogInfo());
		}
	}
}
