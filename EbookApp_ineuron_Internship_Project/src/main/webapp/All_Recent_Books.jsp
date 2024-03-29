<%@page import="com.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Recent Books</title>
<%@include file="all_components/allCss.jsp"%>
</head>
<body>
	<%
	User u = (User) session.getAttribute("userobj");
	%>
	<%@include file="all_components/Navbar.jsp"%>

	<div class="container-fluid">
		<div class="row p-3">
<!-- 			<div class="col-md-3"> -->
			
			<%@page import="com.DAO.BooksDAOimpl,com.entity.Book_Details,java.util.List,com.DB.DBConnect"%>

			<%
			BooksDAOimpl dao1 = new BooksDAOimpl(DBConnect.getConn());
			List<Book_Details> list1 = dao1.getAllRecentBooks();
			for (Book_Details b : list1) {
			%>

			<div class="col-md-3">
				<div class="card crd-ho mt-2">
					<div class="card-body text-center">
						<img alt="" src="Book/<%=b.getPhoto()%>"
							style="width: 100px; height: 150px" class="img-thumblin">
						<p><%=b.getBookname()%></p>
						<p><%=b.getAuthor()%></p>

						<%
						if (b.getBookcategory().equals("Old")) {
						%>
						<p>
							Categories:<%=b.getBookcategory()%></p>
						<div class="row ml-5">
							<a href="" class="btn btn-success btn-sm ml-4">Details <i
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
							<a href="login.jsp" class="btn btn-primary btn-sm ml-5 "><i
								class="fa-solid fa-cart-plus"></i>Add Cart</a> 
							<%
							} else {
							%>
							<a href="cart?bid=<%=b.getBook_id()%>&&uid=<%=u.getId()%>"
								class="btn btn-primary btn-sm ml-5"><i
								class="fa-solid fa-cart-plus"></i>Add Cart</a>
							<%
							}
							%>
							
						
							<!-- <a href="" class="btn btn-danger btn-sm ml-5"><i
								class="fa-solid fa-cart-plus"></i>Add Cart</a> --> <a href="View_Books.jsp?bid=<%=b.getBook_id()%>"
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
		</div>
<!-- 	</div> -->

</body>
</html>