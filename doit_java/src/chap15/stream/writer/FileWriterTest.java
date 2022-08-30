package chap15.stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\admin\\git\\Do-it-JavaProgrammingStart\\doit_java\\src\\chap15\\stream\\writer.txt");
		try (fw) {
			fw.write('A');
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			fw.write(buf);
			fw.write("나아는 서어포터다아");
			fw.write(buf, 1, 2);
			fw.write("65");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
