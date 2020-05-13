package ver07;


//동호회 전화번호부
public class PhoneBookClubInfor extends PhoneBookDataAbstract{

	String clubName;
	
	PhoneBookClubInfor(String name,String phoneNumber,String clubName) {
		super(name,phoneNumber);
		this.clubName=clubName;
	}
	
	public void showData() {
		super.showData();
		System.out.println("동호회 이름: "+this.clubName);
	}
	
}
