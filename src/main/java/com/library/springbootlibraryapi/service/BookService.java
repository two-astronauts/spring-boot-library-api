package com.library.springbootlibraryapi.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import com.library.springbootlibraryapi.dao.BookDao;
import com.library.springbootlibraryapi.entity.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookDao bookDao;

    public List<Book> getBooks() {
        return bookDao.findAll();
    }

    public Optional<Book> getBook(BigInteger id) {
        return bookDao.findById(id);
    }

    public Book saveBook(Book book) {
        return bookDao.save(book);
    }

    public Book updateBook(Book book) {
        return bookDao.save(book);
    }

    public void deleteBook(BigInteger id) {
        Optional<Book> book = this.getBook(id);
        if (book.isPresent()) {
            this.bookDao.deleteById(id);
        }
    }

    public List<Book> getByAuthorIdentification(String identification) {
        return bookDao.findByAuthorIdentificationOrderByNameAsc(identification);
    }

}
