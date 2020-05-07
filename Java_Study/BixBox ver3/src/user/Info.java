package user;

import Ticket.Ticket;

public class Info {
	
	Ticket ticket;
	private int myMoney;
	
	public int getMyMoney() {
		return myMoney;
	}
	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
}
