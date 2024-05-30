package com.najem.booksapi.controller;

import com.najem.booksapi.model.Book;
import com.najem.booksapi.service.BookService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BooksController {
    @Autowired
    BookService bookService;

    @GetMapping("/")
    public String index(Model model) {
        return "redirect:/books";
    }
    @RequestMapping("/books")
    public String books(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "all.jsp";
    }

    @GetMapping("/book/{bookId}")
    public String book(@PathVariable ("bookId") long bookId , Model model) {
        Book book=bookService.findBook(bookId);
        model.addAttribute("book", book);
        return "book.jsp";
    }

}
