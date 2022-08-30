package chap15.stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 4195849746332171512L;
//	private static final long serialVersionUID = -1503252402544036183L;
	transient String name;
	String job;
	
	public Person() {
	}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + "," + job;
	}
}

public class SerializationTest {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Person personDan = new Person("빙설단검", "듀얼블레이더");
		Person personLin = new Person("힝구아구", "아델");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\git\\Do-it-JavaProgrammingStart\\doit_java\\src\\chap15\\stream\\serial.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		try (oos) {
			oos.writeObject(personDan);
			oos.writeObject(personLin);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\git\\Do-it-JavaProgrammingStart\\doit_java\\src\\chap15\\stream\\serial.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try (ois) {
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
