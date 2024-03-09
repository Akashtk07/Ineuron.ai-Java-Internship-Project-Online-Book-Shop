package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.BooksDAOimpl;
import com.DAO.CartDAOimpl;
import com.DB.DBConnect;
import com.entity.Book_Details;
import com.entity.cart;
@WebServlet("/cart")
public class CartServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			int bid=Integer.parseInt(req.getParameter("bid"));
			int uid=Integer.parseInt(req.getParameter("uid"));
			
			BooksDAOimpl dao = new BooksDAOimpl(DBConnect.getConn());
			Book_Details b=dao.getBookById(bid);
			
			cart c = new cart();
			c.setBid(bid);
			c.setUid(uid);
			c.setBookName(b.getBookname());
			c.setAuthor(b.getAuthor());
			c.setPrice(Double.parseDouble(b.getPrice()));
			c.setTotalPrice(Double.parseDouble(b.getPrice()));
			CartDAOimpl cartdao = new CartDAOimpl(DBConnect.getConn());
			boolean f = cartdao.addCart(c);
			
			HttpSession session =req.getSession();
			if(f)
			{
				session.setAttribute("addCart","Added To Cart");
				resp.sendRedirect("All_New_Books.jsp");
			}else {
				session.setAttribute("Failed","Something Wrong On Server.");
				resp.sendRedirect("All_New_Books.jsp");			
				}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
}
