package TimeTable;

import TimeTable.TimeTableManager;
import Main_Menu.TimeTableMenuNum;
import TimeTable.TimeTable;

public class TimeTableMenu {
	
	public void showTimeTableMenu() {
		
		TimeTableManager ttm= TimeTableManager.getInstatnce();
		int selectOpt;
		
		while(true) {
			
			System.out.println("시간표 입력 페이지 입니다.");
			System.out.println("메뉴 선택");
			System.out.println(TimeTableMenuNum.INPUT_NUM+".시간표 등록 | "
					+ TimeTableMenuNum.EDIT_NUM+".시간표 수정 | "
									+ TimeTableMenuNum.SHOW_ALLTIME+". 시간표 전체 출력 | "
									+ TimeTableMenuNum.EXIT+".상영 시간 입력 종료");
			
			selectOpt=ttm.ip.nextInt();
			ttm.ip.nextLine();
			
			switch(selectOpt) {
			
			//시간 입력
			case TimeTableMenuNum.INPUT_NUM:
				ttm.addInst(ttm.createTimeInst());
				break;
			//입력된 수정
			case TimeTableMenuNum.EDIT_NUM:
				ttm.edit();
				break;
			//입력된 시간 전체 출력
			case TimeTableMenuNum.SHOW_ALLTIME:
				for(int i =0; i<ttm.getTable().size();i++) {
					ttm.getTable().get(i).showTimeTable();
				}
				break;
			case TimeTableMenuNum.EXIT:
				System.out.println("상영 시간 입력을 종료합니다.");
				return;
				
			}	

}
	}
	
	
}
