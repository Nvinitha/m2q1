<%@ page language="java" contentType="text/html; charset=ISO-8859-1"pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="a" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hotel Details</title>
<style>
table {
	text-align: center;
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 15px;
}
</style>
</head>

<body>

<div align="center">
<table >
<tr>
<th>Id</th>
<th>Name</th>
<th>Rating</th>
<th>Rate</th>
<th>Available Rooms</th>
</tr>
<a:forEach var="hotel" items="${list}">
<tr>
<td>${hotel.hotelId}</td>
<td><a href="hotelbook" name="hotelName"> ${hotel.hotelName} </a></td>
<td>${hotel.hotelRating}</td>
<td>${hotel.hotelRate}</td>
<td>${hotel.availableRooms}</td>
</tr>
</a:forEach>
</table>
<br>
Click a Hotel name to start Booking.
<br>
</div>
</body>
</html>