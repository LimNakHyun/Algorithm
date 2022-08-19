package chap07.arraylist;

public class StudentTest1 {
	public static void main(String[] args) {
		Student1 studentRodong = new Student1(849, "로동");
		studentRodong.addSubject("리고브레전드", 95);
		studentRodong.addSubject("닼소", 80);
		
		Student1 studentIndu = new Student1(850, "린구");
		studentIndu.addSubject("레인보우6", 80);
		studentIndu.addSubject("LOL", 65);
		studentIndu.addSubject("FortNight", 90);
		
		studentRodong.showStudentInfo();
		System.out.println("=====================================================");
		studentIndu.showStudentInfo();
	}
}
