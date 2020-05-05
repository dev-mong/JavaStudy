package Movie;

public class MovieMain {

	public static void main(String[] args) {
		
//		MovieManager m = MovieManager.getInstance();
//		MovieManager2 m = MovieManager2.getInstance();
		MovieManager3 m = MovieManager3.getInstance();
		
		
		while(true) {
			
		//메뉴 출력	
		BitBoxMenu.MovieMenu();
		
		//메뉴 선택 
		int num = m.ip.nextInt();
		m.ip.nextLine();
			
		
		switch (num) {
		case 1: //영화 전체 출력
			System.out.println("\n<< 영화 정보 전체 출력 >>");
			m.showAll();
			break;
		case 2: //영화 추가
			System.out.println("\n<< 영화 정보 추가  >>");
			m.addMovie();
			break;
		case 3: //영화 수정
			System.out.println("\n<< 영화 정보 수정  >>");
			m.editMovie();
			break;
		case 4: //영화 삭제
			System.out.println("\n<< 영화 정보 삭제  >>");
			m.delMovie();
			break;
		case 5: //홈으로 이동 
			System.exit(0);
		}
		
		}//while
	}//main
}//class
