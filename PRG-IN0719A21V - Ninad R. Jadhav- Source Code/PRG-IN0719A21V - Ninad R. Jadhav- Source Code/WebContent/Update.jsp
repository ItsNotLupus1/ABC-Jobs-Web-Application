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
<div class="card border-secondary mb-3" style="max-width: 70rem;">
  <div class="card-body">
    <center><img class="card-title" src="Images/user.png" height="50px" width="50px"></center><br>
    <div class="card-text">
    <s:iterator value="beanList">
    <s:form action="updatespls" method="post" theme="simple">
    <div class="row">
    <div class="col-md-12">
      <label><b>First Name</b></label>
      <s:textfield type="text" class="form-control" name="Fname" placeholder="First Name"/>
      <br>
    </div>
    <div class="col-md-12">
    <label><b>Last Name</b></label>
       <s:textfield type="text" class="form-control" name="Lname" placeholder="Last Name"/><br>
    </div>
    <div class="col-md-12">
    <label><b>Username</b></label>
     <s:textfield type="text" class="form-control" name="Uname" placeholder="Username"/><br>
    </div>
    <div class="col-md-12">
    <label><b>Job Title</b></label>
     <s:textfield type="text" class="form-control" name="Job_Title" placeholder="Job Title"/><br>
    </div>
    <div class="col-md-12">
    <label><b>Company</b></label>
     <s:textfield type="text" class="form-control" name="Company" placeholder="Company"/><br>
    </div>
    <div class="col-md-12">
    <label><b>About</b></label>
          <s:textfield type="text" class="form-control" name="About" placeholder="About"/><br>
    </div>
    <div class="col-md-12">
    <label><b>Education</b></label>
           <s:textfield type="text" class="form-control" name="Education" placeholder="Education"/><br>
    </div>
      <div class="col-md-12">
      <label><b>Experience</b></label>
     <s:textfield type="text" class="form-control" name="Experience" placeholder="Experience"/><br>
       </div>
        <div class="col-md-12">
        <label><b>Country</b></label>
      <s:textfield  class="form-control" name="Country" placeholder="Country"/><br>	
    </div>
    </div> <center><s:submit type="submit" value="Save" class="btn btn-primary" style="padding:10px 60px"/></center>
    </s:form>
    </s:iterator>
    <br>
 
    	
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
</div>

</body>
</html>