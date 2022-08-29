package chap14.alone.p509;

public class PWFormatTest {
	private String userPW;
	
	public String getUserPW() {
		return userPW;
	}
	
	public void setUserPW(String userPW) throws PWFormatException {
		if (userPW == null) {
			throw new PWFormatException("비밀번호는 null일 수 없습니다.");
		} else if (userPW.length() <= 5) {
			throw new PWFormatException("비밀번호는 5글자보다 짧으면 안됩니다.");
		} else if (userPW.matches("[a-zA-Z]+")) {
			throw new PWFormatException("비밀번호에는 적어도 하나의 숫자가 포함되어야 합니다.");
		}
		this.userPW = userPW;
		System.out.println("비밀번호 설정이 완료되었습니다.");
	}
	
	public static void main(String[] args) {
		PWFormatTest test = new PWFormatTest();
		
		String userPW = null;
		try {
			test.setUserPW(userPW);
		} catch (PWFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userPW = "tarzan";
		try {
			test.setUserPW(userPW);
		} catch (PWFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userPW = "IU2";
		try {
			test.setUserPW(userPW);
		} catch (PWFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userPW = "all4you";
		try {
			test.setUserPW(userPW);
		} catch (PWFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
