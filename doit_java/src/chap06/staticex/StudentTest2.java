package chap06.staticex;

public class StudentTest2 {
	public static void main(String[] args) {
		Student1 studentIngu = new Student1();
		studentIngu.setStudentName("아구");
		System.out.println(Student1.serialNum2);
		System.out.println(studentIngu.studentName + " 학번: " + studentIngu.serialNum2);
		
		Student1 studentNak = new Student1();
		studentNak.setStudentName("naknak");
		System.out.println(studentNak.serialNum2);
		System.out.println(studentNak.studentName + " 학번: " + studentNak.serialNum2);
	}
}
