package ver05;


//대학교 전화번호부
public class PhoneUnivlnfor extends PhoneBookDataAbstract{

	String address; //주소 , 필수 사항 아님
	String email; // 이메일, 필수 사항 아님
	String major; // 전공
	String year; // 학년
	
	
	PhoneUnivlnfor(String name,String phoneNumber,String address,String email,String major,String year){
		super(name,phoneNumber);
		this.address=address;
		this.email=email;
		this.major=major;
		this.year=year;	
	}
			
	public void showData() {
		super.showData();
		System.out.println("주소: "+this.address);
		System.out.println("이메일: "+this.email);
		System.out.println("전공: "+this.major);
		System.out.println("학년 : "+this.year);
	}
	
	
}
