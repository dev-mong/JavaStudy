package Movie;

public class BitBoxMenu {

	public static void MovieMenu(){
		System.out.println("<< 영 화 관 리 >>");
		System.out.println(MenuIf.SHOWALL+". 영화 전체 출력");
		System.out.println(MenuIf.ADD+". 영화 추가");
		System.out.println(MenuIf.EDIT+". 영화 수정");
		System.out.println(MenuIf.DEL+". 영화 삭제");
		System.out.println(MenuIf.MENUHOME+". 홈으로 돌아가기 ");
	}
	
	public static void MenuEdit() {
		System.out.println("---수정 할 메뉴를 선택하세요---");
		System.out.println(MenuIf.EDITMnue1+". 영화 제목");
		System.out.println(MenuIf.EDITMnue2+". 영화 감독");
		System.out.println(MenuIf.EDITMnue3+". 영화 런타임");
		System.out.println("4. 돌아가기");
	}
	
		
}
