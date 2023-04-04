package com.nagarro.LibraryManagementSystemBackend.service;

import org.springframework.stereotype.Service;

import com.nagarro.LibraryManagementSystemBackend.model.Librarian;

@Service
public interface LibrarianService {
	public Librarian findByUsernameAndPassword(String username, String password);
}
