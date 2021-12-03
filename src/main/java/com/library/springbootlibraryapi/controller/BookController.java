package com.library.springbootlibraryapi.controller;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import com.library.springbootlibraryapi.entity.Book;
import com.library.springbootlibraryapi.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
@PreAuthorize("hasAuthority('ADMIN')")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping(path = "")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping(path = "/{id}")
    public Optional<Book> getBook(@PathVariable BigInteger id) {
        return bookService.getBook(id);
    }

    @PostMapping(path = "")
    public Book saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @PutMapping(path = "")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteBook(@PathVariable BigInteger id) {
        bookService.deleteBook(id);
    }

    @PreAuthorize("hasAuthority('STAFF_MEMBER')")
    @GetMapping(path = "/author/{identification}")
    public List<Book> getByAuthorIdentification(@PathVariable String identification) {
        return bookService.getByAuthorIdentification(identification);
    }

}
