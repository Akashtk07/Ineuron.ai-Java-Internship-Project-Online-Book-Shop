package com.user.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.entity.Book_Details;
import com.entity.Order_Details;
import com.entity.cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.Book_OrderDAOimpl;

import com.DAO.CartDAOimpl;
import com.DB.DBConnect;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {

			HttpSession session = req.getSession();

			int id = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("uname");
			String email = req.getParameter("uemail");
			String phoneNo = req.getParameter("phno");
			String address = req.getParameter("address");
			String landmark = req.getParameter("landmark");
			String city = req.getParameter("city");
			String state = req.getParameter("state");
			String pincode = req.getParameter("pincode");
			String paymentType = req.getParameter("payment");

			String fullAddress = address + "," + landmark + "," + city + "," + state + "," + pincode;

			CartDAOimpl cdao = new CartDAOimpl(DBConnect.getConn());
			List<cart> blist = cdao.getBookByUser(id);

			if (blist.isEmpty()) {
				session.setAttribute("FailedMSG", "Add Item ");

				resp.sendRedirect("cart.jsp");
			} else {
				Book_OrderDAOimpl dao = new Book_OrderDAOimpl(DBConnect.getConn());
				Order_Details o = null;
//				int i = dao.getOrderNumber();

				ArrayList<Order_Details> orderList = new ArrayList<Order_Details>();

				Random r = new Random();
				for (cart c : blist) {
					o = new Order_Details();
					o.setOrderID("BOOK-ORD-00" + r.nextInt(1000));
					o.setUserName(name);
					o.setEmail(email);
					o.setPhoneNo(phoneNo);
					o.setFulladdress(fullAddress);
					o.setBookName(c.getBookName());
					o.setAuthor(c.getAuthor());
					o.setPrice(c.getPrice() + "");
					o.setPaymentType(paymentType);

					orderList.add(o);

				}

				if ("NOSelect".equals(paymentType)) {
					session.setAttribute("FailedMSG", "Plese Choose Payment Mode");
					resp.sendRedirect("cart.jsp");
				} else {
					boolean f = dao.saveOrder(orderList);
					if (f) {
						resp.sendRedirect("Order_Success.jsp");
					} else {
						session.setAttribute("FailedMSG", "Your Order Is Failed");
						resp.sendRedirect("cart.jsp");
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
