package chap12.collection.arraylist;

import chap12.collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberGu = new Member(8932, "인구");
		Member memberRo = new Member(3377, "로동");
		Member memberJo = new Member(9014, "종핵");
		Member memberOo = new Member(8823, "동옥");
		Member memberYu = new Member(6243, "유혁");
		
		memberArrayList.addMember(memberGu);
		memberArrayList.addMember(memberRo);
		memberArrayList.addMember(memberJo);
		memberArrayList.addMember(memberOo);
		memberArrayList.insertMember(memberYu, 0);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberOo.getMemberId());
		memberArrayList.showAllMember();
	}
}
