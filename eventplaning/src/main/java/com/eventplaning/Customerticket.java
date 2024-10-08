package com.eventplaning;

public class Customerticket {
	private int idticket;
	private String bookingid;
	private String eventname;
	private String tickettype;
	private int numtickets;
	private int ticketprice;
	
	
	public Customerticket(int idticket, String bookingid, String eventname, String tickettype, int numtickets,
			int ticketprice) {
		
		this.idticket = idticket;
		this.bookingid = bookingid;
		this.eventname = eventname;
		this.tickettype = tickettype;
		this.numtickets = numtickets;
		this.ticketprice = ticketprice;
	}


	public int getIdticket() {
		return idticket;
	}

	public String getBookingid() {
		return bookingid;
	}

	public String getEventname() {
		return eventname;
	}


	public String getTickettype() {
		return tickettype;
	}


	public int getNumtickets() {
		return numtickets;
	}

	public int getTicketprice() {
		return ticketprice;
	}


	
	
	
	
	

}
