package com.eventplaning;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ticketshow")
public class ticketshow extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String booking_id=request.getParameter("booking_id");
		
		
		try {
		List<Customerticket>custicketDetails=paymentDBUtil.validate(booking_id);
		request.setAttribute("custicketDetails", custicketDetails);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis=request.getRequestDispatcher("ticketdetails.jsp");
		dis.forward(request, response);
	}

}
