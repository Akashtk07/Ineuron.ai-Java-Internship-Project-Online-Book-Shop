<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Success</title>
<%@include file="all_components/allCss.jsp"%>
</head>
<body>
	<%@include file="all_components/Navbar.jsp"%>

	<div class="container text-center mt-3">

		<i class="fas fa-check-circle fa-5x text-success"></i>
		<h1>Thank You</h1>
		<h2>Your Order Successfully Placed</h2>
		<h5>With in 7 Days Your Product will be Delivered In Your Address</h5>
		<a href="index.jsp" class="btn btn-primary mt-3">Home</a> <a
			href="Order.jsp" class="btn btn-danger mt-3"> View Order </a>
	</div>

</body>
</html>