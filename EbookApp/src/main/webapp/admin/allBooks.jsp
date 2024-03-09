<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
			<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
  <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin : All Books</title>
<%@include file="allCss.jsp"%>
</head>

<body>



	<%@include file="Navbar.jsp"%>
	<h3 class="text-center">Hello, Admin</h3>
	
	<!-- 	security code for unautorised access using url
 -->	<c:if test="${empty userobj }">
	<c:redirect url="../login.jsp"/>
	</c:if>
	

	<c:if test="${not empty succmsg }">
		<p class="text-center text-success">${succmsg }</p>
		<c:remove var="succmsg" scope="session" />
	</c:if>

	<c:if test="${not empty failedmsg }">
		<p class="text-center text-danger">${failedmsg }</p>
		<c:remove var="failedmsg" scope="session" />
	</c:if>



	<table class="table table-striped ">
		<thead class="bg-primary text-white">
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Image</th>
				<th scope="col">Book Name</th>
				<th scope="col">Author Name</th>
				<th scope="col">Price</th>
				<th scope="col">Categories</th>
				<th scope="col">Status</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>


			<%@ page
				import="com.DAO.BooksDAOimpl, com.DB.DBConnect, com.entity.Book_Details, java.util.List"%>
			<%
  
  BooksDAOimpl dao = new BooksDAOimpl(DBConnect.getConn());
  List<Book_Details> list= dao.getAllBooks();
  for(Book_Details b:list)
  {%>

			<tr>
				<td><%= b.getBook_id() %></td>
				<td><img src="../Book/<%= b.getPhoto()%>"
					style="width: 50px; height: 50px;"></td>
				<td><%=b.getBookname() %></td>
				<td><%= b.getAuthor() %></td>
				<td><%= b.getPrice() %></td>
				<td><%= b.getBookcategory() %></td>
				<td><%= b.getStatus() %></td>

				<td><a href="edit_books.jsp?id=<%= b.getBook_id() %>"
					class="btn btn-sm btn-primary"><i class="fa-solid fa-pen-to-square"></i> Edit</a> <a href="../delete?id=<%= b.getBook_id() %>"
					class="btn btn-sm btn-danger"><i class="fa-solid fa-trash-can"></i> Delete</a></td>
			</tr>

			<%  
  }
  %>
			<!-- <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td>
      <a href="#" class="btn btn-sm btn-primary">Edit</a>
      <a href="#" class="btn btn-sm btn-danger">Delete</a>
      </td>
    </tr> -->
			<!--  <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>@fat</td>
      <td>Otto</td>
      <td>@mdo</td>
       <td>
      <a href="#" class="btn btn-sm btn-primary">Edit</a>
      <a href="#" class="btn btn-sm btn-danger">Delete</a>
      </td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>Larry</td>
      <td>the Bird</td>
      <td>@twitter</td>
      <td>Otto</td>
      <td>@mdo</td>
       <td>
      <a href="#" class="btn btn-sm btn-primary">Edit</a>
      <a href="#" class="btn btn-sm btn-danger">Delete</a>
      </td>
    </tr> -->
		</tbody>
	</table>

	<div style="margin-top: 250px">
		<%@include file="footer.jsp"%>
	</div>

</body>
</html>