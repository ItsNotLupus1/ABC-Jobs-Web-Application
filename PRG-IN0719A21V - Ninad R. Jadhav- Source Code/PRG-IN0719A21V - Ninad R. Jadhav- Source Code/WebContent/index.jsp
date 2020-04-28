<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles.css">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>ABC Jobs</title>
</head>
<body>
<%@include file="Header.jsp"%>
<br><br>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-6" style="text-align:center; font-size: 35px;">
		<br><br><br>
			<strong>WELCOME TO YOUR <br>PROFESSIONAL COMMUNITY</strong>
		</div>
		<div class="col-md-6">
			<img src="Images/contentman.png" height="450px" width="600px">
		</div>
	</div><br><br>
	<hr>
	<br>
	<div class="row">
		<div class="col-md-4" style="text-align:center; font-size: 35px;">
			<img src="Images/team.png" height="250px" width="250px"><br>
			<strong><h2>10M+</h2></strong>
			Job Seekers
		</div>
		<div class="col-md-4" style="text-align:center; font-size: 35px;">
			<img src="Images/phone.png" height="200px" width="200px"><br><br>
			<strong><h2>1.5M+</h2></strong>
			Candidate Calls Monthly
		</div>
		<div class="col-md-4" style="text-align:center; font-size: 35px;">
			<img src="Images/hotels.png" height="200px" width="200px"><br><br>
			<strong><h2>800k+</h2></strong>
			Jobs Posted Monthly
		</div>
	</div><br><br>
	<hr><br><br>
	<div class="row">
	<div class="col-md-6" style="text-align:center; font-size: 35px;"><br><br>
			<strong><h2>Join your colleagues, classmates <br>and friends on ABC Jobs</h2></strong><br>	
			<s:a href="register.jsp"> <button type="button" class="btn btn-outline-primary" style="padding: 12px 35px 12px 35px; font-size: 25px"> Get Started!</button></s:a>
	</div>
	<div class="col-md-6">
		<img src="Images/ent.png" height="450px" width="600px"><br><br>
	</div>
		<br><br><br><br><br><br><br><br><br><br>
	</div><br><br>
	<hr><br>
	<div class="row">
		<div class="col-md-12" style="text-align:center; color: silver;">
			<small> © Abc Jobs pvt ltd.</small>	
		</div>
	</div><br><br>
</div> 
</body>
</html>