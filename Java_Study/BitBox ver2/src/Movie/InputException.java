package Movie;

public class InputException extends Exception{


	void menuErr() {
		System.out.println("메뉴는  1번 ~ 5번입니다. 다시입력하세요.");
	}
	
	void titleErr() {
		System.out.println("※※※※  필수사항입니다.다시 입력하세요.※※※※");
	}
	
	void print() {
		System.out.println("필수 사항 입니다. 다시 입력하세요. ");
	}
	static void eidtPrint() {
		System.out.println("입력하신 제목의 영화 정보가 없습니다. 다시입력하세요.");
	}
}
