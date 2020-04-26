package PhoneBook;

public class PhoneBookData {
	
	String name;
	String phoneNumber;
	String birthday;

	public PhoneBookData(String phoneNumber)
	{
		this.phoneNumber=phoneNumber;
	}
	//생성자, 값을 초기화
	public PhoneBookData(String name,String phoneNumber,String birthday){
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birthday=birthday;
	}
	
	//생년월일 입력 안했을 때 초기화 
	public PhoneBookData(String name,String phoneNumber){
		this(name,phoneNumber,"입력값이 없습니다.");
	}
	
	//데이터 출력 
	void showData() {
		
		if(this.name==null&&this.phoneNumber==null&&this.birthday==null) {
			System.out.println("데이터가 존재하지 않습니다.");
		} else {
			System.out.println("이름: "+this.name);
			System.out.println("전화번호: "+this.phoneNumber);
			System.out.println("생년월일: "+this.birthday);
			
		}
	}
	

	//입력한 이름 값 확인
	boolean name(String nameInput) {
	
		return this.name.equals(nameInput);
	}
	


}
