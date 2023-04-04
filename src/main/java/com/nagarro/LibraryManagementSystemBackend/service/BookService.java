package com.nagarro.LibraryManagementSystemBackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.LibraryManagementSystemBackend.model.Book;

@Service
public interface BookService {

	public List<Book> getBookList();

	public void addBook(Book book);

	public Book findById(int bookCode);

	public void updateBook(Book book, int bookCode);

	public void deleteBook(int bookId);
}
