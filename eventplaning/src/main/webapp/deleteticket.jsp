<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>delete ticket</title>
	<style>
    
    	body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
        }

        /* Style the header and navigation */
        header {
            background-color: #333;
            color: #fff;
            padding: 10px 0;
        }

        nav ul {
            list-style: none;
            padding: 0;
        }

        nav ul li {
            display: inline;
            margin-right: 20px;
        }

        nav ul li a {
            text-decoration: none;
            color: #fff;
        }

        /* Style the form container */
        h1 {
            text-align: center;
        }

        form {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
        }

        label {
            display: block;
            margin-bottom: 10px;
        }

        input[type="text"],
        input[type="number"],
        select {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            background-color: #333;
            color: #fff;
            padding: 10px 20px;
            border: none;
            cursor: pointer;
        }

        /* Style the footer */
        footer {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 20px 0;
        }

        .footer-content {
            max-width: 800px;
            margin: 0 auto;
        }

        .socials {
            list-style: none;
            padding: 0;
        }

        .socials li {
            display: inline;
            margin-right: 10px;
        }

        .footer-bottom {
            background-color: #222;
            padding: 10px 0;
        }

        .footer-menu ul {
            list-style: none;
            padding: 0;
        }

        .footer-menu ul li {
            display: inline;
            margin-right: 10px;
        }
    </style>
</head>
<body>
	<header>
        <nav>
            <ul>
                <li><a href="home.html">Home</a></li>
                <li><a href="#">Booking</a></li>
                <li><a href="payment.jsp">Payment</a></li>
                <li><a href="ticketinser.jsp">Ticket</a></li>
                <li><a href="#">About Us</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
        </nav>
    </header>
	
	<%
		String tid=request.getParameter("tid" );
		String bid=request.getParameter("bid" );
		String ename=request.getParameter("ename" );
		String ttype=request.getParameter("ttype" );
		String numtickets=request.getParameter("numtickets" );
		String tprice=request.getParameter("tprice" );
		
	%>
	
	<h1>Delete Ticket</h1>
    <form action="delete" method="post">
    
    	<label for="ticket_id">Ticket ID:</label>
        <input type="text" id="ticket_id" name="ticket_id" value="<%=tid %>" readonly required><br><br>
    
    	<label for="booking_id">Booking ID:</label>
        <input type="text" id="booking_id" name="booking_id" value="<%=bid %>" readonly required><br><br>
        
        <label for="event_name">Event Name:</label>
        <select id="event_name" name="event_name" >
            <option value="concert">Concert</option>
            <option value="Batch Party">Batch Party</option>
        </select><br><br>

        <label for="ticket_type">Ticket Type:</label>
        <select id="ticket_type" name="ticket_type" >
            <option value="general">General Admission</option>
            <option value="vip">VIP</option>
        </select><br><br>

        <label for="num_tickets">Number of Tickets:</label>
        <input type="number" id="num_tickets" name="num_tickets" min="1" value="<%=numtickets %>" readonly required><br><br>

        <label for="ticket_price">Ticket Price:</label>
        <input type="text" id="ticket_price" name="ticket_price" value="<%=tprice%>" readonly><br><br>

        <input type="submit" name="submit" value="Cancel Ticket">
    </form>
    
    <script>
        document.getElementById("ticket_type").addEventListener("change", updateTicketPrice);
        document.getElementById("num_tickets").addEventListener("input", updateTicketPrice);

        function updateTicketPrice() {
            const ticketType = document.getElementById("ticket_type").value;
            const numTickets = parseInt(document.getElementById("num_tickets").value);

            // Define ticket prices in Java or load from a database
            const ticketPrices = {
                general: 500,
                vip: 1000
            };

            const price = ticketPrices[ticketType];
            const totalPrice = price * numTickets;
            document.getElementById("ticket_price").value =  totalPrice.toFixed(2);
        }
    </script>
</body>
	<footer>
        <div class="footer-content">
            <h3>DREAM EVENTZ</h3>
            <p>"Welcome to the online event planning system! How can I assist you today? Whether you're organizing 
    a corporate conference, a wedding, a birthday party, or any other event, I'm here to help you with 
    the planning process. Just let me know what you need assistance with, and I'll provide guidance and 
    information to make your event a success."</p>
            <ul class="socials">
                <li><a href=><img src="images/face.png" height="30"><i class="fa fa-facebook"></i></a></li>
                <li><a href=><img src="images/twi.png" height="30"><i class="fa fa-twitter"></i></a></li>
                <li><a href=><img src="images/google.png" height="50"><i class="fa fa-google"></i></a></li>
                <li><a href=><img src="images/you.png" height="30"><i class="fa fa-youtube"></i></a></li>
                <li><a href=><img src="images/inster.png" height="30"><i class="fa fa-instergram"></i></a></li>
            </ul>
        </div>
        <div class="footer-bottom">
            <p>copyright &copy; <a href="#">HS</a>  </p>
                    <div class="footer-menu">
                      <ul class="f-menu">
                        <li><a href="privacy policy.html">Privacy policy</a></li>
                        <li><a href="about us.php">About</a></li>
                        <li><a href="contactus.php">Contact</a></li>
                        <li><a href="tc.html">TermsConditions</a></li>
                      </ul>
                    </div>
        </div>

    </footer>
</html>