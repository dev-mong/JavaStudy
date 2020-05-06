package Movie;

public class InputException extends Exception{

	
	void print() {
		System.out.println("필수 사항 입니다. 다시 입력하세요 ");
	}
	static void eidtPrint() {
		System.out.println("입력하신 제목의 영화 정보가 없습니다. 다시입력하세요.");
	}
}
