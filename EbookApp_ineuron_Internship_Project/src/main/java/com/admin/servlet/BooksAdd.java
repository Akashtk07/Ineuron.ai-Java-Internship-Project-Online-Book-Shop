package com.admin.servlet;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.DAO.BooksDAOimpl;
import com.DB.DBConnect;
import com.entity.Book_Details;

@WebServlet("/add_books")
@MultipartConfig
public class BooksAdd extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String bookName=req.getParameter("bname");
			String author=req.getParameter("author");
			String Price=req.getParameter("price");
			String categories=req.getParameter("categories");
			String status=req.getParameter("status");
			Part part=req.getPart("bimg");
			String fileName=part.getSubmittedFileName();
			
			Book_Details b = new Book_Details(bookName,author,Price,categories,status,fileName,"admin");
		
			BooksDAOimpl  dao= new BooksDAOimpl(DBConnect.getConn());
			
		
			
			
			
			  boolean f=dao.addBooks(b); HttpSession session = req.getSession(); 
			  if(f) 
			  {
					String path=getServletContext().getRealPath("")+"Book";
					//System.out.println(path);
					File file= new File(path);
					
					part.write(path+File.separator+fileName);
				  
			  session.setAttribute("succmsg", "Book Add Successfully. ");
			  resp.sendRedirect("admin/add_books.jsp");
			  }
			  else {
			  session.setAttribute("failmsg", "Something Wrong On Server");
			  resp.sendRedirect("admin/add_books.jsp"); 
			  }
			 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	

}
