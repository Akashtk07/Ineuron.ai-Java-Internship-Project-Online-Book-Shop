<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Settings</title>
<%@include file="all_components/allCss.jsp"%>
<style type="text/css">
a {
	text-decoration: none;
	color: black;
}

a.hover {
	text-decoration: none;
}
</style>
</head>
<body style="background-color: #f7f7f7;">


		<c:if test="${empty userobj}">
		<c:redirect url="login.jsp"></c:redirect>
	</c:if>
	

	<%@include file="all_components/Navbar.jsp"%>
	<div class="container">
			<h3 class="text-center">Hello,${userobj.name}</h3>

		<div class="row p-5">
			<div class="col-md-4">
				<a href="Sell_Old_Book.jsp">
					<div class="card">
						<div class="card-body text-center">
							<div class="text-primary">
								<i class="fa-solid fa-book-open fa-3x"></i>
							</div>
							<h3>Sell Old Books</h3>

						</div>
					</div>
				</a>
			</div>
			
						<div class="col-md-4">
				<a href="Old_Books.jsp">
					<div class="card">
						<div class="card-body text-center">
							<div class="text-primary">
								<i class="fa-solid fa-book-open fa-3x"></i>
							</div>
							<h3>Old Book</h3>

						</div>
					</div>
				</a>
			</div>

			<div class="col-md-4">
				<a href="Edit_Profile.jsp">
					<div class="card">
						<div class="card-body text-center">
							<div class="text-primary">
								<i class="fa-solid fa-pen-to-square fa-3x"></i>
							</div>
							<h4>Edit Profile</h4>

						</div>
					</div>
				</a>
			</div>


<!-- 			<div class="col-md-4 mt-3">
				<a href="User_Address.jsp">
					<div class="card">
						<div class="card-body text-center">
							<div class="text-warning">
								<i class="fa-solid fa-location-dot fa-3x"></i>
							</div>
							<h4>Your Address</h4>
							<p>Edit Address</p>
						</div>
					</div>
				</a>
			</div> -->


			<div class="col-md-6 mt-3">
				<a href="Order.jsp">
					<div class="card">
						<div class="card-body text-center">
							<div class="text-danger">
								<i class="fa-solid fa-box-open fa-3x"></i>
							</div>
							<h4>My Order</h4>
							<p>Track Your Order</p>
						</div>
					</div>
				</a>
			</div>

			<div class="col-md-6 mt-3">
				<a href="HelpLine.jsp">
					<div class="card">
						<div class="card-body text-center">
							<div class="text-danger">
								<i class="fas fa-user-circle fa-3x"></i>
							</div>
							<h4>Help Center</h4>
							<p>24*7 Service</p>
						</div>
					</div>
				</a>
			</div>


		</div>
	</div>

	<%@include file="all_components/footer.jsp"%>

</body>
</html>