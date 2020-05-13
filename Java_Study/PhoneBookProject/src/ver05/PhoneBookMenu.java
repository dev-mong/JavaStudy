package ver05;



public class PhoneBookMenu {
	
	PhoneBookManager manager = new PhoneBookManager();
	
	public PhoneBookMenu(){

	}
	
	 public static void menuPrint() {
		
		System.out.println("<<<<메뉴를 선택하세요>>>>>");
		System.out.println("1.전화번호 저장");
		System.out.println("2.전화번호 전체 출력");
		System.out.println("3.전화번호 검색");
		System.out.println("4.전화번호 수정");
		System.out.println("5.전화번호 삭제");		
		System.out.println("6.프로그램종료");
		
	}

	public void menu() {
		
		while(true) {	
			menuPrint();			
			String menuNum=manager.sc.nextLine();

			
		switch(menuNum) {
		case "1":			
			//데이터 저장
			System.out.println("<<<<메뉴를 선택하세요>>>>>");
			System.out.println("1.친구 전화번호 저장");
			System.out.println("2.대학 친구 저장");
			System.out.println("3.회사 친구 저장");
			System.out.println("4.동호회 저장");
			int choose = manager.sc.nextInt();
			manager.sc.nextLine();
			manager.instance(choose);
			System.out.println();
			break;
			
		case "2":
			//데이터 전체 출력
			System.out.println("---------전화번호 전체 출력-------");		
			manager.showAllData();
			System.out.println();
			break;
			
		case "3":
			//데이터 검색
			System.out.println("---------전화번호 검색---------");
			manager.selectData();
			System.out.println();
			break;
			
		case "4":
			//데이터 수정
			System.out.println("---------전화번호 수정---------");
			manager.update();
			System.out.println();
			break;
		case "5":
			//데이터 삭제
			System.out.println("---------전화번호 삭제---------");
			manager.delete();
			System.out.println();
			break;
		case "6":
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
