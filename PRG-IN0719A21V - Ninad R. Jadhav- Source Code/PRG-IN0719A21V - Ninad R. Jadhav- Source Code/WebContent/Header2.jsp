<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles.css">
<meta charset="ISO-8859-1">
</head>
<body>
<div class="container-fluid">
<div class="row">
<div class="col-md-4">
  <a href="UserDashboard.jsp"><img src="Images/logo.png"/></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor03" aria-controls="navbarColor03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
</div>
<div class="col-md-4"></div>
<div class="col-md-2"> 
<br><br><br>
        <s:a class="nav-link" href="SearchUser.jsp"><button type="button" class="btn btn-outline-secondary" style="padding: 8px 15px 8px 15px; font-size: 25px">Search</button></s:a>
  </div>  
 <div class="col-md-2"> 
<br><br><br>
  <a class="nav-link" href="logout"><button type="button" class="btn btn-primary" style="padding: 8px 15px 8px 15px; font-size: 25px">Logout</button></a>
  </div>
  </div>
 </div> 
</body>
</html>