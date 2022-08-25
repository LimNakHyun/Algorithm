package chap12.collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("인구");
		treeSet.add("린구");
		treeSet.add("인두");
		
		for (String str : treeSet) {
			System.out.println(str);
		}
	}
}
