package chap15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("C:\\Users\\admin\\git\\Do-it-JavaProgrammingStart\\doit_java\\src\\chap15\\stream\\input.txt")) {
//		try (FileInputStream fis = new FileInputStream("C:\\Users\\admin\\git\\Do-it-JavaProgrammingStart\\doit_java\\src\\chap15\\stream\\reader.txt")) {	
			int i;
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			System.out.println("end");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
