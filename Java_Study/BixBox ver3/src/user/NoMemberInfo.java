package user;

import Ticket.Ticket;

public class NoMemberInfo extends Info{

	private String phoneNum;
	private Ticket ticket;
	private int myMoney;
	
	public NoMemberInfo(String phoneNum) {
		myMoney=20000;
		this.phoneNum=phoneNum;
	}
	
	
	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public Ticket getTicket() {
		return ticket;
	}

	

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}


	public int getMyMoney() {
		return myMoney;
	}


	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}
	
	
	public void showTicket() {
		ticket.showTicket();
	}

	public void showResevInfo() {
		System.out.println("전화번호 : "+phoneNum);
		this.showTicket();
	}
	
	
}
