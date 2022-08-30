package chap15.stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) throws IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\admin\\git\\Do-it-JavaProgrammingStart\\doit_java\\src\\chap15\\stream\\reader.txt");
		InputStreamReader isr = new InputStreamReader(fs);
		try(isr) {
		    int i;
		    while ((i = isr.read()) != -1) {
			    System.out.print((char)i);
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
