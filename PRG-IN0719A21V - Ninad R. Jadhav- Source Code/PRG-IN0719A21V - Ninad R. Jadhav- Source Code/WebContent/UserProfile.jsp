<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
  border-collapse: collapse;
  width: 100%;
  border: 1px solid #000;
}

th, td {
  padding: 8px;
  text-align: left;
  border: 1px solid #ddd;
}

tr:hover {background-color:#f5f5f5;}
</style>
</head>
<body>
<%@include file="Header2.jsp"%>
<br><hr><br>

<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Username</th>
<th>Email</th>
<th>Password</th>
<th>Company</th>
<th>Country</th>
</tr>
<s:iterator value="beanList">
<tr>
<td><s:property value="Fname"/></td>
<td><s:property value="Lname"/></td>
<td><s:property value="Uname"/></td>
<td><s:property value="Email"/></td>
<td><s:property value="Password"/></td>
<td><s:property value="Company"/></td>
<td><s:property value="Country"/></td>
<td><a href="AdminDelete.action?Email=<s:property value="Email"/>"><button class="button-delete">Delete</button></a>
</td>
</tr>
</s:iterator>
</table>
<hr><br>
	<div class="row">
		<div class="col-md-12" style="text-align:center; color: silver;">
			<small> © Abc Jobs pvt ltd.</small>	
		</div>
	</div><br><br>

</body>
</html>