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
<br><br>
<div class="container">
<div class="row">
<div class="col-md-2"></div> 
 <div class="col-md-8"> 
<div class="card border-secondary mb-3" style="max-width: 70rem;">
  <div class="card-body">
  <s:iterator value="beanl">
    <center><img class="card-title" src="Images/view.png" height="200px" width="200px">
    <br>
    
    <h3><s:property value="Fname"/> <s:property value="Lname"/></h3>
    <p style="font-weigth:normal"><s:property value="Job_Title"/></p>
    <s:property value="Country"/><br><hr>
    </center>
    <h4>About</h4>
    
    <s:property value="About"/>
    <br><hr>
    <h4>Experience</h4>
    <s:property value="Experience"/>
    <br><hr>
    <h4>Education</h4>
    <s:property value="Education"/>
    <br>
    <div class="card-text">
    
  
    <br>
    <div class="row">
		<div class="col-md-12" style="text-align:center;">
			
		</div>
	</div>
    	
    </div>
    
    </s:iterator>
  </div>
   </div> 
 
</div>
<div class="col-md-2"></div>
</div>
</div>
<hr><br>
	<div class="row">
		<div class="col-md-12" style="text-align:center; color: silver;">
			<small> � Abc Jobs pvt ltd.</small>	
		</div>
	</div><br><br>



</body>
</html>