package ver05;

public abstract class PhoneBookDataAbstract implements PhoneBookInterface{

	
	String name;
	String phoneNumber;

	
	PhoneBookDataAbstract(String name,String phoneNumber){
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	
	
	public void showData() {
		if(this.name==null&&this.phoneNumber==null) {
			System.out.println("데이터가 존재하지 않습니다.");
		} else {
			System.out.println("이름: "+this.name);
			System.out.println("전화번호: "+this.phoneNumber);
		}
	}
	boolean name(String nameInput) {
		return this.name.equals(nameInput);
	}
	
}
