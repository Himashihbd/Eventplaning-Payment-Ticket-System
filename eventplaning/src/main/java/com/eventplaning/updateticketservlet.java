package com.eventplaning;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updateticketservlet")
public class updateticketservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tid=request.getParameter("ticket_id" );
		String bid=request.getParameter("booking_id" );
		String ename=request.getParameter("event_name" );
		String ttype=request.getParameter("ticket_type" );
		String numtickets=request.getParameter("num_tickets" );
		String tprice=request.getParameter("ticket_price" );
		
		boolean isTrue;
		
		isTrue= paymentDBUtil.updateticket(tid, bid, ename, ttype, numtickets, tprice);
		
		if(isTrue==true) {
			List<Customerticket>custicketDetails=paymentDBUtil.getTicketDetails(tid);
			request.setAttribute("custicketDetails", custicketDetails);
			
			RequestDispatcher dis=request.getRequestDispatcher("ticketdetails.jsp");
			dis.forward(request, response);
		}
		else {
			List<Customerticket>custicketDetails=paymentDBUtil.getTicketDetails(tid);
			request.setAttribute("custicketDetails", custicketDetails);
			
			RequestDispatcher dis=request.getRequestDispatcher("ticketdetails.jsp");
			dis.forward(request, response);
		}
		
	}

}
