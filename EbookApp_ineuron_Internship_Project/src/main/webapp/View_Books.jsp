<%@page import="com.entity.User"%>
<%@page import="com.entity.Book_Details"%>
<%@page import="com.DAO.BooksDAOimpl"%>
<%@page import="com.DB.DBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="all_components/allCss.jsp"%>
</head>
<body style="background-color: #f0f1f2;">

	<%@include file="all_components/Navbar.jsp"%>
		<%
	User u = (User) session.getAttribute("userobj");
	%>

	<%
	int bid = Integer.parseInt(request.getParameter("bid"));
	BooksDAOimpl dao = new BooksDAOimpl(DBConnect.getConn());
	Book_Details b = dao.getBookById(bid);
	%>

	<div class="container pt-5">
		<div class="row ">

			<div class="col-md-6 p-5 text-center border bg-white ">
				<img alt="" src="Book/<%=b.getPhoto()%>"
					style="height: 200px; width: 150px"><br>
				<h4 class="mt-3">
					Book Name : <span class="text-success"><%=b.getBookname()%></span>
				</h4>
				<h4>
					Author Name :<span class="text-success"><%=b.getAuthor()%></span>
				</h4>
				<h4>
					Category :<span class="text-success"><%=b.getBookcategory()%></span>
				</h4>
			</div>

			<div class="col-md-6 p-5 text-center border bg-white ">
				<h2>
					Book Name :
					<%=b.getBookname()%></h2>

				<%
				if ("Old".equals(b.getBookcategory())) {
				%>
				<h5 class="text-primary">Contact TO Seller</h5>
				<h5 class="text-primary">
					<i class="fa-solid fa-envelope"></i>Email :
					<%=b.getEmail()%></h5>
				<%
				}
				%>

				<div class="row">
					<div class="col-md-4 text-danger text-center p-2">
						<i class="fa-solid fa-money-bill-wave fa-2x"></i>
						<p>Cash On Delivery</p>
					</div>
					<div class="col-md-4 text-danger text-center p-2">
						<i class="fa-solid fa-rotate-left fa-2x"></i>
						<p>Easy Return</p>
					</div>
					<div class="col-md-4 text-danger text-center p-2">
						<i class="fa-solid fa-truck fa-2x"></i>
						<p>Free Shipping</p>
					</div>

				</div>

				<%
				if ("Old".equals(b.getBookcategory())) {
				%>
				<div class="text-center p-3">
					<a href="index.jsp" class="btn btn-primary"><i
						class="fa-solid fa-cart-plus"></i>Continue Shopping</a> <a href=""
						class="btn btn-danger"><i
						class="fa-solid fa-indian-rupee-sign"></i><%=b.getPrice()%></a>

				</div>


				<%
				} else {
				%>
				<div class="text-center p-3">
											<%
							if (u == null) {
							%>
							<a href="login.jsp" class="btn btn-primary btn-sm ml-2 p-2"><i
								class="fa-solid fa-cart-plus"></i>Add Cart</a> 
							<%
							} else {
							%>
							<a href="cart?bid=<%=b.getBook_id()%>&&uid=<%=u.getId()%>"
								class="btn btn-primary btn-sm ml-2 p-2"><i
								class="fa-solid fa-cart-plus"></i>Add Cart</a>
							<%
							}
							%>
				
					<!-- <a href="" class="btn btn-primary"><i
						class="fa-solid fa-cart-plus"></i>Add Cart</a> --> <a href=""
						class="btn btn-danger"><i
						class="fa-solid fa-indian-rupee-sign"></i><%=b.getPrice()%></a>
				</div>

				<% }%>


			</div>

		</div>
	</div>

</body>
</html>