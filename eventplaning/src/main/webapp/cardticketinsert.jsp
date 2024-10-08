<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Card Insert</title>
	<style>
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

        /* Style the h1 element */
        h1 {
            text-align: center;
        }

        /* Style the form and its elements */
        form {
            max-width: 400px;
            margin: 0 auto;
        }

        label {
            display: block;
            margin-bottom: 5px;
        }

        input[type="text"],
        input[type="date"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
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
                <li><a href="ticketinsert.jsp">Ticket</a></li>
                <li><a href="#">About Us</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
        </nav>
    </header>
    
	<h1>Card Payment</h1>
    <form action="ticket" method="post">
    	
    	<label for="ticket_id">Ticket ID:</label>
        <input type="text" id="ticket_id" name="ticket_id" required><br><br>
        
        <label for="card_number">Card Number:</label>
        <input type="text" id="card_number" name="card_number" required><br><br>

        <label for="card_holder">Card Holder:</label>
        <input type="text" id="card_holder" name="card_holder" required><br><br>

        <label for="expiration_date">Expiration Date:</label>
        <input type="text" id="expiration_date" name="expiration_date" required><br><br>

        <label for="cvv">CVV:</label>
        <input type="text" id="cvv" name="cvv" required><br><br>

        <label for="amount">Amount:</label>
        <input type="text" id="amount" name="amount" required><br><br>

        <input type="submit" value="Make Payment">
       </form>
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