<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="org.konach.mf.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>
	<h3>You've logged in successfully!</h3>

	<%-- <%User user = (User)request.getAttribute("user"); %> --%>

	<jsp:useBean id="user" class="org.konach.mf.dto.User" scope="request">
		<jsp:setProperty property="login" name="user" value="Uzytkownik" />
	</jsp:useBean>
	Hello
	<jsp:getProperty property="login" name="user"/>
</body>
</html>