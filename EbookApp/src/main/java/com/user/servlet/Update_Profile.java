package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.UserDAOImpl;
import com.DB.DBConnect;
import com.entity.User;

@WebServlet("/update_profile")
public class Update_Profile extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int id=Integer.parseInt(req.getParameter("id"));
			String name=req.getParameter("fname");
			String email=req.getParameter("email");
			String Phone_No=req.getParameter("Phone_No");
			String password=req.getParameter("password");
			
			UserDAOImpl dao = new UserDAOImpl(DBConnect.getConn());
			User us = new User();
			us.setId(id);
			us.setName(name);
			us.setEmail(email);
			us.setPhone_NO(Phone_No);
			boolean f=dao.checkPassword(id, password);
			HttpSession session = req.getSession();
;			
			if(f)
			{
				boolean f2=dao.updateProfile(us);
				if(f2) {
					session.setAttribute("succssMsg","User Profile Update Successfully.");
					req.getRequestDispatcher("Edit_Profile.jsp").forward(req, resp);
				}else {
					session.setAttribute("failMSG","Something Wrong On Server");
					req.getRequestDispatcher("Edit_Profile.jsp").forward(req, resp);
				}
				
			}else {
				
				session.setAttribute("FailMSG","Your Password Is Incorrect");
				req.getRequestDispatcher("Edit_Profile.jsp").forward(req, resp);
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

}
