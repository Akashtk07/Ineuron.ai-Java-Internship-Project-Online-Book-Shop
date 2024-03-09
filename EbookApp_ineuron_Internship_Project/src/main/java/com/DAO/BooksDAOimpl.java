 package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Book_Details;

public class BooksDAOimpl implements BooksDAO {

	private Connection conn;
	public BooksDAOimpl(Connection conn) {
		super();
		this.conn = conn;
	}

	
	@Override
	public boolean addBooks(Book_Details bookdetails) {
		boolean f=false;

		try {
			String sql="insert into book_details(book_name,author,price,book_category,status,photo,email) values(?,?,?,?,?,?,?)";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1, bookdetails.getBookname());
			ps.setString(2, bookdetails.getAuthor());
			ps.setString(3, bookdetails.getPrice());
			ps.setString(4, bookdetails.getBookcategory());
			ps.setString(5, bookdetails.getStatus());
			ps.setString(6, bookdetails.getPhoto());
			ps.setString(7, bookdetails.getEmail());
			
			int i=ps.executeUpdate();
			if(i==1)
			{
				f=true;
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return f;
	}
	
	
	
	public List<Book_Details> getAllBooks() {
		List<Book_Details> list= new ArrayList<Book_Details>();
		Book_Details b=null;
		
		 try {
			 String sql="select *from book_details";
			 PreparedStatement ps=conn.prepareStatement(sql);
			 ResultSet rs = ps.executeQuery();
			 while(rs.next())
			 {
				 b= new Book_Details();
				 b.setBook_id(rs.getInt(1));
				 b.setBookname(rs.getString(2));
				 b.setAuthor(rs.getString(3));
				 b.setPrice(rs.getString(4));
				 b.setBookcategory(rs.getString(5));
				 b.setStatus(rs.getString(6));
				 b.setPhoto(rs.getString(7));
				 b.setEmail(rs.getString(8));
				 list.add(b);
			 }
			 
			 
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		return list;
	}


	@Override
	public Book_Details getBookById(int id) {
		
		Book_Details b=null;
		try {
			
			String sql="select *from book_details where book_id=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				
				 b= new Book_Details();
				 b.setBook_id(rs.getInt(1));
				 b.setBookname(rs.getString(2));
				 b.setAuthor(rs.getString(3));
				 b.setPrice(rs.getString(4));
				 b.setBookcategory(rs.getString(5));
				 b.setStatus(rs.getString(6));
				 b.setPhoto(rs.getString(7));
				 b.setEmail(rs.getString(8));
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return b;
	}


	@Override
	public boolean updateEditBooks(Book_Details b) {
		boolean f= false;
		
		try {
			String sql="update book_details set book_name=?,author=?, price=?,status=? where book_id=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,b.getBookname() );
			ps.setString(2,b.getAuthor());
			ps.setString(3,b.getPrice());
			ps.setString(4,b.getStatus() );
			ps.setInt(5,b.getBook_id() );
			int i=ps.executeUpdate();
			
			if(i==1)
			{
				f=true;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Something Wrong With SQL UPDATEBOOKDETAILS querie");
		}
		
		return f;
	}


	@Override
	public boolean deleteBooks(int id) {
		boolean f=false;
		try {
			String sql="delete from book_details where book_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			int i = ps.executeUpdate();
			if(i==1)
			{
				f=true;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
	}


	@Override
	public List<Book_Details> getNewBook() {
		List<Book_Details> list = new ArrayList<Book_Details>();
		
		Book_Details b=null;
		try {
			String sql="select *from Book_Details where book_category=? and status=? order by book_id DESC";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,"New");
			ps.setString(2,"Active");
			
			ResultSet rs = ps.executeQuery();
			int i=1;
			while(rs.next() && i<=4)
			{
				 b= new Book_Details();
				 b.setBook_id(rs.getInt(1));
				 b.setBookname(rs.getString(2));
				 b.setAuthor(rs.getString(3));
				 b.setPrice(rs.getString(4));
				 b.setBookcategory(rs.getString(5));
				 b.setStatus(rs.getString(6));
				 b.setPhoto(rs.getString(7));
				 b.setEmail(rs.getString(8));
				 list.add(b);
				 i++;
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error in Book Daoimpl getNewBook");
		}
		
		return list;
		
	}


	@Override
	public List<Book_Details> getRecentBooks() {
List<Book_Details> list = new ArrayList<Book_Details>();
		
		Book_Details b=null;
		try {
			String sql="select *from Book_Details where status=? order by book_id DESC";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,"Active");
			
			ResultSet rs = ps.executeQuery();
			int i=1;
			while(rs.next() && i<=4)
			{
				 b= new Book_Details();
				 b.setBook_id(rs.getInt(1));
				 b.setBookname(rs.getString(2));
				 b.setAuthor(rs.getString(3));
				 b.setPrice(rs.getString(4));
				 b.setBookcategory(rs.getString(5));
				 b.setStatus(rs.getString(6));
				 b.setPhoto(rs.getString(7));
				 b.setEmail(rs.getString(8));
				 list.add(b);
				 i++;
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error in Book Daoimpl getNewBook");
		}
		
		return list;
		
	}


	@Override
	public List<Book_Details> getOldBook() {
		List<Book_Details> list = new ArrayList<Book_Details>();
		
		Book_Details b=null;
		try {
			String sql="select *from Book_Details where book_category=? and status=? order by book_id DESC";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,"Old");
			ps.setString(2,"Active");
			
			ResultSet rs = ps.executeQuery();
			int i=1;
			while(rs.next() && i<=4)
			{
				 b= new Book_Details();
				 b.setBook_id(rs.getInt(1));
				 b.setBookname(rs.getString(2));
				 b.setAuthor(rs.getString(3));
				 b.setPrice(rs.getString(4));
				 b.setBookcategory(rs.getString(5));
				 b.setStatus(rs.getString(6));
				 b.setPhoto(rs.getString(7));
				 b.setEmail(rs.getString(8));
				 list.add(b);
				 i++;
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error in Book Daoimpl getNewBook");
		}
		
		return list;
	}


	@Override
	public List<Book_Details> getAllRecentBooks() {
List<Book_Details> list = new ArrayList<Book_Details>();
		
		Book_Details b=null;
		try {
			String sql="select *from Book_Details where status=? order by book_id DESC";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,"Active");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				 b= new Book_Details();
				 b.setBook_id(rs.getInt(1));
				 b.setBookname(rs.getString(2));
				 b.setAuthor(rs.getString(3));
				 b.setPrice(rs.getString(4));
				 b.setBookcategory(rs.getString(5));
				 b.setStatus(rs.getString(6));
				 b.setPhoto(rs.getString(7));
				 b.setEmail(rs.getString(8));
				 list.add(b);
	
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error in Book Daoimpl getNewBook");
		}
		
		return list;
	}


	@Override
	public List<Book_Details> getAllNewBooks() {
List<Book_Details> list = new ArrayList<Book_Details>();
		
		Book_Details b=null;
		try {
			String sql="select *from Book_Details where book_category=? and status=? order by book_id DESC";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,"New");
			ps.setString(2,"Active");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				 b= new Book_Details();
				 b.setBook_id(rs.getInt(1));
				 b.setBookname(rs.getString(2));
				 b.setAuthor(rs.getString(3));
				 b.setPrice(rs.getString(4));
				 b.setBookcategory(rs.getString(5));
				 b.setStatus(rs.getString(6));
				 b.setPhoto(rs.getString(7));
				 b.setEmail(rs.getString(8));
				 list.add(b);
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error in Book Daoimpl getNewBook");
		}
		
		return list;
	}


	@Override
	public List<Book_Details> getAllOldBooks() {
		List<Book_Details> list = new ArrayList<Book_Details>();
		
		Book_Details b=null;
		try {
			String sql="select *from Book_Details where book_category=? and status=? order by book_id DESC";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,"Old");
			ps.setString(2,"Active");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				 b= new Book_Details();
				 b.setBook_id(rs.getInt(1));
				 b.setBookname(rs.getString(2));
				 b.setAuthor(rs.getString(3));
				 b.setPrice(rs.getString(4));
				 b.setBookcategory(rs.getString(5));
				 b.setStatus(rs.getString(6));
				 b.setPhoto(rs.getString(7));
				 b.setEmail(rs.getString(8));
				 list.add(b);
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error in Book Daoimpl getNewBook");
		}
		
		return list;
	}


	@Override
	public List<Book_Details> getAllOldBooksByUser(String Email, String catogory) {
		List<Book_Details> list = new ArrayList<Book_Details>();
		Book_Details b = null;
		try {
			String sql="select *from book_details where email=? and book_category=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,Email);
			ps.setString(2, catogory);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				 b= new Book_Details();
				 b.setBook_id(rs.getInt(1));
				 b.setBookname(rs.getString(2));
				 b.setAuthor(rs.getString(3));
				 b.setPrice(rs.getString(4));
				 b.setBookcategory(rs.getString(5));
				 b.setStatus(rs.getString(6));
				 b.setPhoto(rs.getString(7));
				 b.setEmail(rs.getString(8));
				 list.add(b);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}


	@Override
	public boolean deleteOldBook(String Email, String category ,String BookID) {
		boolean f=false;
		
		try {
			String sql="delete from book_details where  email=? and book_category=? and book_id=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,Email);
			ps.setString(2,category);
			ps.setString(3, BookID);
			
			int i=ps.executeUpdate();
			
			if(i==1)
			{
				f=true;
			}
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
	}


	@Override
	public List<Book_Details> getBookBySearch(String ch) {
		List<Book_Details> list = new ArrayList<Book_Details>();
		Book_Details b = null;
		try {
			String sql="select *from book_details where  book_name like ? or author like ? or book_category like ? and status=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,"%"+ch+"%");
			ps.setString(2,"%"+ch+"%");
			ps.setString(3,"%"+ch+"%");
			ps.setString(4,"Active");
			
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				 b= new Book_Details();
				 b.setBook_id(rs.getInt(1));
				 b.setBookname(rs.getString(2));
				 b.setAuthor(rs.getString(3));
				 b.setPrice(rs.getString(4));
				 b.setBookcategory(rs.getString(5));
				 b.setStatus(rs.getString(6));
				 b.setPhoto(rs.getString(7));
				 b.setEmail(rs.getString(8));
				 list.add(b);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	
	

}
