<%@page import="com.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Recent Books</title>
<%@include file="all_components/allCss.jsp"%>

<style>

#toast {
	min-width: 300px;
	position: fixed;
	bottom: 30px;
	left: 50%;
	margin-left: -125px;
	background: #333;
	padding: 10px;
	color: white;
	text-align: center;
	z-index: 1;
	font-size: 18px;
	visibility: hidden;
	box-shadow: 0px 0px 100px #000;
}

#toast.display {
	visibility: visible;
	animation: fadeIn 0.5, fadeOut 0.5s 2.5s;
}

@keyframes fadeIn {from { bottom:0;
	opacity: 0;
}

to {
	bottom: 30px;
	opacity: 1;
}

}
@keyframes fadeOut {form { bottom:30px;
	opacity: 1;
}

to {
	bottom: 0;
	opacity: 0;
}
}


</style>

</head>
<body>

	<%
	User u = (User) session.getAttribute("userobj");
	%>

<c:if test="${not empty addCart}">

<div id="toast">${addCart}</div>

<script type="text/javascript">
		showToast();
		function showToast(content)
		{
		    $('#toast').addClass("display");
		    $('#toast').html(content);
		    setTimeout(()=>{
		        $("#toast").removeClass("display");
		    },2000)
		}	
</script>

<c:remove var="addCart" scope="session"/>

</c:if>
	<%@include file="all_components/Navbar.jsp"%>

	<div class="container-fluid">
		<div class="row p-3">
			<!-- 			<div class="col-md-3"> -->

			<%@ page
				import="com.DAO.BooksDAOimpl,com.entity.Book_Details, java.util.List,com.DB.DBConnect"%>

			<%
			BooksDAOimpl dao = new BooksDAOimpl(DBConnect.getConn());
			List<Book_Details> list = dao.getAllNewBooks();
			for (Book_Details b : list) {
			%>
			<div class="col-md-3">
				<div class="card crd-ho mt-2">
					<div class="card-body text-center">
						<img alt="" src="Book/<%=b.getPhoto()%>"
							style="width: 100px; height: 150px" class="img-thumblin">
						<p><%=b.getBookname()%></p>
						<p><%=b.getAuthor()%></p>
						<p>
							Categories:<%=b.getBookcategory()%>
						</p>
						
						<div class="row ">
						
						<%
							if (u == null) {
							%>
							<a href="login.jsp" class="btn btn-primary btn-sm ml-5"><i
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
						
						
<!-- 							<a href="" class="btn btn-danger btn-sm ml-5"><i
								class="fa-solid fa-cart-plus"></i>Add Cart</a> --> <a href="View_Books.jsp?bid=<%=b.getBook_id()%>"
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
	</div>
	<!-- 	</div> -->

</body>
</html>