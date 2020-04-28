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
<%@include file="Header2.jsp" %>
<br><br>

<div class="container">
<s:if test="noData==true">
<br>
			<s:iterator value="beanList">
				<a style="text-decoration: none"
					href="FullProfile.action?email=<s:property value="Email"/>">
					<div class="row">

						<div class="mb-3 col-md-12">
							<div style="border: 0.5px solid #ddd" class="card-body">
								<img class="card-title" src="Images/one.png" height="80px"
									width="80px">


								<h5>
									<s:property value="Fname" />
									<s:property value="Lname" />
								</h5>
								<small class="form-text text-muted"> Works at <s:property
										value="Company" />, and lives in <s:property value="Country" />.
								</small>
								<p class="card-text"></p>
							</div>
						</div>
						</div>
				</a>
			</s:iterator>	
			
			
			

</s:if>
<s:else>
<div style="color: red;">No Data Found.</div>
</s:else>
<s:if test="insert>0">
<span style="color: red;"><s:property value="msgs" /></span>
</s:if>
<s:else>
<span style="color: red;"><s:property value="msgs" /></span>
</s:else>
 

</div>
  <hr> 
</body>
</html>