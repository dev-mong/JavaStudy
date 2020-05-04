package ver06;

public class PhoneBookMain {
	
	public static void main(String[] args) {
		
		PhoneBookManager manager=PhoneBookManager.getInstance();
		
		
			int menuNum=0;
			while(true) {	
				PhoneBookMenu.menuPrint();
				
				//메뉴 선택 예외 처리 - 문자 입력시 오류, 숫자 범위 초과 입력
				try {
					menuNum=Integer.parseInt(manager.sc.nextLine().trim());
					if(!(menuNum>=MenuInterface.INSERT&&menuNum<=MenuInterface.EXIT)) {
						MenuNumberException e=new MenuNumberException();
						throw e;
					}
				} catch(NumberFormatException e) {
					System.out.println("숫자를 입력하세요.\n");
					continue;
				} catch(MenuNumberException e) { //숫자 범위 초과
					System.out.println("번호를 잘못 입력했습니다. 다시 입력해주세요\n");
				} 
				
			switch(menuNum) {
			
			//인스턴스 생성 
			case MenuInterface.INSERT:			
				manager.instance();
				break;
			//데이터 전체 출력
			case MenuInterface.ALLSHOW:
				System.out.println("---------전화번호 전체 출력-------");		
				manager.showAllData();
				System.out.println();
				break;
			//데이터 검색	
			case MenuInterface.SELET:
				System.out.println("---------전화번호 검색---------");
				manager.selectData();
				System.out.println();
				break;
			//데이터 수정	
			case MenuInterface.UPDATE:
				System.out.println("---------전화번호 수정---------");
				manager.update();
				System.out.println();
				break;
			//데이터 삭제
			case MenuInterface.DELETE:
				System.out.println("---------전화번호 삭제---------");
				manager.delete();
				System.out.println();
				break;
			case MenuInterface.EXIT: 
				System.exit(0);
				break;
		
			}
			
		}//while
	}

}
