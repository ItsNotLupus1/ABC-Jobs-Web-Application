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
<%@include file="Header.jsp"%>
<br><br>
<div class="container">
<div class="row">
<div class="col-md-3"></div> 
 <div class="col-md-6"> 
<ul class="nav nav-tabs">
  <li class="nav-item">
    <a class="nav-link active" data-toggle="tab" href="#home">User</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" data-toggle="tab" href="#profile">Admin</a>
  </li>  
</ul><br>

<div id="myTabContent" class="tab-content">

  <div class="tab-pane active show" id="home"> 	
   <div class="card border-secondary mb-3" style="max-width: 70rem;">
  <div class="card-body">
    <center><img class="card-title" src="Images/user.png" height="50px" width="50px"><br> User Login</center><br>
    <div class="card-text">
    <h5><s:actionmessage/></h5>
    <s:form action="loginuser" method="post" theme="simple">
    <div class="row">
    <div class="col-md-12">
      <s:textfield type="email" class="form-control" name="Email" aria-describedby="emailHelp" placeholder="Email"/><br>
    </div>
      <div class="col-md-12">
      <s:password class="form-control" name="Password" aria-describedby="emailHelp" placeholder="Password"/><br>
       </div><br>
    </div> 
    <center><s:submit type="submit" value="Login" class="btn btn-primary" style="padding:10px 60px"/></center>
    </s:form>
    <br>
    <div class="row">
		<div class="col-md-12" style="text-align:center;">
			<s:a href="ConfirmEmail.jsp"><small> Forgot Password?</small></s:a>		
		</div>
	</div>
    	
    </div>
  </div>
   </div>  	
  </div>
  <div class="tab-pane" id="profile">
     <div class="card border-secondary mb-3" style="max-width: 70rem;">
  <div class="card-body">
    <center><img class="card-title" src="Images/user.png" height="50px" width="50px"><br> Admin Login</center><br>
    <div class="card-text">
    <h5><s:actionmessage/></h5>
    <s:form action="adminlogin" method="post" theme="simple">
    <div class="row">
    <div class="col-md-12">
      <s:textfield type="email" class="form-control" name="Email" aria-describedby="emailHelp" placeholder="Email"/><br>
    </div>
      <div class="col-md-12">
      <s:password type="email" class="form-control" name="Password" aria-describedby="emailHelp" placeholder="Password"/><br>
       </div>
    </div> <center><s:submit type="submit" value="Login" class="btn btn-primary" style="padding:10px 60px"/></center>
    </s:form>
    <br>
    <div class="row">
		<div class="col-md-12" style="text-align:center;">
			<s:a href="AdminConfirmEmail.jsp"><small> Forgot Password?</small></s:a>		
		</div>
	</div>
    	
    </div>
  </div>
   </div> 
  </div>
 
</div>

</div>
<div class="col-md-3"></div>
</div>
<hr><br>
	<div class="row">
		<div class="col-md-12" style="text-align:center; color: silver;">
			<small> © Abc Jobs pvt ltd.</small>	
		</div>
	</div><br><br>
</div>

</body>
</html>