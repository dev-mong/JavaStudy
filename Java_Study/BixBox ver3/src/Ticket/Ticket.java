package Ticket;

import TimeTable.Seat;
import TimeTable.TimeTable;

public class Ticket {
	private String ticketNo;
	private TimeTable tTable;
	private Seat seat;
	
	public Ticket(String ticketNo, TimeTable tTable,
					   Seat seat) {
		this.ticketNo = ticketNo;
		this.tTable = tTable;
		this.seat = seat;
		
	}
	

	public String getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}


	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	
	
	public TimeTable gettTable() {
		return tTable;
	}


	public void showTicket() {
		System.out.println("티켓번호 : "+ticketNo);
		System.out.println("상영시간 : "+tTable.getTime());
		System.out.println("영화제목 : "+tTable.getMovie().getTitle());
		System.out.println("상 영 관 : "+tTable.getScreen().getName());
		System.out.println(seat);
	}
	
	public int showPrice() {
		return tTable.getScreen().getPrice();
	}

}