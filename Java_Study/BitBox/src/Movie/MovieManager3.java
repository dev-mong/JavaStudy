package Movie;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MovieManager3 {
	//싱글톤 - 메서드사용해서 참조변수
	private static MovieManager3 mManager = new MovieManager3();
	public static MovieManager3 getInstance() {
		return mManager;
	}
	
	ArrayList<Movie> movieList;
	Scanner ip = new Scanner(System.in);
	String title;
	String director;
	int runtime;
	
	
	MovieManager3(){
		movieList = new ArrayList<>();
		movieList.add(new Movie("어벤져스", "감독1",180));
		movieList.add(new Movie("스파이더맨","감독2",160));
		movieList.add(new Movie("너의이름은","감독3",120));

	}
	
	//영화 정보 전체 출력
	void showAll() {
		for(int i=0;i<movieList.size();i++) {
			System.out.println("영화 제목: "+movieList.get(i).getTitle());
			System.out.println("영화 감독: "+movieList.get(i).getDirector());
			System.out.println("영화 런타임: "+movieList.get(i).getRuntime());
			System.out.println("-------------------");
		} 
		System.out.println();
	}
	
	void showMovie() {
		for(int i=0;i<movieList.size();i++) {
			System.out.println("영화 제목: "+movieList.get(i).getTitle());
			System.out.println("영화 감독: "+movieList.get(i).getDirector());
			System.out.println("영화 런타임: "+movieList.get(i).getRuntime());
			System.out.println("-------------------");
		} 
	}
	
	int index;
	
	//영화 정보가 없을 때 예외 처리
	String checkSelect(String title) {
		return title;
	}
	
	
	//입력 값 예외 처리 
	String checkInput(String check) {
		while(true) {
		try { 
			if(check.trim().isEmpty()) { //입력값이 공백일 때 예외 발생 
				InputException e=new InputException();
				throw e;
			} 
		}catch(InputException e) {
			e.print();
			check=ip.nextLine();
			continue;
		}
		return check;
		}
	}
	
	
	//영화 추가 
	void addMovie() {
		
		System.out.println("영화 제목 입력 : ");
		title = ip.nextLine();
		title=checkInput(title);
		System.out.println("영화 감독 입력 : ");
		director = ip.nextLine();
		director=checkInput(director);
		System.out.println("영화 런타임 입력 : ");
		String runtimeStr=ip.nextLine();
		runtimeStr =checkInput(runtimeStr);
		runtime=Integer.parseInt(runtimeStr);

		movieList.add(new Movie(title, director, runtime));	
		System.out.println("---신작영화가 등록되었습니다--- \n");
	}
	
	//영화 수정
	void editMovie() {
		
		System.out.println("\n---수정 할 영화 제목을 입력하세요---");
		title=ip.nextLine();
		title=checkInput(title); //공백 예외 처리 
//		title=checkSelect(title); //입력한 영화 제목이 없을 때 예외 처리 
		
		while(true) {
			try {
				for(int i=0;i<movieList.size();i++)
				if(!(movieList.get(i).getTitle().equals(title)))
				{
					InputException e=new InputException();
					throw e;
				}
			}catch(InputException e) {
				e.eidtPrint();
				title=ip.nextLine();
				continue;
			}
			break;
		}
		
		for(int i=0;i<movieList.size();i++) {
		if(movieList.get(i).getTitle().equals(title)) {
			
			while(true) {	
				
			BitBoxMenu.MenuEdit();
			
			int editMenu;
			try{
				editMenu = ip.nextInt();
				if(!(MenuIf.EDITMnue1<=editMenu&&editMenu<=MenuIf.EDITMnue3)) {
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
				ip.nextLine();
			}
			
			
			
			switch (editMenu) {
			//영화 제목 수정
			case MenuIf.EDITMnue1: 
				System.out.println("영화 제목 입력: ");
				String editTitle=ip.nextLine();
				editTitle=checkInput(editTitle); //예외 처리 
				movieList.get(i).setTitle(editTitle);
				System.out.println("------------------");
				System.out.println("\""+title+"\""+"\""+editTitle+"\""+"로 수정되었습니다. \n");
				break;
				
			 //영화 감톡 수정	
			case MenuIf.EDITMnue2:
				System.out.println("영화 감독 입력: ");
				String editDirector=ip.nextLine();
				editDirector=checkInput(editDirector); //예외 처리 
				movieList.get(i).setDirector(editDirector);
				System.out.println("------------------");
				System.out.println("\""+director+"\""+"\""+editDirector+"\""+"로 수정되었습니다. \n");
				break;
			
			//영화 런타임 수정
			case MenuIf.EDITMnue3: 
				System.out.println("영화  런타임 입력: ");
				String editRuntimeStr=ip.nextLine();
				editRuntimeStr=checkInput(editRuntimeStr);
				int editRuntime=Integer.parseInt(editRuntimeStr);
				movieList.get(i).setRuntime(editRuntime);
				System.out.println("------------------");
				System.out.println("\""+runtime+"\""+"\""+editRuntimeStr+"\""+"로 수정되었습니다. \n");
				break;
			case 4:
				System.out.println();
				return;
				
			} //switch - 영화 정보 수정 
			} //while - 영화 수정 사항 반복
			} //if - 영화 제목 일치 시
		
		}		
		
	}
	
	//영화 삭제
	void delMovie() {
		System.out.println("---삭제 할 영화 이름을 입력하세요---");
		title=ip.nextLine();
		
		for(int i=0;i<movieList.size();i++) {
			if(movieList.get(i).getTitle().equals(title)) {
				movieList.remove(i);
				System.out.println("\""+title+"\""+"삭제되었습니다. \n");
			}
		}
	}
	
	

}