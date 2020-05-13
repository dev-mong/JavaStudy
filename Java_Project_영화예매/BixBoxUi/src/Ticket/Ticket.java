package Ticket;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import TimeTable.Seat;
import TimeTable.TimeTable;

public class Ticket {
	Calendar date = Calendar.getInstance();
	String today;
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy. MM. dd. a HH:mm");
	private String ticketNo;
	private TimeTable reservedTable;
	private Seat seat;
	
	public Ticket(String ticketNo, TimeTable tTable,
					   Seat seat) {
		
		today = dateFormat.format(date.getTime());
		this.ticketNo = ticketNo;
		this.reservedTable = tTable;
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
		return reservedTable;
	}


	public void showTicket() {
		System.out.println("예매시간 : "+today);
		System.out.println("티켓번호 : "+ticketNo);
		System.out.print("상영시간 : "+reservedTable.getDtf().format(reservedTable.getStartTime()));
		System.out.println("~"+reservedTable.getDtf().format(reservedTable.getEndTime()));
		System.out.println("영화제목 : "+reservedTable.getMovie().getTitle());
		System.out.println("상 영 관 : "+reservedTable.getScreen().getName());
		System.out.println(seat);
	}
	
	public int showPrice() {
		return reservedTable.getScreen().getPrice();
	}

}