package ver05;


public class PhoneFriendInfor extends PhoneBookDataAbstract{

	String name; //이름
	String phoneNumber; //전화번호
	String birthday; // 생일 
	
	//생성자, 값을 초기화
	public PhoneFriendInfor(String name,String phoneNumber,String birthday){
		super(name,phoneNumber);
		this.birthday=birthday;
	}
	
	//생년월일 입력 안했을 때 초기화 
	public PhoneFriendInfor(String name,String phoneNumber){
		this(name,phoneNumber,"입력값이 없습니다.");
	}
	
	//데이터 출력 
	public void showData() {
		super.showData();
		System.out.println("생년월일: "+this.birthday);
	}
	
}
