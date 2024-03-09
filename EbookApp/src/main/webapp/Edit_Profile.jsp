<%@page import="com.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Profile</title>
<%@include file="all_components/allCss.jsp"%>

</head>
<body style="background-color: #f0f1f2">

	<c:if test="${empty userobj}">
		<c:redirect url="login.jsp"></c:redirect>
	</c:if>
	<%@include file="all_components/Navbar.jsp"%>
	<%
	User u = (User) session.getAttribute("userobj");
	%>

	<div class="container mt-5">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center text-primary">Edit Profile</h3>
						
							<c:if test="${not empty failMSG}">
							<h5 class="text-center text-danger">${failMSG}</h5>
							<c:remove var="failMSG" scope="session" />
						</c:if>
						
							<c:if test="${not empty FailMSG}">
							<h5 class="text-center text-danger">${FailMSG}</h5>
							<c:remove var="FailMSG" scope="session" />
						</c:if>


						<c:if test="${not empty succssMsg}">
							<h5 class="text-center text-success">${succssMsg}</h5>
							<c:remove var="succssMsg" scope="session" />
						</c:if>
						
						<form action="update_profile" method="post">

							<input type="hidden" value="${userobj.id }" name="id">

							<div class="form-group">

								<label for="exampleInputEmail1">Enter Full Name : </label> <input
									type="text" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" placeholder="Enter Full Name"
									required="required" name="fname" value="${ userobj.name}">

								<label for="exampleInputEmail1">Email address</label> <input
									type="email" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" placeholder="Enter Email"
									required="required" name="email" value="${ userobj.email}">

							</div>
							<div class="form-group">
								<label for="exampleInputEmail1 ">Phone Number</label> <input
									type="number" class="form-control" id="exampleInputEmail1"
									placeholder="Enter Phone Number" required="required"
									name="Phone_No" value="<%=u.getPhone_NO()%>">
							</div>

							<label for="exampleInputPassword1">Password</label> <input
								type="password" class="form-control" id="exampleInputPassword1"
								aria-describedby="emailHelp" placeholder="Enter Password"
								required="required" name="password">

							<button type="submit" class="btn btn-primary mt-2">Update</button>
						</form>

					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>