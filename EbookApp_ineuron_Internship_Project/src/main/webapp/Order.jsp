<%@page import="com.entity.Order_Details"%>
<%@page import="java.util.List"%>
<%@page import="com.DB.DBConnect"%>
<%@page import="com.DAO.Book_OrderDAOimpl"%>
<%@page import="com.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Books</title>
<%@include file="all_components/allCss.jsp"%>

</head>
<body>

	<c:if test="${empty userobj}">
		<c:redirect url="login.jsp"></c:redirect>
	</c:if>
	<%@include file="all_components/Navbar.jsp"%>

<div class="container p-1">
<h3 class="text-center text-primary">Your Order</h3>
<table class="table table-striped mt-3">

<thead class="bg-primary text-white">
<tr>
<th scope="col">Order Id</th>
<th scope="col">Name</th>
<th scope="col">Book Name</th>
<th scope="col">Autor</th>
<th scope="col">Price</th>
<th scope="col">Payment Type</th>

</tr>
</thead>
<tbody>
<%
User u=(User)session.getAttribute("userobj");
Book_OrderDAOimpl dao= new Book_OrderDAOimpl(DBConnect.getConn());
 List<Order_Details> bList= dao.getBooks(u.getEmail());
 for(Order_Details b:bList)
 {%>
 
 <tr>
<th scope="row"><%= b.getOrderID() %></th>
<td><%= b.getUserName() %></td>
<td><%= b.getBookName() %></td>
<td><%= b.getAuthor() %></td>
<td><%= b.getPrice() %></td>
<td><%= b.getPaymentType() %></td>
</tr>
 
	 
 <%}
%>

</tbody>

</table>


</div>
</body>
</html>