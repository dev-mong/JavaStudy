package TimeTable;

/*
 *20.05.05 가격추가  
 *
 */
import java.util.LinkedList;
import java.util.Scanner;

import Movie.MovieManager;

public class TimeTableManager {
	
	private LinkedList<TimeTable> table;
	private int pos;
	Scanner ip = new Scanner(System.in);
	MovieManager mManager= MovieManager.getInstance();
	ScreenManager sManager = ScreenManager.getInstance();
	int searchIndex;
	
	public TimeTableManager() {
		table = new LinkedList<>();
		table.add(new TimeTable(mManager.getMovieList().get(0), sManager.screenList.get(0), 9));
		table.add(new TimeTable(mManager.getMovieList().get(1), sManager.screenList.get(0), 12));
		table.add(new TimeTable(mManager.getMovieList().get(2), sManager.screenList.get(0), 15));
		
		table.add(new TimeTable(mManager.getMovieList().get(0), sManager.screenList.get(1), 10));
		table.add(new TimeTable(mManager.getMovieList().get(1), sManager.screenList.get(1), 13));
		table.add(new TimeTable(mManager.getMovieList().get(2), sManager.screenList.get(1), 16));
		
		table.add(new TimeTable(mManager.getMovieList().get(0), sManager.screenList.get(2), 12));
		table.add(new TimeTable(mManager.getMovieList().get(1), sManager.screenList.get(2), 9));
		table.add(new TimeTable(mManager.getMovieList().get(2), sManager.screenList.get(2), 17));
		
	}
	
	
	//시간 추가 
	void add() {
		
		int selectM;
		int selectS;
		System.out.println("<<영화 목록>>");
		for(int i=0; i< mManager.getMovieList().size();i++) {
			System.out.println(i+1+")");
			System.out.println(mManager.getMovieList().get(i).getTitle());
			System.out.println("-----------");
		}
		
		System.out.println("시간 표에 입력하실 영화의 번호를 입력:");
		selectM = ip.nextInt();
		ip.nextLine();
		
		System.out.println("<<상영관 목록>>");
		for (int i=0; i<sManager.screenList.size();i++) {
			System.out.println(i+1+")");
			System.out.println(sManager.screenList.get(i).getName());
			System.out.println("-----------");
		}
		System.out.println("영화를 상영할 상영관 입력");
		selectS = ip.nextInt();
		ip.nextLine();
		
		System.out.println("시간 입력 :");
		int h= ip.nextInt();
		ip.nextLine();
//		System.out.println("분 입력 :");
//		String min = ip.nextLine();
		
//		String t1 = h+"시 "+min+"분";
		
		
		for(int i=0;i<table.size();i++) {
	         if(h == table.get(i).getTime()){
	            if(table.get(i).getScreen().getName().equals(sManager.screenList.get(selectS).getName())) {
	               System.out.println("입력하신 시간에 이미 스케쥴이 있습니다");
	            }
	         }
	      }
		
		
		table.add(new TimeTable(mManager.getMovieList().get(selectM), sManager.screenList.get(selectS), h));
//		for(int i=0;i<table.size();i++) {
			table.get(table.size()-1).showTimeTable();
//		}
		
	}
	
	
	
	
public int searchIndexNum(String movie) {
		
		searchIndex = -1;
		
		for(int i=0;i<table.size();i++) {
			if(table.get(i).checkTimeTable(movie)) {
				searchIndex=i;
				break;
			}
		}
		return searchIndex;
	}
	
	
	
	
//	
//	void edittime(TimeTable tt) {
//		
//		
//		tt.showTimeTable();
//		System.out.println("시간을 변경하실 영화를 선택하세요");
//		String movie = ip.nextLine();
//		
//		searchIndex = searchIndexNum(movie);
//		
//		
//		System.out.println("변경할 시간을 입력하세요");
//		
//		System.out.println("시간 입력 :");
//		String h= ip.nextLine();
////		System.out.println("분 입력 :");
////		String min = ip.nextLine();
//		
////		String t1 =  h+"시"+min+"분";
//		
//		
//		
//		table.setTime(searchIndex, tt.setTime(h));
//		
//		table.remove(searchIndex);
//		table.add(new TimeTable(movie, screen, time));
//			
//	}

	public LinkedList<TimeTable> getTable() {
		return table;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}
	
	
	
	
	
}
