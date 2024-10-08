<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show ticket</title>
<style>
  
  body {
    font-family: Arial, sans-serif;
    background-color: #f9f9f9;
    text-align: center;
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

  p {
    color: #333;
  }

  form {
    width: 300px;
    margin: 0 auto;
    padding: 20px;
    border: 1px solid #ccc;
    background-color: #fff;
  }

  label {
    display: block;
    margin: 10px 0;
    font-weight: bold;
  }

  input[type="text"] {
    width: 100%;
    padding: 10px;
    margin: 5px 0;
    border: 1px solid #ccc;
  }

  input[type="submit"] {
    background-color: #333;
    color: white;
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
 <p>You can see booking tickets details</p>
 <p>Please enter your Booking ID</p>
 <br><br>
 
 	<form action="show" method="post">
 		<label for="booking_id">Booking ID:</label>
        <input type="text" id="booking_id" name="booking_id" required><br><br>
        
        <input type="submit" value="Submit">
     </form>
     <br><br><br><br><br>
 
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