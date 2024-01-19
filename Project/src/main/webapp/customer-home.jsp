<%@page import="dao.ProductDao"%>
<%@page import="model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="customer-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Products Start -->
	<%List<Product> list = ProductDao.getAllProducts(); %>
	
	<div class="container-fluid pt-5 pb-3">
		<h2
			class="section-title position-relative text-uppercase mx-xl-5 mb-4">
			<span class="bg-secondary pr-3">Products</span>
		</h2>
		<div class="row px-xl-5">
		<%for(Product p:list){ %>
			<div class="col-lg-3 col-md-4 col-sm-6 pb-1">
				<div class="product-item bg-light mb-4">
					<div class="product-img position-relative overflow-hidden">
						<img class="img-fluid w-100" src="image/<%=p.getImage() %>" alt="">
						<div class="product-action">
							<a class="btn btn-outline-dark btn-square" href="c-single-product.jsp?id=<%=p.getPid()%>"><i
								class="fa fa-shopping-cart"></i></a>
							<a class="btn btn-outline-dark btn-square" href="c-single-product.jsp?id=<%=p.getPid()%>"><i
								class="far fa-heart"></i></a> 
						</div>
					</div>
					<div class="text-center py-4">
						<a class="h6 text-decoration-none text-truncate" href=""><%=p.getPname() %></a>
						<div class="d-flex align-items-center justify-content-center mt-2">
							<h5>Rs. <%=p.getPprice() %></h5>
							
						</div>
						
					</div>
				</div>
			</div>
			<%} %>
		</div>
	</div>
</body>
</html>