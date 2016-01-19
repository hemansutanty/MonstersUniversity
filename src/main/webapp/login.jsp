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
    <s:form action="add" enctype="multipart/form-data" cssClass="form-signin">       
      <h2 class="form-signin-heading">login</h2>
      <hr>
      <input type="text" class="form-control" name="username" placeholder="Email Address" required="" autofocus="" />
      <br>
      <input type="password" class="form-control" name="password" placeholder="Password" required=""/>
      <br>      
      <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
      <br>
      <a href="<s:url action="registerInput"/>">Not Registered yet? Click here to register</a>   
    </s:form>
</div>
</body>
</html>