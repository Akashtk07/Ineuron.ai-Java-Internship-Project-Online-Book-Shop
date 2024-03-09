package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.DAO.UserDAOImpl;
import com.DB.DBConnect;
import com.entity.User;

//URL Mapping
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String name=req.getParameter("fname");
			String email=req.getParameter("email");
			String Phone_No=req.getParameter("Phone_No");
			String password=req.getParameter("password");
			String check=req.getParameter("check");
			
		//	System.out.println(name+" " + email +"" + Phone_No +""+password+" "+check+ " ");
			
			User us= new User();
			us.setName(name);
			us.setEmail(email);
			us.setPhone_NO(Phone_No);
			us.setPassword(password);
			
			HttpSession session=req.getSession();
		//	System.out.println("This is From Registration Servlet :: "+check);
			if(check!=null){
				
			UserDAOImpl dao=new UserDAOImpl(DBConnect.getConn());
			
			boolean f2=dao.checkUser(email);
			
			if(f2)
			{
				boolean f=dao.userRegister(us);
				
//				System.out.println("This is From Registration Servlet :: "+f);
				
				if(f)
				{
//					System.out.println("User Register Successfully");
					session.setAttribute("succssMsg","Register Successfully.");
					resp.sendRedirect("register.jsp");
//					req.getRequestDispatcher("register.jsp").forward(req, resp);

//					resp.sendRedirect("register.jsp");
				}else
				{
//					System.out.println("Something Wrong On The Server...");
					session.setAttribute("failedMsg", "Something Wrong On The Server");
					resp.sendRedirect("register.jsp");
				}
				
			}else {
				session.setAttribute("failedMsg", "User AlReady Exist");
				resp.sendRedirect("register.jsp");
				
			}
			
			}else {
//				System.out.println("Plese Check Agree & Terms Condition");
				session.setAttribute("failedMsg", "Plese Agree Terms & Conditions");
				resp.sendRedirect("register.jsp");
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
}
