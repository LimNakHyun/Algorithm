package classpart;

public class StudentTest {
	public static void main(String[] args) {
		Student studentGu = new Student();
		studentGu.studentName = "인구";
		
		System.out.println(studentGu.studentName);
		System.out.println(studentGu.getStudentName());
	}

}
