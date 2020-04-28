<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, td, th {border: 1px solid black;}
table {border-collapse: collapse;width: 60%;}
th {height: 30px;}
.button-update {background-color: #008CBA;color: white;}
.button-delete {background-color: red;color: white;}
</style>
</head>
<body>
<div style="margin-top: 40px;">
<s:if test="noData==true">
<table>
<thead>
<tr style="background-color: #E0E0E1;">
<th>First Name</th>
<th>Last Name</th>
<th>Username</th>
<th>Password</th>
<th>Action</th>
</tr>
</thead>
<s:iterator value="beanList">
<tr>
<td><s:property value="Fname"
/></td>
<td><s:property value="Lname"
/></td>
<td><s:property value="Uname"
/></td>
<td><s:property value="Password"
/></td>
<td>
<a
href="updatedetails.action?submitType=updatedata&Uname=<s:property
value="Uname"/>">
<button
class="button-update">Update</button>
</a>
<a
href="deleterecord.action?Uname=<s:property value="Uname"/>">
<button
class="button-delete">Delete</button>
</a>
</td>
</tr>
</s:iterator>
</table>
</s:if>
<s:else>
<div style="color: red;">No Data Found.</div>
</s:else>
</div>
</body>
</html>