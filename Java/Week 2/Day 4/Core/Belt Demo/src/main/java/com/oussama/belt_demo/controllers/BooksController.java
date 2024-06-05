package com.oussama.belt_demo.controllers;

import com.oussama.belt_demo.models.Book;
import com.oussama.belt_demo.models.Library;
import com.oussama.belt_demo.services.BookService;
import com.oussama.belt_demo.services.LibraryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BooksController {

    @Autowired
    BookService bookService;

    @Autowired
    LibraryService libraryService;

    @GetMapping("")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("allBooks", books);
        return "allBooks";
    }


    @GetMapping("/create")
    public String form(Model model) {
        List<Library> allLibs = libraryService.allLibrary();
        model.addAttribute(  "book", new Book());
        model.addAttribute("allLibrary",allLibs);
        return "createBook";
    }

    @PostMapping("")
    public String create(
            @Valid @ModelAttribute("book") Book book,
            BindingResult result,
            Model model,
            RedirectAttributes flash) {
        if (result.hasErrors()) {
            List<Library> allLibs = libraryService.allLibrary();
            model.addAttribute("allLibrary",allLibs);
            return "createBook";
        } else {
            bookService.createBook(book);
            flash.addFlashAttribute("success", "Awesome! You have created a new book 📘");
            return "redirect:/books";
        }

    }



    @GetMapping("/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findBook(id);
        model.addAttribute("theBook", book);
        return "showBook";
    }


    @GetMapping("/update/{id}")
    public String updateForm(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findBook(id);
        model.addAttribute("theBook", book);
        List<Library> allLibs = libraryService.allLibrary();
        model.addAttribute("allLibrary",allLibs);
        return "updateBook"; // Load the update form with existing book details
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable("id") Long id,
                         @ModelAttribute("theBook") @Valid Book bookDetails,
                         BindingResult result, Model model,
                         RedirectAttributes flash) {
        
        if (result.hasErrors()) {
            List<Library> allLibs = libraryService.allLibrary();
            model.addAttribute("allLibrary",allLibs);
            return "updateBook"; // Return to the update form if there are validation errors
        }
        bookService.updateBook(id, bookDetails); // Update the book
        flash.addFlashAttribute("success", "Awesome! You have update a book 📘");
        return "redirect:/books"; // Redirect back to list of all books
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id, RedirectAttributes flash) {
        bookService.deleteBook(id); // Delete the book
        flash.addFlashAttribute("success", "Awesome! You have delete a book 📘");
        return "redirect:/books"; // Redirect back to list of all books
    }

}
