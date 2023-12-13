<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
User u =null;
if(session.getAttribute("user")!=null){
	u = (User)session.getAttribute("user");
}
%>
<h2>name : <%=u.getName() %></h2>
<h2>contact : <%=u.getContact() %></h2>
<h2>address : <%=u.getAddress() %></h2>
<h2>Email : <%=u.getEmail() %></h2>
<h2>Password : <%=u.getPassword() %></h2>

<h1><a href="logout.jsp">Logout</a></h1>
</body>
</html>