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
	<c:if test="${empty userobj }">
	<c:redirect url="../login.jsp"/>
	</c:if>
	<%@include file="Navbar.jsp"%>

	<div class="container">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center">Edit Books</h4>
						
						
						
						<%@page import="com.DAO.BooksDAOimpl,com.DB.DBConnect, com.entity.Book_Details" %>
												
						<%
						int id =Integer.parseInt(request.getParameter("id"));
						BooksDAOimpl dao = new BooksDAOimpl(DBConnect.getConn());
						Book_Details b=dao.getBookById(id);
						
						%>

						<form action="../edit_books" method="post">
						<input type="hidden" name="id" value="<%= b.getBook_id() %>"/>

							<div class="form-group">
								<label for="exampleInputEmail1"> Book Name*</label> <input
									name="bname" type="text" class="form-control"
									id="exampleInputEmail1" aria.describedby="emailHelp" value="<%= b.getBookname() %>">
							</div>

							<div class="form-group">
								<label for="exampleInputEmail1"> Author Name*</label> <input
									name="author" type="text" class="form-control"
									id="exampleInputEmail1" aria.describedby="emailHelp" value="<%= b.getAuthor() %>">
							</div>

							<div class="form-group">
								<label for="exampleInputPassword1"> Price*</label> <input
									name="price" type="number" class="form-control"
									id="exampleInputPassword1" value="<%= b.getPrice() %>">
							</div>

							<div class="form-group">
								<label for="inputState">Book Status</label> <select
									id="inputState" name="status" class="form-control">
									
									<% 
									if("Active".equals(b.getStatus())) 
									{%>
										
										<option value="Active">Active</option>
										<option value="Inactive">Inactive</option>
										
									<%
									}else{%>
										
										<option value="Inactive">Inactive</option>
										<option value="Active">Active</option>
										
									<%}
									%>
									
								</select>
							</div>

							<button type="submit" class="btn btn-primary">Update</button>

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