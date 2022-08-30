package chap15.stream.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Maple implements Externalizable {
	String job;
	
	public Maple() {
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(job);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		job = in.readUTF();
	}
	
	public String toString() {
		return job;
	}
}

public class ExternalizableTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Maple myJob = new Maple();
		myJob.job = "듀얼블레이더";
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\git\\Do-it-JavaProgrammingStart\\doit_java\\src\\chap15\\stream\\external.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		try (fos; oos) {
			oos.writeObject(myJob);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\git\\Do-it-JavaProgrammingStart\\doit_java\\src\\chap15\\stream\\external.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Maple maple = (Maple)ois.readObject();
		System.out.println(maple);
	}
}
