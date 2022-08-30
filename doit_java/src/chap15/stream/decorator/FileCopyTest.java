package chap15.stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) throws IOException {
		long millisecond = 0;
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\git\\Do-it-JavaProgrammingStart\\doit_java\\src\\chap15\\stream\\a.zip");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\git\\Do-it-JavaProgrammingStart\\doit_java\\src\\chap15\\stream\\copy.zip");
		try(fis;fos) {
			millisecond = System.currentTimeMillis();
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond;
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사하는 데 " + millisecond + "millisecond 소요되었습니다.");
	}
}
