package TimeTable;

import java.util.ArrayList;
import java.util.Scanner;

public class TimeList {

	public static void main(String[] args) {
	
		ScreenManager sManager=ScreenManager.getInstance();	
		
		int selectS;
		Scanner s=new Scanner(System.in);
		
		ArrayList<Integer> timeList=new ArrayList<>();
		
		//시간 입력
		timeList.add(9);
		timeList.add(12);
		timeList.add(13);
		
		while(true) {
		
		System.out.println("<<상영관 목록>>");
		for (int i=0; i<sManager.screenList.size();i++) {
			System.out.println(i+1+")");
			System.out.println(sManager.screenList.get(i).getName());
			System.out.println("-----------");
		}
		
		System.out.println("영화를 상영할 상영관 입력");
		selectS = s.nextInt();
		s.nextLine();
		
		for(int i=0;i<sManager.screenList.size();i++) {
			if(selectS-1 == i) {
		System.out.println("선택된 상영관: "+sManager.screenList.get(i).getName());
			}
			}
	
//		
//		for(int i=0;i<timeList.size();i++) {
//			System.out.println(timeList.get(i)+"시"+"\t");
//		}
		
//		int index=0;
//		while(index<5) {
//			System.out.println("상영 시간 입력:");
//			int time=s.nextInt();
//			s.nextLine();
//			time=time%12;
//			timeList.add(time);
//			index++;
//		}
		
//		System.out.println("상영 시간을 입력하세요.");
		
		//시간 출력 
		for(int i=0;i<timeList.size();i++) {
			System.out.println(timeList.get(i)+"시"+"\t");
		}
		
		System.out.println("상영 시간을 입력하세요.");
		int timeSelect=s.nextInt();
		s.nextLine();
		
		System.out.println("선택 한 시간은 "+timeSelect+"시 입니다.");
		
		
		for(int i=0;i<timeList.size();i++) {
			if(timeList.get(i)==timeSelect) {
				System.out.println("이미 상영 중인 영화가 있습니다.");
			}
		}
		
		ArrayList<Integer> a=new ArrayList<>();
		a.add(timeSelect);
		
//		for(int i=0;i<timeList.size();i++) {
//			if(timeList.get(i)==timeSelect) {
//				System.out.println("선택 한 시간에 상영중인 영화가 있습니다.");
//				continue;
//			}
//		}
		
		}
	}
	
}
