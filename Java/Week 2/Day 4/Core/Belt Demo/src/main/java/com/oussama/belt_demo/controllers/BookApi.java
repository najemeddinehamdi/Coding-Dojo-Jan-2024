package com.oussama.belt_demo.controllers;


import com.oussama.belt_demo.models.Book;
import com.oussama.belt_demo.services.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookApi {
    // DI
    private final BookService bookService;
    public BookApi(BookService bookService){
        this.bookService = bookService;
    }

    // READ ALL
    @GetMapping("")
    public List<Book> index() {
        return bookService.allBooks();
    }

    // CREATE
    @PostMapping("")
    public Book create(
            @RequestParam(value="title") String title,
            @RequestParam(value="description") String desc,
            @RequestParam(value="language") String lang,
            @RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }

    // READ ONE BY ID
    @GetMapping("/{id}")
    public Book show(@PathVariable("id") Long id) {
        return bookService.findBook(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Book update(@PathVariable("id") Long id, @RequestBody Book bookDetails) {
        return bookService.updateBook(id, bookDetails);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
}
