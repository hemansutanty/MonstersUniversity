<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>University Registration Page</title>
	<link href="<s:url value ="style.css"/>" rel="stylesheet" type="text/css"/>
	<s:head/> 
	<sb:head/>
</head>
<body>
	<h2>Register</h2>
	<hr>
    <div class="container">
			<div class="row">
			
					<s:form action="add" enctype="multipart/form-data" theme="bootstrap" cssClass="form-horizontal ">
		
					<s:textfield key="registerBean.firstNameStudent" placeholder="Enter Student's First Name"></s:textfield>
					<s:textfield key="registerBean.middleNameStudent" placeholder="Enter Student's Middle Name"></s:textfield>
					<s:textfield key="registerBean.lastNameStudent" placeholder="Enter Student's Last Name"></s:textfield>
		
					<s:textfield key="registerBean.dateOfBirthStudent" placeholder="Enter Date of Birth in format mm/dd/yyyy"></s:textfield>
					<s:textfield key="registerBean.emailStudent" placeholder="Enter Student's email id"></s:textfield>
					<s:radio key="registerBean.genderStudent" list="genders"/>
					<s:textfield key="registerBean.nationalityStudent" placeholder="Enter Nationality of Student"></s:textfield>
					<s:textfield key="registerBean.addressLine1Student" placeholder="Enter the House No or Area for Student's address"></s:textfield>
					<s:textfield key="registerBean.addressLine2Student" placeholder="Enter Colony or Street for Student's address"></s:textfield>
					<s:textfield key="registerBean.cityStudent" placeholder="Enter City for Student's address"></s:textfield>
					<s:textfield key="registerBean.stateStudent" placeholder="Enter State for Student's address"></s:textfield>
					<s:textfield key="registerBean.countryStudent" placeholder="Enter Country for Student's address"></s:textfield>
					<s:textfield key="registerBean.zipCodeStudent" placeholder="Enter zipcode for Student's address"></s:textfield>
		
					<s:textfield key="registerBean.contactNo1Student" placeholder="Enter Primary Contact No. for Student"></s:textfield>
					<s:textfield key="registerBean.contactNo2Student" placeholder="Enter Secondary Contact no. for Student"></s:textfield>
		
					<br>
		
					<s:textfield key="registerBean.guardianName" placeholder="Enter Guardian's Name"></s:textfield>
					<s:textfield key="registerBean.addressLine1Guardian" placeholder="Enter the House No or Area for Guardian's address"></s:textfield>
					<s:textfield key="registerBean.addressLine2Guardian" placeholder="Enter Colony or Street for Guardian's address"></s:textfield>
					<s:textfield key="registerBean.cityGuardian" placeholder="Enter City for Guardian's address"></s:textfield>
					<s:textfield key="registerBean.stateGuardian" placeholder="Enter State for Guardian's address"></s:textfield>
					<s:textfield key="registerBean.countryGuardian" placeholder="Enter Country for Guardian's address"></s:textfield>
					<s:textfield key="registerBean.zipCodeGuardian" placeholder="Enter zipcode for Student's address"></s:textfield>
		
					<s:textfield key="registerBean.contactNo1Guardian" placeholder="Enter Primary Contact No. for Guardian"></s:textfield>
					<s:textfield key="registerBean.contactNo2Guardian" placeholder="Enter Secondary Contact no. for Student"></s:textfield>
		
					<br>
		
					<s:textfield key="registerBean.iitjeeRank" placeholder="Enter IITJEE rank"></s:textfield>
		
					<s:textfield key="registerBean.percentage12th" placeholder="Enter percentage obtained in 12th"></s:textfield>
					<s:textfield key="registerBean.percentage10th" placeholder="Enter percentage obtained in 10th"></s:textfield>
		
					<br>
					
					<s:textfield key="registerBean.password" placeholder="Enter password to use to Login"></s:textfield>
		
					<s:submit key="submit" cssClass="btn btn-primary" id="submitBtn"></s:submit>
				</s:form>
			</div>
		</div>
	
</body>
</html>