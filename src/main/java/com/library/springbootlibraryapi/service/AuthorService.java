package com.library.springbootlibraryapi.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import com.library.springbootlibraryapi.dao.AuthorDao;
import com.library.springbootlibraryapi.entity.Author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorDao authorDao;

    public List<Author> getAuthors() {
        return authorDao.findAll();
    }

    public Optional<Author> getAuthor(BigInteger id) {
        return authorDao.findById(id);
    }

    public Author saveAuthor(Author author) {
        return authorDao.save(author);
    }

    public Author updateAuthor(Author author) {
        return authorDao.save(author);
    }

    public void deleteAuthor(BigInteger id) {
        Optional<Author> author = this.getAuthor(id);
        if (author.isPresent()) {
            this.authorDao.deleteById(id);
        }
    }

}
