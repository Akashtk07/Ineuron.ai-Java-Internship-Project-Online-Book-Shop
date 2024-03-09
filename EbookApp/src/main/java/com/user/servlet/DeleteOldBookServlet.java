package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.BooksDAOimpl;
import com.DB.DBConnect;
@WebServlet("/DeleteOldBookServlet")
public class DeleteOldBookServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String em=req.getParameter("em");
			String category="Old";
			String bookId=req.getParameter("bookId");
			
			BooksDAOimpl dao = new BooksDAOimpl(DBConnect.getConn());
			boolean f=dao.deleteOldBook(em, category, bookId);
			HttpSession session = req.getSession();
			
			if(f)
			{
				session.setAttribute("SuccessMSG", "Old Book Delete Successfully");
				resp.sendRedirect("Old_Books.jsp");
			}else {
				session.setAttribute("FailedMSG", "SomeThing Wrong On Server");
				resp.sendRedirect("Old_Books.jsp");				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

}
