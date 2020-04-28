<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: white;
}

.container {
  padding: 16px 500px;
  background-color: lightblue;
}


input[type=text], input[type=password] {
  width: 238%;
  padding: 15px;
  margin:  5px 0 22px 0;	
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}


hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}


.registerbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
  margin-left:235px;
}

.registerbtn:hover {
  opacity: 1;
}

a {
  color: dodgerblue;
}


.signin {
  background-color: #f1f1f1;
  text-align: center;
}

</style>
</head>
<body>
<%@include file="Header.jsp"%>
<div class="container">
<h2>Login Form</h2>
<hr>
<s:form action="adminlogin" method="post">
<s:textfield label="Email" name="Email" placeholder="Enter Your Email" />
<s:password label="Password" name="Password" />
<s:submit cssClass="registerbtn" value="Login" />
</s:form>
<%@include file="Footer.jsp" %>
</body>
</html>