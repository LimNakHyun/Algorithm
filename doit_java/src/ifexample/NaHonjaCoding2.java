package ifexample;

public class NaHonjaCoding2 {
	public static void main(String[] args) {
		int floor = 5;
		String place = "";
		
		switch(floor) {
		case 1 : 
			place = "약국";
			break;
		case 2 :
			place = "정형외과";
		case 3 :
			place = "피부과";
		case 4 :
			place = "치과";
		case 5 :
			place = "헬스 클럽";
		}
		System.out.println(floor+"층 "+place+"입니다");
	}
}
