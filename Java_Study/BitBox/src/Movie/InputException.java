package Movie;

public class InputException extends Exception {

	void print() {
		System.out.println("잘못된 입력입니다. 다시 입력하세요");
	}
	void eidtPrint() {
		System.out.print("저장 된 영화 정보가 없습니다. ");
		System.out.println("영화 제목을 다시 입력하세요.");
	}
}
