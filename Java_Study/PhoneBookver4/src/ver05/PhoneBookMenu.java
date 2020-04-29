package ver05;

public class PhoneBookMenu {
	
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
	 public static void menuPrintCreate() {
		 System.out.println("<<<<메뉴를 선택하세요>>>>>");
		System.out.println(MenuInterface.FRIEND+" 친구 전화번호 저장");
		System.out.println(MenuInterface.UNIV+" 대학 친구 저장");
		System.out.println(MenuInterface.COMPANY+" 고교 친구 저장");
		System.out.println(MenuInterface.CLUB+" 동호회 저장");
	 }


}//class
