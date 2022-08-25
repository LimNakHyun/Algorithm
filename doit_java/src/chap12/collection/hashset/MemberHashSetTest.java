package chap12.collection.hashset;

import chap12.collection.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberIngu = new Member(8932, "인구");
		Member memberLingu = new Member(4636, "린구");
		Member memberIndu = new Member(303, "인두");
		
		memberHashSet.addMember(memberIngu);
		memberHashSet.addMember(memberLingu);
		memberHashSet.addMember(memberIndu);
		memberHashSet.showAllMember();
		
		Member memberAngu = new Member(303, "안구");
		memberHashSet.addMember(memberAngu);
		memberHashSet.showAllMember();
	}
}
