package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Book_Details;
import com.entity.cart;

public class CartDAOimpl implements CartDAO {

	private Connection conn;
	
	public CartDAOimpl(Connection conn)
	{
		this.conn=conn;
	}
	@Override
	public boolean addCart(cart c) {
		boolean f= false;
		try {
			String sql="insert into cart(bid,uid,bookName,author,price,totalPrice) values(?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,c.getBid());
			ps.setInt(2,c.getUid());
			ps.setString(3,c.getBookName());
			ps.setString(4, c.getAuthor());
			ps.setDouble(5,c.getPrice());
			ps.setDouble(6,c.getTotalPrice());
			
			int i=ps.executeUpdate();
			if(i==1)
			{
				f=true;
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error Occured In CartDAOImpl/addCard ");
		}
		
		return f;
	}
	
	
	@Override
	public List<cart> getBookByUser(int userId) {
		List<cart> list= new ArrayList<cart>();
		cart c= null;
		double totalPrice=0;
		try {
			String sql="select * from cart where uid=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, userId);
			
			ResultSet rs =ps.executeQuery();
			
			while(rs.next())
			{
				c = new cart();
				c.setCid(rs.getInt(1));
				c.setBid(rs.getInt(2));
				c.setUid(rs.getInt(3));
				c.setBookName(rs.getString(4));
				c.setAuthor(rs.getString(5));
				c.setPrice(rs.getDouble(6));
				
				totalPrice += rs.getDouble(7);
				c.setTotalPrice(totalPrice);
				
				list.add(c);
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();		}
		return list;
	}
	@Override
	public boolean deleteBookById(int bid,int uid , int cid) {
		boolean f = false;
		
		try {
			String sql="delete from cart where bid=? and uid=? and cid=?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,bid);
			ps.setInt(2, uid);
			ps.setInt(3,cid);
			int i=ps.executeUpdate();
			
			if(i==1)
			{
				f=true;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error in CartDAOimpl/deleteBookById");
		}
		return f;
	}
	
	

}
