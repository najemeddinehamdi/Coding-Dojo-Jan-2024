package com.najem.booksapi.repository;

import java.util.List;

import com.najem.booksapi.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.najem.booksapi.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAll();
    List<Book> findByDescriptionContaining(String search);
}