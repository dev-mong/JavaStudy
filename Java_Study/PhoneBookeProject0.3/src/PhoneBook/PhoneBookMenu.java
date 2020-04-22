package PhoneBook;

import java.util.Scanner;

public class PhoneBookMenu {
	
//	Scanner sc;
	PhoneBookManager manager = new PhoneBookManager();
	
	public PhoneBookMenu(){
//		sc=new Scanner(System.in);
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
			int menuNum=manager.sc.nextInt();
			manager.sc.nextLine();
			
		switch(menuNum) {
		case 1:			
			System.out.println("---------전화번호 저장-------");
			//데이터 저장
			manager.insertData();
			System.out.println();
			break;
			
		case 2:
			//데이터 전체 출력
			System.out.println("---------전화번호 전체 출력-------");
			if(manager.phoneData == null) {
				System.out.println("!!!!!!!!!!데이터가 없습니다!!!!!!!");
			}
			manager.showAllData();
			System.out.println();
			break;
			
		case 3:
			//데이터 검색
			System.out.println("---------전화번호 검색---------");
			manager.selectData();
			System.out.println();
			break;
			
		case 4:
			//데이터 수정
			System.out.println("---------전화번호 수정---------");
			manager.update();
			System.out.println();
			break;
		case 5:
			//데이터 삭제
			System.out.println("---------전화번호 삭제---------");
			manager.delete();
			System.out.println();
			break;
		case 6:
			System.exit(0);
			break;
		
		}
		
		}//while
	}//menu

}//class
