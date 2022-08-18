package staticex;

public class Student3 {
	private static int serialNum4 = 10000;
	private static int studentIdCardNum;
	int studentID;
	int studentIdCard;
	String studentName;
	int grade;
	String address;
	
	public Student3() {
		serialNum4++;
		studentIdCardNum = serialNum4 + 100;
		studentID = serialNum4;
		studentIdCard = studentIdCardNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentname) {
		studentName = studentname;
	}
	
	public static int getSerialNum() {
		return serialNum4;
	}
	
	public static void setSerialNum(int serialNum) {
		Student3.serialNum4 = serialNum;
	}
	
	public static int getStudentIdCardNum() {
		return studentIdCardNum;
	}
	
	public static void setStudentIdCardNum(int studentIdCardNum) {
		Student3.studentIdCardNum = studentIdCardNum;
	}
}
