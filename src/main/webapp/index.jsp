<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<title>Monsters University</title>
	<link rel="stylesheet" type="text/css" href="style.css">
	<style type="text/css">
		body{
			background-image: url("monsters_universit.jpg");
		}
	</style>
</head>
<body>
	<p>
		<a class="btnCustom" id="btn1" href="login.jsp" >Login</a>
	</p>
	<p>
		<a class="btnCustom" id="btn2" href="<s:url action="registerInput"/>" >Register</a>
		
	</p>
	
</body>
</html>
