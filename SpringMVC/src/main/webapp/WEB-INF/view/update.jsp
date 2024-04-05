<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>
	<h1 class ="text-center">Hello, world!</h1>
	<div class ="container">
	<form action="${pageContext.request.contextPath}/add" method="post">
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">
				Id</label> <input type="text" name="id" value="${u.id }" class="form-control"
				id="exampleInputEmail1" aria-describedby="emailHelp">
			
		</div>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">
				Name</label> <input type="text" name="name" value="${u.name }" class="form-control"
				id="exampleInputEmail1" aria-describedby="emailHelp">
			
		</div>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">
				Contact</label> <input type="text" name="contact" value="${u.contact }" class="form-control"
				id="exampleInputEmail1" aria-describedby="emailHelp">
			
		</div>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">
				Address</label> <input type="text" name="address" value="${u.address }" class="form-control"
				id="exampleInputEmail1" aria-describedby="emailHelp">
			
		</div>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Email
				address</label> <input type="email" name="email" value="${u.email }" class="form-control"
				id="exampleInputEmail1" aria-describedby="emailHelp">
			
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Password</label>
			<input type="password" class="form-control" value="${u.password }" name="password"
				id="exampleInputPassword1">
		</div>
		
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
	
	</div>
	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
</body>
</html>
