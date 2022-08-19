package chap07.arraylist;

public class StudentTest {
	public static void main(String[] args) {
		Student studentRodong = new Student(3,"Rodong");
		studentRodong.addSubject("롤", 95);
		studentRodong.addSubject("다크소울", 80);
		
		Student studentIngu = new Student(4, "Ingu");
		studentIngu.addSubject("레식", 80);
		studentIngu.addSubject("롤", 65);
		studentIngu.addSubject("포나", 90);
		
		studentRodong.showStudentInfo();
		System.out.println("====================================================");
		studentIngu.showStudentInfo();
	}
}
