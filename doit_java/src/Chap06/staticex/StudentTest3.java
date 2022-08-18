package Chap06.staticex;

public class StudentTest3 {
	public static void main(String[] args) {
		Student1 studentIngu = new Student1();
		studentIngu.setStudentName("야구");
		System.out.println(Student1.serialNum2);
		System.out.println(studentIngu.studentName + " 학번: " + studentIngu.studentID);
		
		Student1 studentNak = new Student1();
		studentNak.setStudentName("naknak");
		System.out.println(Student1.serialNum2);
		System.out.println(studentNak.studentName + " 학번: " + studentNak.studentID);
	}
}
