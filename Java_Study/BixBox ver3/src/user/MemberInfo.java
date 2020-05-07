package user;

import Ticket.Ticket;

public class MemberInfo extends Info{
	
	// 아이디, 비밀번호
	// 이름, 전화번호, 이메일
	// 보유금액, 포인트

	private String id;
	private String pw;
	private String name;
	private String phoneNum;
	private String email;
	private int myMoney;

	Ticket ticket;
	
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	MemberInfo(String id, String pw, String name, String phoneNum, String email) {
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.phoneNum=phoneNum;
		this.email=email;
		this.myMoney=10000;
		this.ticket = null;
	}
	
	MemberInfo(){}
	
	//결제해서 잔액 남기기
	public void payment() {
		this.myMoney = myMoney-ticket.showPrice();
	}

	//티켓보기(예매내역확인)
	public void showTicket() {
		ticket.showTicket();
	}

	public void showBasicInfo() {
		System.out.println("아이디 : "+this.id);
		System.out.println("이름 : "+this.name);
		System.out.println("전화번호 : "+this.phoneNum);
		System.out.println("이메일 : "+this.email);
	}
	
	public void showMoney() {
		System.out.println("나의 보유 금액 : "+this.myMoney);
	}
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public int getMyMoney() {
		return myMoney;
	}


	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}

}
