package Chap05.test;

import Chap05.hiding.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student studentIngu = new Student();
		studentIngu.studentName = "김인구";
//		studentIngu.setStudentName("김인구");
		
		System.out.println(studentIngu.getStudentName());
	}
}