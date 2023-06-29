package com.madalin.Library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private int bookId;
	
	@Column(name = "title")
	private String title;
	
	@ManyToOne
	@JoinColumn(name = "author_id")
	private Authors bookAuthorId;
	
	@ManyToOne
	@JoinColumn(name = "borrowers_id")
	private Borrowers bookBorrowerId;
	
	@Column(name = "number_of_pages")
	private int numberOfPages;
	
	@Column(name = "is_available")
	private boolean isAvailable;
	
	public Books(){
		
	}

	public Books(int bookId, String title, int bookAuthorId, int bookBorrowerId, int numberOfPages,
			boolean isAvailable) {
		this.title = title;
		this.numberOfPages = numberOfPages;
		this.isAvailable = isAvailable;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Borrowers getBookBorrowerId() {
		return bookBorrowerId;
	}

	public void setBookBorrowerId(Borrowers bookBorrowerId) {
		this.bookBorrowerId = bookBorrowerId;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Authors getBookAuthorId() {
		return bookAuthorId;
	}
	
	
}
