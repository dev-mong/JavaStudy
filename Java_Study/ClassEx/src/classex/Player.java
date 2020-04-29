package classex;

public class Player {

	// 변수 선언
	int numOfMarble; //구슬개수
	int exchangeMarble; //교환된 구슬 개수
	
	Player() {
	}

	Player(int num) {
		numOfMarble = num; // 사용자의 구글 개수 초기화 
	}
	
	void gameStart(Player p,int num) {
		numOfMarble+=num; // 현재 player win 구슬 획득 
		p.numOfMarble-=num; // 다른 player lose 구슬 잃음 
		exchangeMarble=num; //교환된 구슬 개수
		p.exchangeMarble=num;//다른 player 교환된 구슬개수
	}
	
}
