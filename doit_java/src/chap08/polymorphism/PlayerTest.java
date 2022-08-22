package chap08.polymorphism;
import java.util.ArrayList;

class Player {
	public void play() {
		System.out.println("플레이어가 게임을 합니다.");
	}
}

class TopLiner extends Player {
	public void play() {
		System.out.println("탑이 솔킬을 땁니다.");
	}
	
	public void jungleChai() {
		System.out.println("탑이 정글차이를 외칩니다.");
	}
}

class Jungle extends Player {
	public void play() {
		System.out.println("정글이 오브젝트를 먹습니다.");
	}
	
	public void teamChai() {
		System.out.println("정글이 팀차이를 외칩니다.");
	}
}

class MidLiner extends Player {
	public void play() {
		System.out.println("미드가 로밍을 갑니다.");
	}
	
	public void iAmCarry() {
		System.out.println("미드가 말합니다. \"내 캐리임\"");
	}
}

class ADCarry extends Player {
	public void play() {
		System.out.println("원딜이 CS를 먹습니다.");
	}
	
	public void mePenta() {
		System.out.println("원딜이 펜타를 달라고 합니다.");
	}
}

class Supporter extends Player {
	public void play() {
		System.out.println("서포터가 와드를 박습니다.");
	}
	
	public void sheIsMyDaughter() {
		System.out.println("캐리하는 원딜이 내 딸래미라고 합니다.");
	}
}

public class PlayerTest {
	ArrayList<Player> playerList = new ArrayList<Player>();
	
	public static void main(String[] args) {
		PlayerTest pTest = new PlayerTest();
		System.out.println("========== 희망편 ==========");
		pTest.addPlayer();
		System.out.println();
		System.out.println("========== 절망편 ==========");
		pTest.testCasting();
	}
	
	public void addPlayer() {
		playerList.add(new TopLiner());
		playerList.add(new Jungle());
		playerList.add(new MidLiner());
		playerList.add(new ADCarry());
		playerList.add(new Supporter());
		
		for(Player player : playerList) {
			player.play();
		}
	}
	
	public void testCasting() {
		for(int i = 0; i < playerList.size(); i++) {
			Player pla = playerList.get(i);
			if(pla instanceof TopLiner) {
				TopLiner t = (TopLiner)pla;
				t.jungleChai();
			}
			else if(pla instanceof Jungle) {
				Jungle j = (Jungle)pla;
				j.teamChai();
			}
			else if(pla instanceof MidLiner) {
				MidLiner m = (MidLiner)pla;
				m.iAmCarry();
			}
			else if(pla instanceof ADCarry) {
				ADCarry a = (ADCarry)pla;
				a.mePenta();
			}
			else if(pla instanceof Supporter) {
				Supporter s = (Supporter)pla;
				s.sheIsMyDaughter();
			}
			else {
				System.out.println("존재하지 않는 라인입니다.");
			}
		}
	}
}
