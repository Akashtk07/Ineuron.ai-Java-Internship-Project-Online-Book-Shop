package com.DAO;

import java.util.List;

import com.entity.Book_Details;

public interface BooksDAO  {
	
	public boolean addBooks(Book_Details bookdetails);
	public List<Book_Details> getAllBooks();
	public Book_Details getBookById(int id);
	public boolean updateEditBooks(Book_Details b);
	public boolean deleteBooks(int id);
	public List<Book_Details> getNewBook();
	public List<Book_Details> getRecentBooks();
	public List<Book_Details> getOldBook();
	public List<Book_Details> getAllRecentBooks();
	public List<Book_Details> getAllNewBooks();
	public List<Book_Details> getAllOldBooks();
	public List<Book_Details> getAllOldBooksByUser(String Email,String catogory);
	public boolean deleteOldBook(String Email,String category,String BookID);
	public List<Book_Details> getBookBySearch(String ch);
	
	

}
