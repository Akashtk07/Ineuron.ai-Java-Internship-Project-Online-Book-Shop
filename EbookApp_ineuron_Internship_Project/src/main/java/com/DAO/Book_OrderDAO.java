package com.DAO;

import java.util.List;

import com.entity.Order_Details;

public interface Book_OrderDAO {

//	public int getOrderNumber();
	public boolean saveOrder(List<Order_Details> bd);
	public List<Order_Details> getBooks(String Email);
	public List<Order_Details> getAllBooks();
	
	//Pdf
	public List<String> getOrderIds(String email);
	
	public List<Order_Details> getOrderIds(int orderid );
	
	
	
}
