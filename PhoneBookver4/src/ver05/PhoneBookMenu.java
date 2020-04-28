package ver05;



public class PhoneBookMenu {
	
	
	PhoneBookManager manager=PhoneBookManager.getInstance();
	
	public PhoneBookMenu(){

	}
	
	 public static void menuPrint() {
		
		System.out.println("<<<<메뉴를 선택하세요>>>>>");
		System.out.println(MenuInterface.INSERT+" 전화번호 저장");
		System.out.println(MenuInterface.ALLSHOW+" 전화번호 전체 출력");
		System.out.println(MenuInterface.SELET+" 전화번호 검색");
		System.out.println(MenuInterface.UPDATE+" 전화번호 수정");
		System.out.println(MenuInterface.DELETE+" 전화번호 삭제");		
		System.out.println(MenuInterface.EXIT+" 프로그램종료");
		
	}

	public void menu() {
		
		while(true) {	
			menuPrint();			
			int menuNum=manager.sc.nextInt();
			manager.sc.nextLine();

			
		switch(menuNum) {
		case MenuInterface.INSERT:			
			//데이터 저장
			System.out.println("<<<<메뉴를 선택하세요>>>>>");
			System.out.println(MenuInterface.FRIEND+" 친구 전화번호 저장");
			System.out.println(MenuInterface.UNIV+" 대학 친구 저장");
			System.out.println(MenuInterface.HEIGHT+" 고교 친구 저장");
			System.out.println(MenuInterface.CLUB+" 동호회 저장");
			int choose = manager.sc.nextInt();
			manager.sc.nextLine();
			manager.instance(choose);
			System.out.println();
			break;
			
		case MenuInterface.ALLSHOW:
			//데이터 전체 출력
			System.out.println("---------전화번호 전체 출력-------");		
			manager.showAllData();
			System.out.println();
			break;
			
		case MenuInterface.SELET:
			//데이터 검색
			System.out.println("---------전화번호 검색---------");
			manager.selectData();
			System.out.println();
			break;
			
		case MenuInterface.UPDATE:
			//데이터 수정
			System.out.println("---------전화번호 수정---------");
			manager.update();
			System.out.println();
			break;
		case MenuInterface.DELETE:
			//데이터 삭제
			System.out.println("---------전화번호 삭제---------");
			manager.delete();
			System.out.println();
			break;
		case MenuInterface.EXIT: 
			System.exit(0);
			break;
		default:
			System.out.println("------메뉴를 선택하세요-------");
			System.out.println();
			break;
		
		}
		
		}//while
	}//menu

}//class
