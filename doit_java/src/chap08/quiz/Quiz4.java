package chap08.quiz;

class Employee {
	public String name;
	public String grade;
//	public Employee() {
//		
//	}
	public Employee(String name) {
		this.name = name;
	}
}

class Engineer extends Employee {
	private String skillSet;
	
	public Engineer(String name) {
		super(name);
	}
	
	public String getSkillSet() {
		return skillSet;
	}
	
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
}

public class Quiz4 {

}
