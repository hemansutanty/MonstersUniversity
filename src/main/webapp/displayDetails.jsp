<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="style.css">
	<title>Details</title>
</head>
<body>
	
	<div class = "midSection">
	<h3 class="underline">Your Registration Details</h3>
	<hr>
		<s:iterator value="test">  	  
			<b>Name:</b><s:property value="firstNameStudent"/><s:property value="middleNameStudent"/> <s:property value="lastNameStudent"/><br/>
			<b>University ID:</b><s:property value="aId"/><br/> 
			<b>Date of Birth:</b><s:property value="dateOfBirthStudent"/><br/>
			<b>Email:</b><s:property value="emailStudent"/><br/>
			<b>Gender:</b><s:property value="genderStudent"/><br/>
			<b>Nationality:</b><s:property value="nationalityStudent"/><br/>
			<b>Address:</b><s:property value="addressLine1Student"/>,<s:property value="addressLine2Student"/>,
			<s:property value="cityStudent"/>,<s:property value="stateStudent"/>,
			<s:property value="countryStudent"/>
			<br/>
			<b>Zip Code:</b><s:property value="zipCodeStudent"/><br/>
			<b>Contact No's:</b><s:property value="contactNo1Student"/>,<s:property value="contactNo2Student"/><br/><br/>
			
			<b>Guardian Name:</b><s:property value="guardianName"/><br/>
			<b>Address:</b><s:property value="addressLine1Guardian"/>,<s:property value="addressLine2Guardian"/>,
			<s:property value="cityGuardian"/>,<s:property value="stateGuardian"/>,
			<s:property value="countryGuardian"/>
			<br/>
			<b>Zip Code:</b><s:property value="zipCodeGuardian"/><br/>
			<b>Contact No's:</b><s:property value="contactNo1Guardian"/>,<s:property value="contactNo2Guardian"/><br/><br/>
			
			<b>IITJEE Rank:</b><s:property value="iitjeeRank"/><br/>
			<b>12th Percentage:</b><s:property value="percentage12th"/><br/>
			<b>10th Percentage:</b><s:property value="percentage10th"/><br/>		  
		</s:iterator>
	</div> 
</body>
</html>