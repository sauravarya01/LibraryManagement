package com.nagarro.LibraryManagementSystemBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.LibraryManagementSystemBackend.model.Book;

@Repository
public interface BookRepositry extends JpaRepository<Book, Integer> {

}
