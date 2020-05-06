package Movie;

import java.util.InputMismatchException;

public class MovieMain {

	public static void main(String[] args) {
		

		MovieManager m = MovieManager.getInstance();
		
		
		int num;
		
		while(true) {
			
		//메뉴 출력	
		BitBoxMenu.MovieMenu();
		
		//메뉴 선택  예외
		try{
			num = m.ip.nextInt();
			if(!(MenuIf.SHOWALL<=num&&num<=MenuIf.MENUHOME)) {
				NumberFormatException e=new NumberFormatException();
				throw e;
			}
		}
		catch(NumberFormatException e) {
			System.out.println("잘못된 메뉴 선택입니다. 다시 입력해주세요. \n");
			continue;
		}
		catch(InputMismatchException e) {
			System.out.println("선택 할 메뉴의 숫자를 입력해주세요. \n ");
			continue;
		}
		finally {
			m.ip.nextLine();
		}
		
		//메뉴 별 기능 
		switch (num) {
		case MenuIf.SHOWALL: //영화 전체 출력
			System.out.println("\n<< 영화 정보 전체 출력 >>");
			m.showAllMovie();
			break;
		case MenuIf.ADD: //영화 추가
			System.out.println("\n<< 영화 정보 추가  >>");
			m.addMovie();
			break;
		case MenuIf.EDIT: //영화 수정
			System.out.println("\n<< 영화 정보 수정  >>");
			m.editMovie();
			break;
		case MenuIf.DEL: //영화 삭제
			System.out.println("\n<< 영화 정보 삭제  >>");
			m.delMovie();
			break;
		case MenuIf.MENUHOME: //홈으로 이동 
			System.exit(0);
		}
		
		}//while
	}//main
}//class
