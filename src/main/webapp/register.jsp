<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>University Registration Page</title>
	<link href="<s:url value ="style.css"/>" rel="stylesheet" type="text/css"/>
	 <style type="text/css">
		
		
	</style>
<sb:head/>
</head>
<body>
	<h2>Register yourself for the University</h2>
	<hr>
    <div class="container">
			<div class="row">
				<div class="col-lg-2"></div>
				<div class="col-lg-8">
					<s:form action="add" enctype="multipart/form-data" theme="bootstrap" cssClass="form-horizontal">
					<s:label for="personal_information" value="Personal Information" cssClass="center" class="center"></s:label>
					<s:label for="piseparator" value="-------------------------" cssClass="center"></s:label>
		
					<s:textfield key="registerBean.firstNameStudent" ></s:textfield>
					<s:textfield key="registerBean.middleNameStudent" ></s:textfield>
					<s:textfield key="registerBean.lastNameStudent" ></s:textfield>
		
					<s:textfield key="registerBean.dateOfBirthStudent" ></s:textfield>
					<s:textfield key="registerBean.emailStudent"></s:textfield>
					<s:radio key="registerBean.genderStudent" list="genders"/>
					<s:textfield key="registerBean.nationalityStudent"></s:textfield>
					<s:textfield key="registerBean.addressLine1Student"></s:textfield>
					<s:textfield key="registerBean.addressLine2Student"></s:textfield>
					<s:textfield key="registerBean.cityStudent"></s:textfield>
					<s:textfield key="registerBean.stateStudent"></s:textfield>
					<s:textfield key="registerBean.countryStudent"></s:textfield>
					<s:textfield key="registerBean.zipCodeStudent"></s:textfield>
		
					<s:textfield key="registerBean.contactNo1Student"></s:textfield>
					<s:textfield key="registerBean.contactNo2Student"></s:textfield>
		
					<br>
		
					<%-- <s:label for="guardian_information" value="Guardian Information" cssClass="center"></s:label>
					<s:label for="guardianseparator" value="-------------------------" cssClass="center"></s:label> --%>
					<s:textfield key="registerBean.guardianName" ></s:textfield>
					<s:textfield key="registerBean.addressLine1Guardian"></s:textfield>
					<s:textfield key="registerBean.addressLine2Guardian"></s:textfield>
					<s:textfield key="registerBean.cityGuardian"></s:textfield>
					<s:textfield key="registerBean.stateGuardian"></s:textfield>
					<s:textfield key="registerBean.countryGuardian"></s:textfield>
					<s:textfield key="registerBean.zipCodeGuardian"></s:textfield>
		
					<s:textfield key="registerBean.contactNo1Guardian"></s:textfield>
					<s:textfield key="registerBean.contactNo2Guardian"></s:textfield>
		
					<br>
		
					<%-- <s:label for="admission_details" value="Admission Details" cssClass="center"></s:label>
					<s:label for="admissionseparator" value="-------------------------" cssClass="center"></s:label> --%>
		
					<s:textfield key="registerBean.iitjeeRank"></s:textfield>
		
					<s:textfield key="registerBean.percentage12th"></s:textfield>
					<s:textfield key="registerBean.percentage10th"></s:textfield>
		
					<br>
		
					<%-- <s:label for="login_details" value="Login Details" cssClass="center"></s:label>
					<s:label for="admissionseparator" value="-------------------------" cssClass="center"></s:label> --%>
					<s:textfield key="registerBean.password"></s:textfield>
		
					<s:submit key="submit" cssClass="btn btn-primary btn-large" id="saveButton"></s:submit>
				</s:form>
				</div>
			</div>
		</div>
	
</body>
</html>