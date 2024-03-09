<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
  <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Add Books</title>
<%@include file="allCss.jsp"%>
</head>
<body style="background-color:#f0f1f2">
	<%@include file="Navbar.jsp"%>
	
	<!-- 	security code for unautorised access using url
 -->	<c:if test="${empty userobj }">
	<c:redirect url="../login.jsp"/>
	</c:if>

	<div class="container">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center">Add Books</h4>
						
						<c:if test="${not empty succmsg }">
						<p class="text-center text-success">${succmsg }</p>
						<c:remove var="succmsg" scope="session"/>
						</c:if>
					
						<c:if test="${not empty failmsg }">
						<p class="text-center text-danger">${failmsg }</p>
						<c:remove var="failmsg" scope="session"/>
						</c:if>
												
						

						<form action="../add_books" method="post"
							enctype="multipart/form-data">

							<div class="form-group">
								<label for="exampleInputEmail1"> Book Name*</label> <input
									name="bname" type="text" class="form-control"
									id="exampleInputEmail1" aria.describedby="emailHelp">
							</div>

							<div class="form-group">
								<label for="exampleInputEmail1"> Author Name*</label> <input
									name="author" type="text" class="form-control"
									id="exampleInputEmail1" aria.describedby="emailHelp">
							</div>

							<div class="form-group">
								<label for="exampleInputPassword1"> Price*</label> <input
									name="price" type="number" class="form-control"
									id="exampleInputPassword1">
							</div>

							<div class="form-group">
								<label for="inputState">Book Categories</label> <select
									id="inputState" name="categories" class="form-control">
									<option selected>--select--</option>
									<option value="New">New Book</option>
								</select>
							</div>

							<div class="form-group">
								<label for="inputState">Book Status</label> <select
									id="inputState" name="status" class="form-control">
									<option selected>--select--</option>
									<option value="Active">Active</option>
									<option value="Inactive">Inactive</option>
								</select>
							</div>

							<div class="form-group">
								<label for="exampleformControlfile1">Upload Photo</label> <input
									name="bimg" type="file" class="form-control-file"
									id="exampleFormControlFile1" />
							</div>

<!-- 							<button type="submit" class="btn btn-primary">Add</button>
 -->                        <c:if test="${not empty userobj }">
							<button type="submit" class="btn btn-primary">Add</button>
							</c:if>
						</form>


					</div>
				</div>
			</div>
		</div>
	</div>
	
	<div style="margin-top: 20px">
<%@include file="footer.jsp" %>
</div>
</body>
</html>