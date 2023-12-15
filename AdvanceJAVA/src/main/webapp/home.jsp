<%@page import="java.util.List"%>
<%@page import="dao.UserDao"%>
<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  </head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
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
<div class="container">
<table class="table">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">contact</th>
      <th scope="col">Address</th>
      <th scope="col">Email</th>
      <th scope="col">Password</th>
      <th scope="col">Edit</th>
      <th scope="col">Delete</th>
    </tr>
  </thead>
  <tbody>
  <%List<User> list = UserDao.getAllUser(); %>
  <%for(User u1:list){ %>
    <tr>
    	<td><%=u1.getId() %></td>
    	<td><%=u1.getName() %></td>
    	<td><%=u1.getContact() %></td>
    	<td><%=u1.getAddress() %></td>
    	<td><%=u1.getEmail() %></td>
    	<td><%=u1.getPassword() %></td>
    	<td>
    		<form action="UserController" method="post">
    			<input type="hidden" name="id" value="<%=u1.getId()%>">
    			<input type="submit" name="action" value="edit">
    		</form>
    	</td>
    	<td>
    		<form action="UserController" method="post">
    			<input type="hidden" name="id" value="<%=u1.getId()%>">
    			<input type="submit" name="action" value="delete">
    		</form>
    	</td>
    </tr>
  <%} %>
  </tbody>
</table>
</div>



<h1><a href="logout.jsp">Logout</a></h1>
</body>
</html>