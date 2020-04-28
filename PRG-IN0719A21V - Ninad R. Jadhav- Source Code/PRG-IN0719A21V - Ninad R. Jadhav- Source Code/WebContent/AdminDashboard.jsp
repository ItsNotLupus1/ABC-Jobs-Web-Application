<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles.css">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src='./scripts/jquery-3.4.1.min.js'></script>
<script src='./scripts/bootstrap.min.js'></script>
<title>ABC Jobs</title>
</head>
<body>
<%@include file="Header2.jsp"%>
<br><hr><br>
<div class="container">
<div class="row">
<div class="col-md-2"></div>
<div class="col-md-8">
<h3>Welcome to Admin's Dashboard, you have logged in successfully <s:property value="Email"/></h3>
<div class="card border-primary mb-3" style="max-width: 70rem;">
<center>
  <div class="card-body">
    <img src="Images/boy.png" class="card-title" height="50%" width="50%">
    <div class="card-text">
    </div>
    <a href="UsersProfile" class="btn btn-outline-primary" style="padding: 10px 25px;">User Profiles</a></center>
  </div>
</div>
</div>
<div class="col-md-2"></div>
</div>
<hr><br>
	<div class="row">
		<div class="col-md-12" style="text-align:center; color: silver;">
			<small> © Abc Jobs pvt ltd.</small>	
		</div>
	</div><br><br>
</body>
</html>