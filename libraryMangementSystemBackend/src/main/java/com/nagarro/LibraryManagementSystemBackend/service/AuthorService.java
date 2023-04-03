package com.nagarro.LibraryManagementSystemBackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.LibraryManagementSystemBackend.model.Author;

@Service
public interface AuthorService {
	public List<Author> getAuthorList();

	public boolean addAuthor(Author author);

	public void updateAuthor(Author author, int authorCode);

	public void deleteAuthor(int authorId);

	public Author findById(int authorId);
}
