package finalproject.test;

import finalproject.school.School;
import finalproject.school.Score;
import finalproject.school.Student;
import finalproject.school.Subject;
import finalproject.school.report.GenerateGradeReport;
import finalproject.utils.Define;

public class TestMain {
	School jungleSchool = School.getInstance();
	Subject korean;
	Subject math;
	Subject dance;
	
	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) {
		TestMain test = new TestMain();
		
		test.createSubject();
		test.createStudent();
		
		String report = test.gradeReport.getReport();
		System.out.println(report);
	}
	
	public void createSubject() {
		korean = new Subject("국어", Define.KOREAN);
		math = new Subject("수학", Define.MATH);
		dance = new Subject("방송 댄스", Define.DANCE);
		
		dance.setGradeType(Define.PF_TYPE);
		
		jungleSchool.addSubject(korean);
		jungleSchool.addSubject(math);
		jungleSchool.addSubject(dance);
	}
	
	public void createStudent() {
		Student student1 = new Student(148932, "인구", korean);
		Student student2 = new Student(144636, "린구", math);
		Student student3 = new Student(140303, "인두", korean);
		Student student4 = new Student(202020, "안구", korean);
		Student student5 = new Student(302016, "인수", math);
		
		jungleSchool.addStudent(student1);
		jungleSchool.addStudent(student2);
		jungleSchool.addStudent(student3);
		jungleSchool.addStudent(student4);
		jungleSchool.addStudent(student5);
		
		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);
		
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		
		dance.register(student1);
		dance.register(student2);
		dance.register(student3);
		
		addScoreForStudent(student1, korean, 95);
		addScoreForStudent(student1, math, 56);
		addScoreForStudent(student1, dance, 95);
		
		addScoreForStudent(student2, korean, 95);
		addScoreForStudent(student2, math, 95);
		addScoreForStudent(student2, dance, 85);
		
		addScoreForStudent(student3, korean, 100);
		addScoreForStudent(student3, math, 88);
		addScoreForStudent(student3, dance, 55);
		
		addScoreForStudent(student4, korean, 89);
		addScoreForStudent(student4, math, 95);
		
		addScoreForStudent(student5, korean, 85);
		addScoreForStudent(student5, math, 56);
	}
	
	public void addScoreForStudent(Student student, Subject subject, int point) {
		Score score = new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);
	}
}
