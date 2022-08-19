package chap07.array;

public class StudentArray {
	public static void main(String[] args) {
		Student[] list = new Student[3];
		
		list[0] = new Student("Geunchool");
		list[1] = new Student("LordOFLockerRoom");
		list[2] = new Student("BoyNextDoor");
		
		for(int i = 0; i < list.length; i++) {
			list[i].showStudentInfo();
		}
	}
}
