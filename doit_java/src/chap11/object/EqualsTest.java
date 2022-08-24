package chap11.object;

class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return studentId + "," + studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		Student studentIngu = new Student(100, "인구");
		Student studentIndu = studentIngu;
		Student studentLingu = new Student(100, "인구");
		
		if(studentIngu == studentIndu) {
			System.out.println("studentIngu와 studentIndu의 주소는 같습니다.");
		} else {
			System.out.println("studentIngu와 studentIndu의 주소는 다릅니다.");
		}
		
		if(studentIngu.equals(studentIndu)) {
			System.out.println("studentIngu와 studentIndu는 동일합니다.");
		} else {
			System.out.println("studentIngu와 studentIndu는 동일하지 않습니다.");
		}
		
		if(studentIngu == studentLingu) {
			System.out.println("studentIngu와 studentLingu의 주소는 같습니다.");
		} else {
			System.out.println("studentIngu와 studentLingu의 주소는 다릅니다.");
		}
		
		if(studentIngu.equals(studentLingu)) {
			System.out.println("studentIngu와 studentLingu는 동일합니다.");
		} else {
			System.out.println("studentIngu와 studentLingu는 동일하지 않습니다.");
		}
		
		System.out.println("studentIngu의 hashCode :" + studentIngu.hashCode());
		System.out.println("studentLingu의 hashCode :" + studentLingu.hashCode());
		
		System.out.println("studentIngu의 실제 주소값 :" + System.identityHashCode(studentIngu));
		System.out.println("studentLingu의 실제 주소값 :" + System.identityHashCode(studentLingu));
	}
}
