package chap12.map.treemap;

import chap12.collection.Member;

public class MemberTreeMapTest {
	public static void main(String[] args) {
		MemberTreeMap memberHashMap = new MemberTreeMap();
		
		Member memberIngu = new Member(8932, "인구");
		Member memberLingu = new Member(4636, "린구");
		Member memberIndu = new Member(303, "인두");
		Member memberAngu = new Member(20, "안구");
		
		memberHashMap.addMember(memberIngu);
		memberHashMap.addMember(memberLingu);
		memberHashMap.addMember(memberIndu);
		memberHashMap.addMember(memberAngu);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(20);
		memberHashMap.showAllMember();
	}
}
