<%@page import="com.entity.Book_Details"%>
<%@page import="java.util.List"%>
<%@page import="com.DB.DBConnect"%>
<%@page import="com.DAO.BooksDAOimpl,com.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Old Books</title>
<%@include file="all_components/allCss.jsp"%>

</head>
<body style="background-color: #f7f7f7;">
	<%@include file="all_components/Navbar.jsp"%>
	<c:if test="${empty userobj}">
		<c:redirect url="login.jsp"></c:redirect>
	</c:if>

					<c:if test="${not empty SuccessMSG}" >
					
					<p class="text-center text-success">${SuccessMSG}</p>
					
					<c:remove var="SuccessMSG" scope = "session"/>
					
					</c:if>
					
					
					<c:if test="${not empty FailedMSG } ">
					
					<p class="text-center text-danger"> ${ FailedMSG } </p>
					<c:remove var="FailedMSG" scope = "session"/>
					
					</c:if>

	<div class="container p-5">
		<table class="table table-striped">
			<thead class="bg-primary text-white">
				<tr>
					<th scope="col">Book Name</th>
					<th scope="col">Author</th>
					<th scope="col">Price</th>
					<th scope="col">Category</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>

				<%
				User u=(User)session.getAttribute("userobj");
				String Email=u.getEmail();
				String category = "Old";
			BooksDAOimpl dao = new BooksDAOimpl(DBConnect.getConn());
				List<Book_Details> list=dao.getAllOldBooksByUser(Email,category);
				
				for(Book_Details b : list)
				{%>
				
					<tr>
					<td><%= b.getBookname() %></td>
					<td><%= b.getAuthor() %></td>
					<td><%= b.getPrice() %></td>
					<td><%= b.getBookcategory() %></td>
					<td><a href="DeleteOldBookServlet?em=<%=b.getEmail() %>&&bookId=<%=b.getBook_id() %>" class="btn btn-sm btn-danger">Delete</a></td>
				</tr>
					
					
			<% }%>
				
			</tbody>
		</table>


	</div>



</body>
</html>