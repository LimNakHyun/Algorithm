package chap07.array;

public class Student {
	static private int serialNum = 1000;
	public int studentID;
	private String name;
	
	public Student(String name) {
		serialNum++;
		this.name = name;
		studentID = serialNum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID + ", " + name);
	}
}
