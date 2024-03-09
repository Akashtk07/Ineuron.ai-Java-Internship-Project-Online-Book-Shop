package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.CartDAOimpl;
import com.DB.DBConnect;
@WebServlet("/RemoveBookCart")
public class Remove_Book_Cart extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try{
			int Bid=Integer.parseInt(req.getParameter("bid"));
			int Uid=Integer.parseInt(req.getParameter("uid"));
			int Cid=Integer.parseInt(req.getParameter("cid"));

			CartDAOimpl dao = new CartDAOimpl(DBConnect.getConn());
			boolean f =dao.deleteBookById(Bid,Uid,Cid);
			
			HttpSession session =req.getSession();
			
			if(f)
			{
				session.setAttribute("SuccessMSG", "Book Removed from Cart.");
				resp.sendRedirect("cart.jsp");
			}else {
				session.setAttribute("FailedMSG", "SomeThing Wrong On Server");
				resp.sendRedirect("cart.jsp");				
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error On Remove_Book_Cart Servlet");
		}
	}
	
	

}
