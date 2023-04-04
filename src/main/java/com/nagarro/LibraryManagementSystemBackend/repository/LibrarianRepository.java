package com.nagarro.LibraryManagementSystemBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.LibraryManagementSystemBackend.model.Librarian;

public interface LibrarianRepository extends JpaRepository<Librarian, String> {
	public Librarian findByUsernameAndPassword(String username, String password);
}
