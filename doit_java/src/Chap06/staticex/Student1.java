package Chap06.staticex;

public class Student1 {
	public static int serialNum2 = 900;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() {
		serialNum2++;
		studentID = serialNum2;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
