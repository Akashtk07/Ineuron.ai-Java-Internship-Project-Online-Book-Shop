<%@page import="java.util.List"%>
<%@page import="com.entity.cart"%>
<%@page import="com.DB.DBConnect"%>
<%@page import="com.DAO.CartDAOimpl,com.entity.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="all_components/allCss.jsp"%>
</head>
<body style="background-color: #f0f1f2">
	<%@include file="all_components/Navbar.jsp"%>
	

	<c:if test="${not empty SuccessMSG }">
	<div class="alert alert-success text-center" role="alert">
	${ SuccessMSG}
</div>

<c:remove var="SuccessMSG" scope="session"></c:remove>
	</c:if>
	
<c:if test="${not empty FailedMSG }">
	<div class="alert alert-danger text-center" role="alert">
	${FailedMSG}
</div>

<c:remove var="FailedMSG" scope="session"></c:remove>
	</c:if>

	<c:if test="${empty userobj}">
		<c:redirect url="login.jsp"></c:redirect>
	</c:if>

	<div class="container">
		<div class="row p-2">
			<div class="col-md-6">
				<div class="card bg-white">
					<div class="card-body">
						<h3 class="text-center text-success">Your Selected Items</h3>

						<table class="table table-striped">
							<thead>
								<tr>
									<th scope="col">Book Name</th>
									<th scope="col">Author</th>
									<th scope="col">Price</th>
									<th scope="col">Action</th>
								</tr>
							</thead>
							<tbody>
								<%
								User u=(User)session.getAttribute("userobj");
							CartDAOimpl dao=new CartDAOimpl(DBConnect.getConn());
								List<cart> Cart=dao.getBookByUser(u.getId());
								double totalPrice=0.00;
								for(cart c : Cart){
									totalPrice+=c.getPrice();
								%>
								<tr>
									<th scope="row"><%= c.getBookName() %></th>
									<td><%= c.getAuthor() %></td>
									<td><%= c.getPrice() %></td>
									<td><a href="RemoveBookCart?bid=<%= c.getBid() %>&&uid=<%= c.getUid() %>&&cid=<%= c.getCid() %>" class="btn btn-sm btn-danger">Remove</a></td>
								</tr>										
							<%	}
							%>
							
							<tr>
							<td>Total Price</td>
							<td></td>
							<td></td>
							<td><%= totalPrice %></td>
							</tr>

							</tbody>
						</table>

					</div>
				</div>

			</div>

			<div class="col-md-6">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center text-success">Your Details For Order</h3>
						<form action="order" method="post">
							<div class="form-row">
							<input type="hidden" value="${userobj.id }" name="id">

								<div class="form-group col-md-6">
									<label for="inputEmail4">Name</label> <input type="text" name="uname"
										class="form-control" id="inputEmail4" value="<%= u.getName() %>" required>
								</div>

								<div class="form-group col-md-6">
									<label for="inputPassword4">Email</label> <input type="email" name="uemail"
										class="form-control" id="inputPassword4" value="<%= u.getEmail() %>" required>
								</div>

								<div class="form-group col-md-6">
									<label for="inputEmail4">Phone Number</label> <input
										type="number" name="phno" class="form-control" id="inputEmail4" value="<%= u.getPhone_NO() %>" required>
								</div>

								<div class="form-group col-md-6">
									<label for="inputPassword4">Address</label> <input type="text" name="address"
										class="form-control" id="inputPassword4" value="<%= u.getAddress() %>" required>
								</div>

								<div class="form-group col-md-6">
									<label for="inputEmail4">Landmark</label> <input type="text" name="landmark"
										class="form-control" id="inputEmail4" value="<%= u.getLandmark() %>" required>
								</div>

								<div class="form-group col-md-6">
									<label for="inputPassword4">City</label> <input type="text" name="city"
										class="form-control" id="inputPassword4" value="<%= u.getCity() %>" required>
								</div>

								<div class="form-group col-md-6">
									<label for="inputEmail4">State</label> <input type="text" name="state"
										class="form-control" id="inputEmail4" value="<%= u.getState() %>" required>
								</div>

								<div class="form-group col-md-6">
									<label for="inputPassword4">Pin Code</label> <input type="text" name="pincode"
										class="form-control" id="inputPassword4" value="<%= u.getPincode() %>"required>
								</div>
							</div>

							<div class="form-group">
								<label>Payment Mode</label> <select class="form-control" name="payment">
									<option value="NOSelect">---select---</option>
									<option value="COD">Cash On Delivery</option>
								</select>
							</div>

							<div class="text-center">
								<button class="btn btn-warning">Order Now</button>
								<a href="index.jsp" class="btn btn-success">Continue
									Shopping</a>
							</div>

						</form>
					</div>
				</div>
			</div>

		</div>

	</div>
</body>
</html>