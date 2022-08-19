package chap07.array;
import java.util.ArrayList;

public class StudentArrayList {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("나기"));
		list.add(new Student("프레디"));
		list.add(new Student("테일"));
		
		for(Student student : list) {
			student.showStudentInfo();
		}
	}
}
