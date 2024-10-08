package com.eventplaning;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class paymentDBUtil {
	
	private static boolean isSuccess;//track the success of database operations
	private static Connection con=null;//holding the database connection
	private static Statement stmt=null;//holding the SQL statement
	private static ResultSet rs=null;//holding the result of a database query
	
	public static List<Customerpayment> validate(String bookingID,String name,String email){
		
		ArrayList<Customerpayment> cus=new ArrayList<>();
		
		//validate
		
		try {
			//connect to  Data Base
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql="select * from payment where bookingID='"+bookingID+"'and name='"+name+"'and email='"+email+"'";
			rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
				String paymentID=rs.getString(1);
				String bookingiD=rs.getString(2);
				String Name=rs.getString(3);
				String Email=rs.getString(4);
				String eventName=rs.getString(5);
				float totalCost=rs.getFloat(6);
				
				Customerpayment c=new Customerpayment(paymentID,bookingiD,Name,Email,eventName,totalCost);
				cus.add(c);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return cus;
		
	}
	
	public static boolean insertcard(String pid, String cardnb, String cardname, String exdate, String cvv, double amount) {
		
		boolean isSuccess = false;
		
		
		
		try {
			//connect to  Data Base
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql="insert into card values(0,'"+pid+"','"+cardnb+"','"+cardname+"','"+amount+"')";
			int rs=stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess= true;
				
			}else {
				isSuccess= false;
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}
	
public static boolean  insertticket(String booking_id,String event_name, String ticket_type,int num_tickets,double ticket_price) {
		
		
	boolean isSuccess = false;
		
		
		try {
			//connect to  Data Base
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql="insert into ticket values(0,'"+booking_id+"','"+event_name+"','"+ticket_type+"','"+num_tickets+"','"+ticket_price+"')";
			int rs=stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess= true;
				
			}else {
				isSuccess= false;
			}
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
		
	}

public static List<Customerticket> validate(String bookingid){
	
	ArrayList<Customerticket> cus=new ArrayList<>();
	
	//validate
	
	try {
	//connect to  Data Base
		con=DBConnect.getConnection();
		stmt=con.createStatement();
		String sql="select * from ticket where booking_id='"+bookingid+"'";
		rs=stmt.executeQuery(sql);
		
		if(rs.next()) {
			int idticket=rs.getInt(1);
			String booking_id=rs.getString(2);
			String event_name=rs.getString(3);
			String ticket_type=rs.getString(4);
			int num_tickets=rs.getInt(5);
			int ticket_price=rs.getInt(6);
			
			Customerticket c=new Customerticket(idticket,booking_id,event_name,ticket_type,num_tickets,ticket_price);
			cus.add(c);
			
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return cus;
	
}
	//update
public static boolean updateticket(String tid, String bid, String ename, String ttype, String numtickets, String tprice) {
	
	try {
		//connect to  Data Base
		con=DBConnect.getConnection();
		stmt=con.createStatement();
		String sql = "update ticket set event_name='"+ename+"',ticket_type='"+ttype+"',num_tickets='"+numtickets+"',ticket_price='"+tprice+"'"+"where idticket='"+tid+"'";
		int rs = stmt.executeUpdate(sql);
		
		if(rs>0) {
			isSuccess= true;
			
		}else {
			isSuccess= false;
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
	
}
public static List<Customerticket> getTicketDetails(String tid){
	
	int convertedtid=Integer.parseInt(tid);
	
	ArrayList<Customerticket> cus=new ArrayList<>();
	
	try {
		//connect to  Data Base
		con=DBConnect.getConnection();
		stmt=con.createStatement();
		String sql="select * from ticket where idticket='"+convertedtid+"' ";
		rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			int tId=rs.getInt(1);
			String bId=rs.getString(2);
			String eventname=rs.getString(3);
			String tickettype=rs.getString(4);
			int numticket=rs.getInt(5);
			int ticketprice=rs.getInt(6);
			
			Customerticket c= new Customerticket(tId,bId,eventname,tickettype,numticket,ticketprice);
			cus.add(c);
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return cus;
}

	//delete
public static boolean deleteticket(String tid) {
	
	int convertedtid=Integer.parseInt(tid);
	
	try {
		//connect to  Data Base
		con=DBConnect.getConnection();
		stmt=con.createStatement();
		String sql="delete from ticket where idticket='"+convertedtid+"'";
		int rs = stmt.executeUpdate(sql);
		
		if(rs>0) {
			isSuccess= true;
			
		}else {
			isSuccess= false;
		}
		
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}

public static boolean insertticketcard(String tid, String cardnb, String cardname, String exdate, String cvv, double amount) {
	
	boolean isSuccess = false;
	
	
	
	try {
		//connect to  Data Base
		con=DBConnect.getConnection();
		stmt=con.createStatement();
		String sql="insert into ticketcard values(0,'"+tid+"','"+cardnb+"','"+cardname+"','"+amount+"')";
		int rs=stmt.executeUpdate(sql);
		
		if(rs>0) {
			isSuccess= true;
			
		}else {
			isSuccess= false;
		}
		
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	
	return isSuccess;
}
	
}
