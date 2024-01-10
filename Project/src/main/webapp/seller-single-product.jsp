<%@page import="dao.ProductDao"%>
<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="seller-header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%int id = Integer.parseInt(request.getParameter("id")); %>
<%Product p = ProductDao.getProductByPid(id); %>

    <!-- Contact Start -->
    <div class="container-fluid">
        <h2 class="section-title position-relative text-uppercase mx-xl-5 mb-4"><span class="bg-secondary pr-3">Seller Upload Product</span></h2>
        <div class="row px-xl-5">
            <div class="col-lg-7 mb-5">
                <div class="contact-form bg-light p-30">
                    <div id="success"></div>
                    <form action="ProductController" method="post" name="sentMessage" enctype="multipart/form-data">
                       	 <input type = "hidden" name="pid" value="<%=p.getPid()%>">
                       	 <div class="control-group">
                            <img src= "image/<%=p.getImage()%>"> 
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                            <input type="file" class="form-control" id="email" name="image" 
                                required="required" data-validation-required-message="Please enter your email" />
                            <p class="help-block text-danger"></p>
                        </div>
                          <div class="control-group">
                            <input type="text" class="form-control" id="email" name="pname" value="<%=p.getPname() %>"
                                required="required" data-validation-required-message="Please enter your email" />
                            <p class="help-block text-danger"></p>
                        </div>
                         <div class="control-group">
                            <input type="text" class="form-control" id="email" name="pprice" value="<%=p.getPprice() %>"
                                required="required" data-validation-required-message="Please enter your email" />
                            <p class="help-block text-danger"></p>
                        </div>
                         <div class="control-group">
                            <input type="text" class="form-control" id="email" name="pcategory" value="<%=p.getPcategory() %>"
                                required="required" data-validation-required-message="Please enter your email" />
                            <p class="help-block text-danger"></p>
                        </div>
                         <div class="control-group">
                            <input type="text" class="form-control" id="email" name="pdesc" value="<%=p.getPdesc()%>"
                                required="required" data-validation-required-message="Please enter your email" />
                            <p class="help-block text-danger"></p>
                        </div>
                        <div>
                            <button class="btn btn-primary py-2 px-4" type="submit" name="action" value="update" id="sendMessageButton">UPDATE
                                </button>
                        </div>
                      
                    </form>
                </div>
            </div>
           
        </div>
    </div>
    <!-- Contact End -->
</body>
</html>