<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>University Registration Page</title>
</head>
<body>
	<h2>Register yourself for the University</h2>
	<s:form action="add">
		<s:label for="personal_information" value="Personal Information"></s:label>
		<s:label for="piseparator" value="-------------------------"></s:label>
		<s:textfield key="registerBean.aFirstName" ></s:textfield>
		<s:textfield key="registerBean.aMiddleName" ></s:textfield>
		<s:textfield key="registerBean.aLastName" ></s:textfield>
		<s:textfield key="registerBean.aDateOfBirth" ></s:textfield>
		<s:textfield key="registerBean.aEmail"></s:textfield>
		<s:radio key="registerBean.aGender" list="genders" />
		<s:textfield key="registerBean.aNationality"></s:textfield>
		
		<s:textfield key="registerBean.aAddressLine1"></s:textfield>
		<s:textfield key="registerBean.aAddressLine2"></s:textfield>
		<s:textfield key="registerBean.aCity"></s:textfield>
		<s:textfield key="registerBean.aState"></s:textfield>
		<s:textfield key="registerBean.aCountry"></s:textfield>
		<s:textfield key="registerBean.aZipCode"></s:textfield>
		
		<s:textfield key="registerBean.aContactNo1"></s:textfield>
		<s:textfield key="registerBean.aContactNo2"></s:textfield>
		
		<br><br>
		
		<s:label for="guardian_information" value="Guardian Information"></s:label>
		<s:label for="guardianseparator" value="-------------------------"></s:label>
		<s:textfield key="registerBean.gGuardianName" ></s:textfield>
		<s:textfield key="registerBean.gAddressLine1"></s:textfield>
		<s:textfield key="registerBean.gAddressLine2"></s:textfield>
		<s:textfield key="registerBean.gCity"></s:textfield>
		<s:textfield key="registerBean.gState"></s:textfield>
		<s:textfield key="registerBean.gCountry"></s:textfield>
		<s:textfield key="registerBean.gZipCode"></s:textfield>
		
		<s:textfield key="registerBean.gContactNo1"></s:textfield>
		<s:textfield key="registerBean.gContactNo2"></s:textfield>
		
		<br><br>
		
		<s:label for="admission_details" value="Admission Details"></s:label>
		<s:label for="admissionseparator" value="-------------------------"></s:label>
		
		<s:textfield key="registerBean.aIITJEERank"></s:textfield>
		
		<s:textfield key="registerBean.a12thPercentage"></s:textfield>
		<s:textfield key="registerBean.a10thPercentage"></s:textfield>
		
		<s:submit key="submit"></s:submit>
	</s:form>
</body>
</html>