package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.BooksDAOimpl;
import com.DB.DBConnect;
import com.entity.Book_Details;

@WebServlet("/edit_books")
public class EditBookServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			int id =Integer.parseInt(req.getParameter("id"));
			String bookName=req.getParameter("bname");
			String author=req.getParameter("author");
			String Price=req.getParameter("price");
			String status=req.getParameter("status");
			
			Book_Details b = new Book_Details();
			b.setBook_id(id);
			b.setBookname(bookName);
			b.setAuthor(author);
			b.setPrice(Price);
			b.setStatus(status);
			
			BooksDAOimpl dao=new BooksDAOimpl(DBConnect.getConn());
			boolean f =dao.updateEditBooks(b);
			
			
			HttpSession session =req.getSession();
			if(f)
			{
				session.setAttribute("succmsg","Book Update Successfully..");
				resp.sendRedirect("admin/allBooks.jsp");
			}else {
				session.setAttribute("failedmsg","Something Wrong On Server");
				resp.sendRedirect("admin/allBooks.jsp");				
				
				
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error In EditBookServlet");
		}
	}
	
	

}
