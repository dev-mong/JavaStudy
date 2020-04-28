package classex;

public class MarbleMain {

	public static void main(String[] args) {
		Player player1 = new Player(15); //player1 객체 생성
		Player player2 = new Player(9); //player2 객체 생성
		
		// player1 구슬 2개 획득, player2 2개 잃음 
		player1.gameStart(player2, 2); 
			
		System.out.println("  <<  1차 게임 결과   >>  ");
		System.out.println("현재 player1 보유한 구슬 개수: "+player1.numOfMarble);
		System.out.println("현재 player2 보유한 구슬 개수: "+player2.numOfMarble);
		System.out.println("1차 게임에서 player1은  "+player1.exchangeMarble+"개를 획득");
		System.out.println("1차 게임에서 player2은  "+player2.exchangeMarble+"개를 잃음");
		
		// player2 구슬 7개 회득, player1 7개 잃음 
		player2.gameStart(player1, 7); 
		
		System.out.println("  <<  2차 게임 결과  >>  ");
		System.out.println("현재 player1 보유한 구슬 개수: "+player1.numOfMarble);
		System.out.println("현재 player2 보유한 구슬 개수: "+player2.numOfMarble);
		System.out.println("2차 게임에서 player1은  "+player1.exchangeMarble+"개를 잃음");
		System.out.println("2차 게임에서 player2은  "+player2.exchangeMarble+"개를 획득");

		
	}
	
	

}
