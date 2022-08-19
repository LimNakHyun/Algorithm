package chap06.staticex;

public class Student2 {
	private static int serialNum3 = 800;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum3++;
		studentID = serialNum3;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		int i = 10;
		return serialNum3;
	}
	
	public static void setSerialNum(int serialNum) {
		Student2.serialNum3 = serialNum;
	}
}
