<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sell Old Books</title>
<%@include file="all_components/allCss.jsp"%>

</head>

<body style="background-color: #f0f1f2;">
	<c:if test="${empty userobj}">
		<c:redirect url="login.jsp"></c:redirect>
	</c:if>
	
	<%@include file="all_components/Navbar.jsp"%>


	<div class="container">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">
					<h5 class="text-center text-primary">Sell Old Books</h5>
					
						<c:if test="${not empty successMSG }">
						<p class="text-center text-success">${successMSG }</p>
						<c:remove var="successMSG" scope="session"/>
						</c:if>
					
						<c:if test="${not empty FailedMSG }">
						<p class="text-center text-danger">${FailedMSG }</p>
						<c:remove var="FailedMSG" scope="session"/>
						</c:if>

						<form action="add_old_book" method="post" enctype="multipart/form-data">
						
						<input type="hidden" value="${userobj.email }" name="user">
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
								<label for="exampleformControlfile1">Upload Photo</label> <input
									name="bimg" type="file" class="form-control-file"
									id="exampleFormControlFile1" />
							</div>

							<!-- 							<button type="submit" class="btn btn-primary">Add</button>
 -->
							<c:if test="${not empty userobj }">
								<button type="submit" class="btn btn-primary">Sell</button>
							</c:if>
						</form>

					</div>

				</div>

			</div>

		</div>


	</div>









	<%@include file="all_components/footer.jsp"%>
</body>
</html>