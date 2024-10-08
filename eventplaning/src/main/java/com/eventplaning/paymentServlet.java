package com.eventplaning;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/paymentServlet")
public class paymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String bookingID=request.getParameter("bid");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		
		try {
		List<Customerpayment>cuspaymentDetails=paymentDBUtil.validate(bookingID, name, email);
		request.setAttribute("cuspaymentDetails", cuspaymentDetails);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis=request.getRequestDispatcher("paymentdetails.jsp");
		dis.forward(request, response);
		
	}

}
