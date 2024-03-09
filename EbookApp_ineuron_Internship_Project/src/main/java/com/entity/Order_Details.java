package com.entity;

public class Order_Details {

	private int id;
	private String orderID;
	private String bookName;
	private String author;
	private String price;
	private String userName;
	private String email;
	private String phoneNo;
	private String fulladdress;
	private String paymentType;
	
	
	
	
	public Order_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
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





	public String getOrderID() {
		return orderID;
	}


	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getFulladdress() {
		return fulladdress;
	}
	public void setFulladdress(String fulladdress) {
		this.fulladdress = fulladdress;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	@Override
	public String toString() {
		return "Order_Details [id=" + id + ", orderID=" + orderID + ", bookName=" + bookName + ", author=" + author
				+ ", price=" + price + ", userName=" + userName + ", email=" + email + ", phoneNo=" + phoneNo
				+ ", fulladdress=" + fulladdress + ", paymentType=" + paymentType + ", getBookName()=" + getBookName()
				+ ", getAuthor()=" + getAuthor() + ", getPrice()=" + getPrice() + ", getOrderID()=" + getOrderID()
				+ ", getId()=" + getId() + ", getUserName()=" + getUserName() + ", getEmail()=" + getEmail()
				+ ", getPhoneNo()=" + getPhoneNo() + ", getFulladdress()=" + getFulladdress() + ", getPaymentType()="
				+ getPaymentType() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

	
}
