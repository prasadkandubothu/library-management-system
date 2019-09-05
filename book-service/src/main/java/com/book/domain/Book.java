package com.book.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book implements Serializable{

	private static final long serialVersionUID = 123456L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bookId;
	@Column
	private String bookName;
	@Column
	private String authorName;
	@Column
	private String publisher;
	@Column
	private String category;
	@Column
	private double price;
	@Column
	@Enumerated(EnumType.STRING)
	private BookStatus bookStatus;
	@Column
	@Enumerated(EnumType.STRING)
	private BookFormat bookFormat;
	@Column
	private Date issueDate;
	@Column
	private Date returnDate;
	
	public Book() {}
	
	
	
	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public BookFormat getBookFormat() {
		return bookFormat;
	}

	public void setBookFormat(BookFormat bookFormat) {
		this.bookFormat = bookFormat;
	}


	public BookStatus getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(BookStatus bookStatus) {
		this.bookStatus = bookStatus;
	}

	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	

}
