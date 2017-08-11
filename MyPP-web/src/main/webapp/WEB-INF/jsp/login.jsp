<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login </title>
<script src="/WEB-INF/jquery/jquery-3.2.1.js" ></script>
<script src="/WEB-INF/js/login.js" ></script>
</head>
<body>
	<form:form method="POST" action="saveLogin.do" modelAttribute="UserLoginDto">
		<table width="100%" border="1" bgcolor="#656589">
			<tr>
				<td align="center" >Email Id :</td>
				<td align="center"><form:input path="emailId" id="emailId"></form:input>
				<form:errors path="emailId" class="required" cssStyle="color:pink"></form:errors>
				</td>
			</tr>
		<tr>
				<td align="center" >Password :</td>
				<td align="center"><form:password path="password" id="password"></form:password>
				<form:errors path="password" class="required" cssStyle="color:pink"></form:errors>
				</td>
			</tr>
		<tr>
		<td  align="center"><input type="submit" value="Login"></td>
		<td  align="center"><a href="registration.do" style="color:#FFFFFF; display: block; height: 30px;width: 30px; list-style: none ">Register</a></td>
		</tr>
		</table>

	</form:form>
</body>
</html>