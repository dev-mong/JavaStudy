package ver04;

//직장 전화번호부
public class PhoneCompanyInfor extends PhoneBookData {
	
	String email; //이메일 - 필수 아님
	String company; //회사 
	
	PhoneCompanyInfor(String name,String phoneNumber,String email,String company){
		super(name,phoneNumber);
		this.email=email;
		this.company=company;
	}
	PhoneCompanyInfor(String name,String phoneNumber,String company){
		this(name,phoneNumber,"입력값이 없습니다.",company);
	}
	
	void showData() {
		super.showData();
		System.out.println("이메일: "+this.email);
		System.out.println("회사: "+this.company);
	}

	
	
	
}
