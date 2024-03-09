<%@page import="com.entity.Order_Details"%>
<%@page import="java.util.List"%>
<%@page import="com.DB.DBConnect"%>
<%@page import="com.DAO.Book_OrderDAOimpl"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin : All Orders</title>
<%@include file="allCss.jsp"%>

</head>
<body>
	<c:if test="${empty userobj }">
	<c:redirect url="../login.jsp"/>
	</c:if>
	<%@include file="Navbar.jsp"%>
<h3 class="text-center">Hello, Admin</h3>

<table class="table table-striped ">
  <thead class="bg-primary text-white">
    <tr>
      <th scope="col">Order-ID</th>
      <th scope="col"> Name</th>
      <th scope="col">Email</th>
      <th scope="col">Address</th>
      <th scope="col">Phone Number</th>
      <th scope="col">Book Name</th>
      <th scope="col">Author</th>
      <th scope="col">Price</th>
      <th scope="col">Payment Mode</th>
    </tr>
  </thead>
  <tbody>
  
  <%
  Book_OrderDAOimpl dao = new Book_OrderDAOimpl(DBConnect.getConn());
  List<Order_Details> list=dao.getAllBooks();
  
  for(Order_Details b: list)
  {%>
	     <tr>
      <th scope="row"><%= b.getOrderID() %></th>
      <td><%= b.getUserName() %></td>
      <td><%= b.getEmail() %></td>
      <td><%=b.getFulladdress() %></td>
      <td><%= b.getPhoneNo() %></td>
      <td><%= b.getBookName() %></td>
      <td><%= b.getAuthor() %></td>
      <td><%= b.getPrice() %></td>
      <td><%= b.getPaymentType() %></td>
     
    </tr>
	  
  <%}
  %>

    
  </tbody>
</table>

<div style="margin-top: 260px">
<%@include file="footer.jsp" %>
</div>

</body>
</html>