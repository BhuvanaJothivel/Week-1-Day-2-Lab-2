<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="./assets/style.css"/>
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script type="text/javascript" type="module" src="./myscript/script.js"></script>
<title></title>
</head>
<body>

<div class="container">
  	<div class="header">FARE CALCULATOR</div>
	<div class="main">
	
	<div class="first-row">
	
	<div id="contact">Hotel</div>
	<div id="contactForm">
 	<small>Hotel Fare Calculator</small>
	<form  action="${pageContext.request.contextPath}/hotel" method="post">
	<h1>Hotel Booking</h1>
	<input type="text" name="persons" placeholder="Number of Persons"/>
	<input type="date" name="from" placeholder="From"/>
	<input type="date" name="to" placeholder="To"/>
	<label>RoomType:<br> AC<input type="radio" name="roomtype" value="AC"/>Non-AC<input type="radio" name="roomtype" value="Non-AC"/>
	Occupancy: Single<input type="radio" name="occupancy" value="single"/>Double<input type="radio" name="occupancy" value="double"/></label>
	<button type="submit" class="formBtn">Calculate</button>
	<button class="formBtn" type="reset" >Reset</button>
	</form>
	</div>
	<h1>${hotelfare}</h1>
	</div>
		
	<div class="second-row">
	
	<div id="contact1">Bus</div>
	<div id="contactForm1">
 	<small>Bus Fare Calculator</small>
	<form action="${pageContext.request.contextPath}/bus" method="post">
	<h1>Bus Booking</h1>
	<input type="text" name="persons" placeholder="Number of Persons"/>	
	<input type="date" name="start" placeholder="Date of Journey"/><br>
	<label>Bus Type:</label><br>
	<label>AC</label><br>
	<label>Seater<input type="radio" name="bustype" value="acseater"/>
	SemiSleeper<input type="radio" name="bustype" value="acsemisleeper"/>
	Sleeper<input type="radio" name="bustype" value="acsleeper"><br>
	Non-AC<br>
	Seater<input type="radio" name="bustype" value="nonacseater"/>
	SemiSleeper<input type="radio" name="bustype" value="nonacsemisleeper"/>
	Sleeper<input type="radio" name="bustype" value="nonacsleeper"/></label><br>
	<button type="submit" class="formBtn">Calculate</button>
	<button class="formBtn" type="reset" >Reset</button>
	</form>
	</div>
	<h1>${busfare}</h1>
	</div>
	
	
	<div class="third-row">
	<div id="contact2">Flight</div>
	<div id="contactForm2">
 	<small>Flight Fare Calculator</small>	
	<form action="${pageContext.request.contextPath}/flight" method="post">
	<h1>Flight Booking</h1>
	<input type="text" name="persons" placeholder="Number of Persons"/>
	<input type="date" name="start" placeholder="Date of Journey"/>
	<label>Class:</label>
	<label>Executive<input type="radio" name="class" value="executive"/>
	Economy<input type="radio" name="class" value="economy"/></label><br>
	<button type="submit" class="formBtn">Calculate</button>
	<button class="formBtn" type="reset" >Reset</button>
	</form>
	</div>
	<h1>${flightfare}</h1>
	</div>
	
	
	<div class="fourth-row">
	<div id="contact3">Train</div>
	<div id="contactForm3">
 	<small>Train Fare Calculator</small>	
	<form action="${pageContext.request.contextPath}/train" method="post">
	<h1>Train Booking</h1>
	<input type="text" name="persons" placeholder="Number of Persons"/>
	<input type="date" name="start" placeholder="Date of Journey"/>
	<label>Berth Type:</label><br>
<label>I-AC<input type="radio" name="berth" id="ac" value="ac1" placeholder="I-AC"/>
	AC-II Tier<input type="radio" name="berth" value="ac2"/>
	AC-III Tier<input type="radio" name="berth" value="ac3"/>
	NON-AC<input type="radio" name="berth" value="nonac"/>
	General<input type="radio" name="berth" value="general"/></label>
	<button type="submit" class="formBtn">Calculate</button>
	<button class="formBtn" type="reset" >Reset</button>
	</form>
	</div>
	<h1>${trainfare}</h1>
	</div>
	
	</div>
	
	<div class="footer"></div>
	
</div>
</body>
</html>