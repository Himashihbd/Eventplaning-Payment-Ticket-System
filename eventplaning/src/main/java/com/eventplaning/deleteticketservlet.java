package com.eventplaning;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deleteticketservlet")
public class deleteticketservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tid=request.getParameter("ticket_id" );
		
		boolean isTrue;
		
		isTrue= paymentDBUtil.deleteticket(tid);
		
		if(isTrue==true) {
			
			RequestDispatcher dis=request.getRequestDispatcher("ticketinsert.jsp");
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
