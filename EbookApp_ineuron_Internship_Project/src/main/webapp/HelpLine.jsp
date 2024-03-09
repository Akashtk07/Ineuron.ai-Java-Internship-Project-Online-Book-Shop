<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>helpline Number</title>
<%@include file="all_components/allCss.jsp"%>

</head>
<body>
	<c:if test="${empty userobj}">
		<c:redirect url="login.jsp"></c:redirect>
	</c:if>
	<%@include file="all_components/Navbar.jsp"%>

	<div class="container">
		<div class="row p-5">
			<div class="col-md-4 offset-md-4 text-center">
				<div class="text-success ">
					<i class="fa-solid fa-headset fa-5x"></i>
				</div>
				<h3>24 * 7</h3>
				<h4>Help Line Number</h4>
				<h5>+911234567891</h5>
				<a href="index.jsp" class="btn btn-primary">Home</a>
			</div>
		</div>

	</div>


</body>
</html>