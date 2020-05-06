package Movie;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MovieManager {
	//싱글톤 - 메서드사용해서 참조변수
	private static MovieManager mManager = new MovieManager();
	public static MovieManager getInstance() {
		return mManager;
	}
	
	ArrayList<Movie> movieList;
	public ArrayList<Movie> getMovieList() {
		return movieList;
	}

	Scanner ip = new Scanner(System.in);
	String title;
	String director;
	int runtime;
	
	MovieManager(){
		movieList = new ArrayList<>();
		movieList.add(new Movie("어벤져스", "감독1",180));
		movieList.add(new Movie("스파이더맨","감독2",160));
		movieList.add(new Movie("너의이름은","감독3",120));

	}
	
	//영화 정보 전체 출력
	void showAllMovie() {
		for(int i=0;i<movieList.size();i++) {
			System.out.println("영화 제목: "+movieList.get(i).getTitle());
			System.out.println("영화 감독: "+movieList.get(i).getDirector());
			System.out.println("영화 런타임: "+movieList.get(i).getRuntime());
			System.out.println("-------------------");
		} 
		System.out.println();
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
		} catch(NumberFormatException e) {
			System.out.println("잘못된 메뉴 선택입니다. 다시 입력해주세요. \n");
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
	
	int index;
	int checkName(String title) {
		index=-1;
		for(int i=0;i<movieList.size();i++) {
			if(movieList.get(i).getTitle().equals(title)) {
				System.out.println("-----------------------");
				System.out.println("영화 제목  "+title+"이(가) 선택되었습니다.\n");
				index=i;
			}
		}
		return index;
	}
	
	//영화 수정
	void editMovie() {
		
		System.out.println("---수정 할 영화 제목을 입력하세요---");

		while(true) {
		title=ip.nextLine();
		title=checkInput(title); //공백 예외 처리 
		index=checkName(title);
		
		if(index<0) {
			InputException.eidtPrint();
		} 
		else {
			
		while(true) {	
				
			BitBoxMenu.MenuEdit();
			
			int editMenu;
			try{
				editMenu = Integer.parseInt(ip.nextLine().trim());
				if(!(MenuIf.EDITMENU1<=editMenu&&editMenu<=MenuIf.EDITMENU5)) {
					NumberFormatException e=new NumberFormatException();
					throw e;
				}
			}
			catch(NumberFormatException e) {
				System.out.println("잘못된 메뉴 선택입니다. 다시 입력해주세요. \n");
				continue;
			}
			
			switch (editMenu) {
			//영화 제목 수정
			case MenuIf.EDITMENU1: 
				System.out.println("영화 제목 입력: ");
				String editTitle=ip.nextLine();
				editTitle=checkInput(editTitle); //예외 처리 
				movieList.get(index).setTitle(editTitle);
				System.out.println("---------------------");
				System.out.println("\""+title+"\"의 제목은"+"\""+editTitle+"\""+"로 수정되었습니다. \n");
				break;
				
			 //영화 감톡 수정	
			case MenuIf.EDITMENU2:
				System.out.println("영화 감독 입력: ");
				String editDirector=ip.nextLine();
				editDirector=checkInput(editDirector); //예외 처리 
				movieList.get(index).setDirector(editDirector);
				System.out.println("---------------------");
				System.out.println("\""+director+"\"의 감독은"+"\""+editDirector+"\""+"로 수정되었습니다. \n");
				break;
			
			//영화 런타임 수정
			case MenuIf.EDITMENU3: 
				System.out.println("영화  런타임 입력: ");
				String editRuntimeStr=ip.nextLine();
				editRuntimeStr=checkInput(editRuntimeStr);
				int editRuntime=Integer.parseInt(editRuntimeStr);
				movieList.get(index).setRuntime(editRuntime);
				System.out.println("---------------------");
				System.out.println("\""+runtime+"\"의 런타임은"+"\""+editRuntimeStr+"\""+"로 수정되었습니다. \n");
				break;
			case MenuIf.EDITMENU4:
				System.out.println("\n======수정 내용=======");
				System.out.println("-------------------");
				movieList.get(index).showMovieInfo();
				System.out.println("-------------------\n");
				break;
			case MenuIf.EDITMENU5:
				System.out.println();
				return;
				
					} //switch - 영화 정보 수정 
				} //while - 영화 수정 사항 반복
		}//else
		
		}//while 
	
	}
	
	//영화 삭제
	void delMovie() {
		System.out.println("---삭제 할 영화 이름을 입력하세요---");
		while(true) {
			title=ip.nextLine();
			title=checkInput(title); //공백 예외 처리 
			index=checkName(title);
			if(index<0) {
				InputException.eidtPrint();
			}else {
				movieList.remove(index);
				System.out.println("-----------------------");
				System.out.println("영화  \""+title+"\""+"이(가) 삭제되었습니다. \n");
				return;
			}
		
		}
				
		
	}
	
	

}