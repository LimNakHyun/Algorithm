package chap12.quiz;

import java.util.HashSet;

public class StudentTest {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<>();
		set.add(new Student("8932", "인구"));
		set.add(new Student("4636", "린구"));
		set.add(new Student("303", "인구"));
		set.add(new Student("20", "안구"));
		set.add(new Student("8932", "인수"));
		
		System.out.println(set);
	}
}
