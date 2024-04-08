<%@page import="bean.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	StudentBean s = (StudentBean) request.getAttribute("s");
%>
<center>
<form action="ActionController" method ="post">
<h1>Registration Form</h1>
	<table>
		<tr>
			<td>Id</td>
			<td><input type = "text" name ="id" value="<%= s.getId() %>"></td>
		</tr>
		<tr>
			<td>Firstname</td>
			<td><input type = "text" name ="fname" value ="<%= s.getFname() %>"></td>
		</tr>
		<tr>
			<td>Lastname</td>
			<td><input type = "text" name ="lname" value ="<%=s.getLname()%>"></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type = "text" name ="email" value ="<%=s.getEmail()%>"></td>
		</tr>
		<tr>
			<td>Contact</td>
			<td><input type = "text" name ="contact" value ="<%=s.getContact()%>"></td>
		</tr>
		<tr>
			<td><input type = "Submit" name ="action" value ="Update"></td>
		</tr>
	</table>
</form>
</center>

</body>
</html>