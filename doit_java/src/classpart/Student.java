package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
//	public void showStudentInfo() {
//		System.out.println(studentName + ", " + address);
//	}
	
	public String getStudentName() {
		return studentName;
	}
	
//	public void setStudentName(String name) {
//		studentName = name;
//	}
	
	public static void main(String[] args) {
		Student studentNak =  new Student();
		studentNak.studentName = "낙낙";
		
		System.out.println(studentNak.studentName);
		System.out.println(studentNak.getStudentName());
	}
}
