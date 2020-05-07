package TimeTable;

public class TimeTableMenu {
	
	public static void main(String arg[]) {
//	public void showTimeTableMenu() {
		
		TimeTableManager ttm= new TimeTableManager();
		
		
		while(true) {
			
			System.out.println("\n시간표 입력 페이지 입니다.");
			ttm.add();
		
		}
	}

}
