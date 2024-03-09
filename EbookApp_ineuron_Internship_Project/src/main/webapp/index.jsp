<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.entity.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ebook</title>
<%@include file="all_components/allCss.jsp"%>
<style>
.back-img {
	background: url("img/book.jpg");
	height: 50vh;
	width: 100%;
	background-size: cover;
	background-repeat: no-repeat;
}

.crd-ho:hover {
	background-color: #f7f7f7;
	"
}
</style>
</head>
<body style="background-color: #f7f7f7;">

	<%
	User u = (User) session.getAttribute("userobj");
	%>

	<%@include file="all_components/Navbar.jsp"%>
	<div class="container-fluid back-img">
		<h2 class="text-center text-danger">Ebook Management System</h2>
	</div>

	<%@ page import="com.DB.*, java.util.*, java.io.*,java.sql.*"%>

	<!-- Start Recent Book -->

	<div class="container">
		<h3 class="text-center">Recent Book</h3>
		<div class="row">

			<%@ page import="com.DAO.BooksDAOimpl,com.entity.Book_Details"%>

			<%
			BooksDAOimpl dao1 = new BooksDAOimpl(DBConnect.getConn());
			List<Book_Details> list1 = dao1.getRecentBooks();
			for (Book_Details b : list1) {
			%>

			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="Book/<%=b.getPhoto()%>"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p><%=b.getBookname()%></p>
						<p><%=b.getAuthor()%></p>

						<%
						if (b.getBookcategory().equals("Old")) {
						%>
						<p>
							Categories:<%=b.getBookcategory()%></p>
						<div class="row ">
							<a href="View_Books.jsp?bid=<%=b.getBook_id()%>"
								class="btn btn-success btn-sm ml-5">Details <i
								class="fa-solid fa-circle-info"></i></a> <a href=""
								class="btn btn-danger btn-sm ml-1"><%=b.getPrice()%> <i
								class="fa-solid fa-indian-rupee-sign"></i></a>
						</div>

						<%
						} else {
						%>

						<p>
							Categories:<%=b.getBookcategory()%></p>
						<div class="row ">

							<%
							if (u == null) {
							%>
							<a href="login.jsp" class="btn btn-primary btn-sm ml-2"><i
								class="fa-solid fa-cart-plus"></i>Add Cart</a> 
							<%
							} else {
							%>
							<a href="cart?bid=<%=b.getBook_id()%>&&uid=<%=u.getId()%>"
								class="btn btn-primary btn-sm ml-2"><i
								class="fa-solid fa-cart-plus"></i>Add Cart</a>
							<%
							}
							%>
							<a href="View_Books.jsp?bid=<%=b.getBook_id()%>"
								class="btn btn-success btn-sm ml-1">Details <i
								class="fa-solid fa-circle-info"></i></a> <a href=""
								class="btn btn-danger btn-sm ml-1"><%=b.getPrice()%> <i
								class="fa-solid fa-indian-rupee-sign"></i></a>
						</div>

						<%
						}
						%>



					</div>
				</div>

			</div>

			<%
			}
			%>

		</div>
		<div class="text-center mt-1">
			<a href="All_Recent_Books.jsp"
				class="btn btn-danger btn-sm text-white">View All</a>
		</div>
	</div>

	<!-- End Recent Book -->
	<hr>

	<!-- Start New Book -->

	<div class="container">
		<h3 class="text-center">New Book</h3>
		<div class="row">


			<%@ page import="com.DAO.BooksDAOimpl,com.entity.Book_Details"%>

			<%
			BooksDAOimpl dao = new BooksDAOimpl(DBConnect.getConn());
			List<Book_Details> list = dao.getNewBook();
			for (Book_Details b : list) {
			%>
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="Book/<%=b.getPhoto()%>"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p><%=b.getBookname()%></p>
						<p><%=b.getAuthor()%></p>
						<p>
							Categories:<%=b.getBookcategory()%>
						</p>
						<div class="row ">
							<%
							if (u == null) {
							%>
							<a href="login.jsp" class="btn btn-primary btn-sm ml-1"><i
								class="fa-solid fa-cart-plus"></i>Add Cart</a>
							<%
							} else {
							%>
							<a href="cart?bid=<%=b.getBook_id()%>&&uid=<%=u.getId()%>"
								class="btn btn-primary btn-sm ml-2"><i
								class="fa-solid fa-cart-plus"></i>Add Cart</a>
							<%
							}
							%>


							<a href="View_Books.jsp?bid=<%=b.getBook_id()%>"
								class="btn btn-success btn-sm ml-1">Details <i
								class="fa-solid fa-circle-info"></i></a> <a href=""
								class="btn btn-danger btn-sm ml-1"><%=b.getPrice()%> <i
								class="fa-solid fa-indian-rupee-sign"></i></a>
						</div>
					</div>
				</div>
			</div>

			<%
			}
			%>



		</div>
		<div class="text-center mt-1">
			<a href="All_New_Books.jsp" class="btn btn-danger btn-sm text-white">View
				All</a>
		</div>
	</div>

	<!-- End New Book -->
	<hr>
	<!-- Start Old Book -->

	<div class="container">
		<h3 class="text-center">Old Book</h3>
		<div class="row">

			<%@ page import="com.DAO.BooksDAOimpl,com.entity.Book_Details"%>

			<%
			BooksDAOimpl dao2 = new BooksDAOimpl(DBConnect.getConn());
			List<Book_Details> list2 = dao2.getOldBook();
			for (Book_Details b : list2) {
			%>

			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body text-center">
						<img alt="" src="Book/<%=b.getPhoto()%>"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p><%=b.getBookname()%></p>
						<p><%=b.getAuthor()%></p>
						<p>
							Categories:<%=b.getBookcategory()%></p>
						<div class="row ">
							<a href="View_Books.jsp?bid=<%=b.getBook_id()%>"
								class="btn btn-success btn-sm ml-5">Details <i
								class="fa-solid fa-circle-info"></i></a> <a href=""
								class="btn btn-danger btn-sm ml-1"><%=b.getPrice()%> <i
								class="fa-solid fa-indian-rupee-sign"></i></a>
						</div>
					</div>
				</div>
			</div>

			<%
			}
			%>

		</div>
		<div class="text-center mt-1">
			<a href="All_Old_Books.jsp" class="btn btn-danger btn-sm text-white">View
				All</a>
		</div>
	</div>

	<!-- End Old Book -->

	<%@include file="all_components/footer.jsp"%>

</body>
</html>