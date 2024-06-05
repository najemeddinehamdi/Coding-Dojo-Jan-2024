package com.oussama.belt_demo.services;

import com.oussama.belt_demo.models.Book;
import com.oussama.belt_demo.repositories.BookRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    // adding the book repository as a dependency
    private final BookRepo bookRepository;

    public BookService(BookRepo bookRepository) {
        this.bookRepository = bookRepository;
    }

    // ========== CURD =============

    // READ ALL
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }

    // CREATE
    public Book createBook(Book b) {
            return bookRepository.save(b);
    }

    // READ ONE
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        return optionalBook.orElse(null);
    }

    // UPDATE
    public Book updateBook(Long id, Book bookDetails) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            Book book = optionalBook.get();
            book.setTitle(bookDetails.getTitle());
            book.setDescription(bookDetails.getDescription());
            book.setLanguage(bookDetails.getLanguage());
            book.setNumberOfPages(bookDetails.getNumberOfPages());
            book.setLibrary(bookDetails.getLibrary());
            return bookRepository.save(book); // Save updates to the repository
        } else {
            // Handle the case where the book is not found
            return null; // or throw a custom exception
        }
    }

    // DELETE
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

}
