package ver04;


//기본정보 데이터 저장 클래스 
public class PhoneBookData {
	
	
	String name; //이름
	String phoneNumber; //전화번호
	
	//생년월일 입력 안했을 때 초기화 
	public PhoneBookData(String name,String phoneNumber){
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	
	void showData() {
		
		if(this.name==null&&this.phoneNumber==null) {
			System.out.println("데이터가 존재하지 않습니다.");
		} else {
			System.out.println("이름: "+this.name);
			System.out.println("전화번호: "+this.phoneNumber);
		}
	}

	//입력한 이름 값 확인
	boolean name(String nameInput) {
	
		return this.name.equals(nameInput);
	}
	


}
