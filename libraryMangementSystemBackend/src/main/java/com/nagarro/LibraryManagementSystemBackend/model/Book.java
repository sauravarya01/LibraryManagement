package com.nagarro.LibraryManagementSystemBackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Book {
	@Id
	private int bookId;
	private String bookName;
	private String bookAddedDate;

	@ManyToOne
	private Librarian librarian;

	@ManyToOne
	private Author author;

	public Book() {
		super();
	}

	public Book(int bookId, String bookName, String bookAddedDate, Librarian librarian, Author author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAddedDate = bookAddedDate;
		this.librarian = librarian;
		this.author = author;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Librarian getLibrarian() {
		return librarian;
	}

	public void setLibrarian(Librarian librarian) {
		this.librarian = librarian;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getBookAddedDate() {
		return bookAddedDate;
	}

	public void setBookAddedDate(String bookAddedDate) {
		this.bookAddedDate = bookAddedDate;
	}

}
