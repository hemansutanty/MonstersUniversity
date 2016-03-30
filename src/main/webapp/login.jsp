<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Monsters University Login</title>
	<link type="text/css" rel="stylesheet" href="style.css"/>
	<link type="text/css" rel="stylesheet" href="bootstrap.min.css"/>
</head>
<body>
	<div class="wrapper">
		<s:actionerror class="alert-danger"/>
    	<s:form action="login" enctype="multipart/form-data" theme="bootstrap" cssClass="form-horizontal" >       
      	<h2>login</h2>
      	<hr>
      	<s:textfield  key="loginBean.colgId" placeholder="Enter the University ID" ></s:textfield>
	  	<s:textfield  key="loginBean.password" placeholder="Enter the Password"></s:textfield>
      	<s:submit key="submit" cssClass="btn btn-primary"></s:submit>      
      	<br>  
   	 	</s:form>
   	 	<br>
   	 	<a href="<s:url action="registerInput"/>">Not Registered yet? Click here to register</a> 
	</div>
</body>
</html>