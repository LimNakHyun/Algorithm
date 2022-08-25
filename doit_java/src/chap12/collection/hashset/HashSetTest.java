package chap12.collection.hashset;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add(new String("제우스"));
		hashSet.add(new String("오너"));
		hashSet.add(new String("페이커"));
		hashSet.add(new String("구마유시"));
		hashSet.add(new String("케리아"));
		hashSet.add(new String("케리아"));
		
		System.out.println(hashSet);
	}
}
