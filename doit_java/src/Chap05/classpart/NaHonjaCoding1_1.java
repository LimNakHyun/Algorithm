package Chap05.classpart;

public class NaHonjaCoding1_1 {
	public static void main(String[] args) {
		Man man = new Man();
		man.getManAge(40);
		man.getManName("James");
		man.getManIsMarried(true);
		man.getManNumberOfChildren(3);
		System.out.println(man.manAge);
		System.out.println(man.manName);
		System.out.println(man.manIsMarried);
		System.out.println(man.manNumberOfChildren);
	}
}

class Man {
	int manAge;
	String manName;
	boolean manIsMarried;
	int manNumberOfChildren;
	
	void getManAge(int age) {
		manAge = age;
	}
	
	void getManName(String name) {
		manName = name;
	}
	
	void getManIsMarried(boolean married) {
		manIsMarried = married;
	}
	
	void getManNumberOfChildren(int children) {
		manNumberOfChildren = children;
	}
}
