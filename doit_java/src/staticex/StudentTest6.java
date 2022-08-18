package staticex;

public class StudentTest6 {
	public static void main(String[] args) {
		Student3 ingu = new Student3();
		ingu.setStudentName("망구");
		System.out.println(Student3.getSerialNum());
		System.out.println(Student3.getStudentIdCardNum());
		
		Student3 nak = new Student3();
		nak.setStudentName("낙현");
		System.out.println(Student3.getSerialNum());
		System.out.println(Student3.getStudentIdCardNum());
	}
}
