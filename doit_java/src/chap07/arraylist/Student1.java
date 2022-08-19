package chap07.arraylist;
import java.util.ArrayList;

public class Student1 {
	int studentID;
	String studentName;
	ArrayList<Subject1> subjectList;
	
	public Student1(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject1>();
	}
	
	public void addSubject(String name, int score) {
		Subject1 subject1 = new Subject1();
		subject1.setName(name);
		subject1.setScore(score);
		subjectList.add(subject1);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject1 s : subjectList) {
			total += s.getScore();
			System.out.println(studentName + "의 " + s.getName() + " 점수는 " + s.getScore() + "점 입니다.");
		}
		System.out.println(studentName + "의 총점은 " + total + " 입니다.");
	}
}
