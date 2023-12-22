<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="seller-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- Contact Start -->
	<div class="container-fluid">
		<h2
			class="section-title position-relative text-uppercase mx-xl-5 mb-4">
			<span class="bg-secondary pr-3">Seller Change Passwordd</span>
		</h2>
		<%String msg = (String)request.getAttribute("msg"); %>
		<%if(msg!=null){ %>
		<h5
			class="section-title position-relative text-uppercase mx-xl-5 mb-4">
			<span class="bg-secondary pr-3"><%out.print(msg); %></span>
		</h5>
		<%} %>
		<%String msg1 = (String)request.getAttribute("msg1"); %>
		<%if(msg1!=null){ %>
		<h5
			class="section-title position-relative text-uppercase mx-xl-5 mb-4">
			<span class="bg-secondary pr-3"><%out.print(msg1); %></span>
		</h5>
		<%} %>
		<div class="row px-xl-5">
			<div class="col-lg-7 mb-5">
				<div class="contact-form bg-light p-30">
					<div id="success"></div>
					<form action="SellerController" method="post">
						<div class="control-group">
							<input type="hidden" class="form-control" name="id" id="name"
								value="<%=s.getId()%>" required="required"
								data-validation-required-message="Please enter your name" />
							<p class="help-block text-danger"></p>
						</div>
						<div class="control-group">
							<input type="password" class="form-control" name="op" id="name"
								placeholder="Old Password" required="required"
								data-validation-required-message="Please enter your name" />
							<p class="help-block text-danger"></p>
						</div>
						<div class="control-group">
							<input type="password" class="form-control" name="np" id="name"
								placeholder="New Password" required="required"
								data-validation-required-message="Please enter your name" />
							<p class="help-block text-danger"></p>
						</div>
						<div class="control-group">
							<input type="password" class="form-control" name="cnp" id="name"
								placeholder="Confirm New Password" required="required"
								data-validation-required-message="Please enter your name" />
							<p class="help-block text-danger"></p>
						</div>
						<div>
							<button class="btn btn-primary py-2 px-4" name="action"
								value="change password" type="submit" id="sendMessageButton">Update
								Password</button>
						</div>
					</form>
				</div>
			</div>
			<div class="col-lg-5 mb-5">
				<div class="bg-light p-30 mb-30">
					<iframe style="width: 100%; height: 250px;"
						src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3001156.4288297426!2d-78.01371936852176!3d42.72876761954724!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4ccc4bf0f123a5a9%3A0xddcfc6c1de189567!2sNew%20York%2C%20USA!5e0!3m2!1sen!2sbd!4v1603794290143!5m2!1sen!2sbd"
						frameborder="0" style="border:0;" allowfullscreen=""
						aria-hidden="false" tabindex="0"></iframe>
				</div>
				<div class="bg-light p-30 mb-3">
					<p class="mb-2">
						<i class="fa fa-map-marker-alt text-primary mr-3"></i>123 Street,
						New York, USA
					</p>
					<p class="mb-2">
						<i class="fa fa-envelope text-primary mr-3"></i>info@example.com
					</p>
					<p class="mb-2">
						<i class="fa fa-phone-alt text-primary mr-3"></i>+012 345 67890
					</p>
				</div>
			</div>
		</div>
	</div>
	<!-- Contact End -->
</body>
</html>