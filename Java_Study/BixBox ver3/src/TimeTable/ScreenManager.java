package TimeTable;

import java.util.ArrayList;
import java.util.Scanner;

public class ScreenManager {
	
	private static ScreenManager sManager = new ScreenManager();
	public static ScreenManager getInstance() {
		return sManager;
	}
	
	Scanner sc;
	Screen screenInfo;
	ArrayList<Screen> screenList;
	int searchIndex;
	int rowNum;
	int seatNum;

	
	
	private ScreenManager() {
		screenList= new ArrayList<>();
		sc = new Scanner(System.in);
		screenList.add(new Screen("1관", 5, 5, 10000));
		screenList.add(new Screen("2관", 5, 7, 10000));
		screenList.add(new Screen("3관", 6, 7, 10000));
	}
	
	//상영관 정보 입력 받고 인스턴스화
	public Screen createScreenInfo() {
		
		screenInfo=null;
		
		System.out.println("===상영관 정보 입력페이지===");
		System.out.println("상영관 이름을 입력하세요 : ");
		String name=sc.nextLine();
		System.out.println("좌석 행 숫자를 입력하세요 : ");
		int rowNum = sc.nextInt();
		sc.nextLine();
		System.out.println("좌석 열 숫자를 입력하세요 : ");
		int seatNum = sc.nextInt();
		sc.nextLine();
		System.out.println("상영 영화의 가격을 입력하세요 : ");
		int price=sc.nextInt();
		sc.nextLine();
		
		screenInfo=new Screen(name, rowNum, seatNum, price);
		System.out.println("▶영화 좌석 배치도를 출력합니다.");
		screenInfo.seatMap();
		
		return screenInfo;
	}
	
	//인스턴스 리스트에 저장함
	public void addInstance(Screen screenInfo){
		screenList.add(screenInfo);
	}
	
	//리스트에서 찾는 인덱스 찾기
	public int searchIndexNum(String name) {
		
		searchIndex=-1;
		
		for(int i=0;i<screenList.size();i++) {
			if(screenList.get(i).checkScreenName(name)) {
				searchIndex=i;
				break;
			}
		}
		return searchIndex;
	}
	
	//상영관 정보 삭제
	public void deleteScreenInfo() {
		System.out.println("삭제하실 상영관 이름을 입력하세요 : ");
		String name=sc.nextLine();
		
		searchIndex=searchIndexNum(name);
		
		if(searchIndex<0) {
			System.out.println("삭제하실 상영관이 없습니다.");
		}else {
			//remove메서드 사용해서 검색된 searchIndex번째 요소 삭제
			screenList.remove(searchIndex);
			System.out.println("♠♠♠삭제되었습니다.♠♠♠");
			
		}
	}
	// 상영관 수정
	public void editScreenInfo() {
		System.out.println("수정하실 상영관 이름을 입력하세요 : ");
		String name=sc.nextLine();
		int searchIndex=searchIndexNum(name);

		if(searchIndex<0) {
			System.out.println("입력하신 상영관을 찾을 수 없습니다.");
		}else {
			//get메서드 활용, searchIndex번째에 담긴 참조변수로 getName메서드 호출해서 name받아오기
			String editName = screenList.get(searchIndex).getName();
			
			
			System.out.println("정보 수정을 시작합니다.");
			System.out.println("정보를 수정할 상영관 : "+editName);
			System.out.println("수정할 행의 수를 입력하세요.");
			int rowNum=sc.nextInt();
			sc.nextLine();
			System.out.println("수정할 열의 수를 입력하세요.");
			int seatNum=sc.nextInt();
			sc.nextLine();
			System.out.println("수정할 영화표 금액을 입력하세요.");
			int price=sc.nextInt();
			sc.nextLine();
			
			screenInfo=new Screen(editName, rowNum, seatNum, price);
			System.out.println("▶수정된 영화 좌석 배치도를 출력합니다.");
			screenInfo.seatMap();
	}
			screenList.remove(searchIndex);
			screenList.add(searchIndex, screenInfo);
	}	
	

	
	//전체 정보 보기
	public void showAllScreenInfo() {
		for(int i=0;i<screenList.size();i++) {
			screenList.get(i).showScreenInfo();
			System.out.println("--------------------------");
		}
	}
	
}
