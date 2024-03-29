<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	welcome home page
	<%int id  = (Integer)request.getAttribute("id"); %>
	<%out.print(id);%>
	<%String name = (String)request.getAttribute("name"); %>
	<%out.print(name); %>
</body>
</html>