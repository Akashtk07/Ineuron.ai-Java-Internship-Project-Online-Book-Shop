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

@WebServlet("/delete")
public class BooksDeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			int id=Integer.parseInt(req.getParameter("id"));
			BooksDAOimpl dao = new BooksDAOimpl(DBConnect.getConn());
			boolean f = dao.deleteBooks(id);
			
			HttpSession session =req.getSession();
//			System.out.println("This Is From DeleteBookServlet "+f);
			if(f)
			{
				session.setAttribute("succmsg","Book Delete Successfully..");
				resp.sendRedirect("admin/allBooks.jsp");
			}else {
				session.setAttribute("failedmsg","Something Wrong On Server");
				resp.sendRedirect("admin/allBooks.jsp");				
				
				
			}
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
}
