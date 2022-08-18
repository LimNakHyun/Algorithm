package staticex;

public class StudentTest4 {
	public static void main(String[] args) {
		Student2 studentIngu = new Student2();
		studentIngu.setStudentName("린구");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentIngu.studentName + " 학번: " + studentIngu.studentID);
		
		Student2 studentNak = new Student2();
		studentNak.setStudentName("naknak");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentNak.studentName + " 학번: " + studentNak.studentID);
	}
}
