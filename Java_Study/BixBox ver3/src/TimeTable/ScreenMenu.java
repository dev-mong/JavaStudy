package TimeTable;

public class ScreenMenu {

	
	public void showScreenMenu() {
		
		int selectOpt;
		ScreenManager sManager = ScreenManager.getInstance();
		
		while(true) {
			
			System.out.println("상영관 입력 페이지 입니다.");
			System.out.println("메뉴 선택");
			System.out.println("1.상영관 정보 등록 | 2. 상영관 삭제 | 3. 상영관 수정"
					+ " | 4. 모든 정보 보기 | 5. 상영관 입력 종료");
			selectOpt=sManager.sc.nextInt();
			sManager.sc.nextLine();
		
			
			switch(selectOpt) {
			case 1:
				sManager.addInstance(sManager.createScreenInfo());
				break;
			case 2:
				sManager.deleteScreenInfo();
				break;
			case 3:
				sManager.editScreenInfo();
				break;
			case 4:
				sManager.showAllScreenInfo();
				break;
			case 5:
				System.out.println("상영관 입력을 종료합니다.");
				return;
			}
		
		}
		
	}
}
	
