<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error Page</title>
</head>
<body>
<center>
	<h2>
		This is an Error Page
	</h2>
	<h4>The application has malfunctioned.</h4>
 
	<p>  Please contact technical support with the following information:</p> 
 
	<h4>Exception Name: <s:property value="%{exception.message}"/> </h4>
 
	<h4>Exception Details: <s:property value="%{exceptionStack}"/></h4> 
</center>
	
</body>
</html>