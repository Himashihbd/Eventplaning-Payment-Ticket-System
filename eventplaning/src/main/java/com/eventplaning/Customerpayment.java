package com.eventplaning;

public class Customerpayment {
	private String paymenyid;
	private String bookingid;
	private String name;
	private String email;
	private String eventname;
	private float totalcost;
	
	public Customerpayment(String paymenyid, String bookingid, String name, String email, String eventname,float totalcost) {
		
		this.paymenyid = paymenyid;
		this.bookingid = bookingid;
		this.name = name;
		this.email = email;
		this.eventname = eventname;
		this.totalcost = totalcost;
	}

	public String getPaymenyid() {
		return paymenyid;
	}

	public String getBookingid() {
		return bookingid;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getEventname() {
		return eventname;
	}

	public float getTotalcost() {
		return totalcost;
	}

	
	
	
	
	

}
