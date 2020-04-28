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
<h5><s:actionmessage/></h5>
<div class="container">
<div class="row">
<div class="col-md-2"></div> 
 <div class="col-md-8"> 
<div class="card border-secondary mb-3" style="max-width: 70rem;">
  <div class="card-body">
    <center><img class="card-title" src="Images/user.png" height="50px" width="50px"><br>Please Enter Your New Password!</center><br>
    <div class="card-text">
    <s:form name="myForm" action="UpdatePasss" method="post" onsubmit="return validate()" theme="simple">
    <div class="row">
    <div class="col-md-12">
     <s:password class="form-control" label="Password" id="Pass" name="Password" placeholder="Enter Your Password"/>
     <br>
    </div>
    <div class="col-md-12">
     <s:password class="form-control" label="CPassword" id ="Cpass" name="CPassword" placeholder="Enter Your Password Again"/>
    <br>
    </div>
   </div> <center><s:submit type="submit" value="Reset" class="btn btn-primary" style="padding:10px 60px"/></center>
    </s:form>
    	
    </div>
  </div>
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
<script>
function validate()
{
var Pass = document.getElementById("Pass").value;
var Cpass = document.getElementById("Cpass").value;

if(Pass != Cpass)
	{
	alert("Password and Confirm Password should match!")
	return false;
	}
	
	return true;
}
</script>

</body>
</html>