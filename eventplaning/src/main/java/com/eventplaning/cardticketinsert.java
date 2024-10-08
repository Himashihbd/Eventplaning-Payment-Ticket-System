package com.eventplaning;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cardticketinsert")
public class cardticketinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tid=request.getParameter("ticket_id");
		String cardnb= request.getParameter("card_number");
		String cardname=request.getParameter("card_holder");
		String exdate=request.getParameter("expiration_date");
		String cvv=request.getParameter("cvv");
		double amount=Double.parseDouble(request.getParameter("amount"));
		
		boolean isTrue;
		
		isTrue=paymentDBUtil.insertticketcard(tid, cardnb, cardname, exdate, cvv, amount);
		
		if(isTrue==true) {
			RequestDispatcher dis =request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis2 =request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
