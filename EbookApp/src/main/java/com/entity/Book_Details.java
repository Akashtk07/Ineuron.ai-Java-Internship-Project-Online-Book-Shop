package com.entity;

public class Book_Details {

	private int book_id;
	private String bookname;
	private String author;
	private String price;
	private String bookcategory;
	private String status;
	private String photo;
	private String email;
	public Book_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book_Details(String bookname, String author, String price, String bookcategory, String status, String photo,
			String email) {
		super();
		this.bookname = bookname;
		this.author = author;
		this.price = price;
		this.bookcategory = bookcategory;
		this.status = status;
		this.photo = photo;
		this.email = email;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBookcategory() {
		return bookcategory;
	}
	public void setBookcategory(String bookcategory) {
		this.bookcategory = bookcategory;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Book_Details [book_id=" + book_id + ", bookname=" + bookname + ", author=" + author + ", price=" + price
				+ ", bookcategory=" + bookcategory + ", status=" + status + ", photo=" + photo + ", email=" + email
				+ ", getBook_id()=" + getBook_id() + ", getBookname()=" + getBookname() + ", getAuthor()=" + getAuthor()
				+ ", getPrice()=" + getPrice() + ", getBookcategory()=" + getBookcategory() + ", getStatus()="
				+ getStatus() + ", getPhoto()=" + getPhoto() + ", getEmail()=" + getEmail() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
