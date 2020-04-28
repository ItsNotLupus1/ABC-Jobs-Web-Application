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
<%@include file="Header.jsp" %>
<div class="container"><br><br>

<div class="card border-secondary mb-3" style="max-width: 70rem; padding: 100px; border-radius: 10px;">
<s:form action="adminemailsend" method="post" theme="simple">
<h1>
Enter Your Registered Email!
</h1>
<br>
<h3>We will send a password confirmation email to you!</h3>
<hr>
<!-- Search form -->
<div class="row">
<div class="col-md-6">
<s:textfield class="form-control" type="email" name="Email" placeholder="Registered Email"/> 
</div>
<div class="col-md-2">
	 <s:submit class="btn btn-outline-success" value="Get OTP" style="padding: 10px 30px" />
</div>
</div>
</s:form>
</div><br>
<hr><br>
	<div class="row">
		<div class="col-md-12" style="text-align:center; color: silver;">
			<small> © Abc Jobs pvt ltd.</small>	
		</div>
</div>
</body>
</html>