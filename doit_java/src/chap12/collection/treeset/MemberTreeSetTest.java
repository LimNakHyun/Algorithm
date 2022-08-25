package chap12.collection.treeset;

import chap12.collection.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberIngu = new Member(8932, "인구");
		Member memberLingu = new Member(4636, "린구");
		Member memberIndu = new Member(303, "인두");
		
		memberTreeSet.addMember(memberIngu);
		memberTreeSet.addMember(memberLingu);
		memberTreeSet.addMember(memberIndu);
		memberTreeSet.showAllMember();
		
		Member memberAngu = new Member(8932, "안구");
		memberTreeSet.addMember(memberAngu);
		memberTreeSet.showAllMember();
	}
}
