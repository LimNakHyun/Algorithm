package chap15.stream.others;

import java.io.Console;

public class ConsoleTest {
	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("이름:");
		String name = console.readLine();
		System.out.println("직업:");
		String job = console.readLine();
		System.out.println("레벨");
		char[] level = console.readPassword();
		String strLevel = new String(level);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strLevel);
	}
}
