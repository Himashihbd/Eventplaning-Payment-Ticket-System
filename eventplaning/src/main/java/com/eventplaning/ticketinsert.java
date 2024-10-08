package com.eventplaning;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ticketinsert")
public class ticketinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("booking_id");
		String event = request.getParameter("event_name");
        String ticketType = request.getParameter("ticket_type");
        int numTickets = Integer.parseInt(request.getParameter("num_tickets"));
        double ticketPrice = Double.parseDouble(request.getParameter("ticket_price"));
        
boolean isTrue;
		
		isTrue=paymentDBUtil.insertticket(id, event, ticketType, numTickets, ticketPrice);
		
		if(isTrue==true) {
			RequestDispatcher dis =request.getRequestDispatcher("ticketshow.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis2 =request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
        
       
	}

}
