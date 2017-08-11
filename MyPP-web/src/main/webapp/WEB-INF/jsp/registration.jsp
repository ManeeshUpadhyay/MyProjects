<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<form:form method="POST" action="saveRegistration.do" modelAttribute="RegistrationDto"
		>
		<table width="100%" height="100%" border="1" cellspacing="0"
			cellpadding="0">
			<tr>
				<td align="center">Enter Your First Name :</td>
				<td align="center"><form:input path="firstName" id="firstName" /></td>
			</tr>

			<tr>
				<td align="center">Enter Your Last Name :</td>
				<td align="center"><form:input path="lastName" id="lastName" /></td>
			</tr>

			<tr>
				<td align="center">Enter Your Contact No. :</td>
				<td align="center"><form:input path="contact" id="contact" /></td>
			</tr>
			<tr>
				<td align="center">Enter Your Address :</td>
				<td align="center"><form:textarea path="address" id="address" /></td>
			</tr>

			<tr>
				<td align="center">Enter Your EmailId :</td>
				<td align="center"><form:input path="emailId" id="emailId" /></td>
			</tr>

			<tr>
				<td align="center">Enter Your Password :</td>
				<td align="center"><form:password path="password" id="password" />
				</td>
			</tr>

			<tr>
				<td align="center" colspan="2"><input type="submit" value="Submit"></td>

			</tr>

		</table>
	</form:form>
</body>
</html>