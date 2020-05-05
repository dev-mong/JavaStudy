package Movie;

import java.util.ArrayList;
import java.util.Scanner;


public class MovieManager {
	//싱글톤 - 메서드사용해서 참조변수
	private static MovieManager mManager = new MovieManager();
	public static MovieManager getInstance() {
		return mManager;
	}
	
	ArrayList<Movie> movieList;
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
	void showAll() {
		System.out.println("\n<< 영화 정보 전체 출력 >>");
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
		
		System.out.println("\n<< 영화 정보 추가  >>");
		System.out.println("영화 제목 입력 : ");
		title = ip.nextLine();
		title=checkInput(title);
		System.out.println("영화 감독 입력 : ");
		director = ip.nextLine();
		director=checkInput(director);
		System.out.println("영화 런타임 입력 : ");

		
		//runtime = ip.nextLie();
		String runtimeStr=ip.nextLine();
		runtimeStr =checkInput(runtimeStr);
		runtime=Integer.parseInt(runtimeStr);

		movieList.add(new Movie(title, director, runtime));	
		System.out.println("---신작영화가 등록되었습니다--- \n");
	}
	
	
	//영화 수정
	void editMovie() {
		
		System.out.println("\n<< 영화 정보 수정  >>");
		System.out.println("----수정 할 영화 이름을 입력하세요---");
		title=ip.nextLine();
		
		for(int i=0;i<movieList.size();i++) {
	
			if(movieList.get(i).getTitle().equals(title)) {
			System.out.println("\""+title+"\""+"선택되었습니다. \n");
			
			//영화 제목 수정
			System.out.println("영화 제목 입력: ");
			String editTitle=ip.nextLine();
			editTitle=checkInput(editTitle); //예외 처리 
			movieList.get(i).setTitle(editTitle);
			System.out.println("----------------------------------");
			System.out.println("\""+title+"\""+"\""+editTitle+"\""+"로 수정되었습니다. \n");
			
			
			//영화 감독 수정
			System.out.println("영화 감독 입력: ");
			String editDirector=ip.nextLine();
			editDirector=checkInput(editDirector); //예외 처리 
			movieList.get(i).setDirector(editDirector);
			System.out.println("----------------------------------");
			System.out.println("\""+director+"\""+"\""+editDirector+"\""+"로 수정되었습니다. \n");
			
			
			//영화 런타임 수정
			System.out.println("영화  런타임 입력: ");
//			int editRuntime=ip.nextInt();
//			ip.nextLine();
			String editRuntimeStr=ip.nextLine();
			editRuntimeStr=checkInput(editRuntimeStr);
			int editRuntime=Integer.parseInt(editRuntimeStr);
			movieList.get(i).setRuntime(editRuntime);
			System.out.println("----------------------------------");
			System.out.println("\""+runtime+"\""+"\""+editRuntimeStr+"\""+"로 수정되었습니다. \n");
			
			}//if
		}
		
	}
	
	//영화 삭제
	void delMovie() {
		System.out.println("\n<< 영화 정보 삭제  >>");
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