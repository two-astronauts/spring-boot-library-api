package com.library.springbootlibraryapi.controller;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import com.library.springbootlibraryapi.entity.Author;
import com.library.springbootlibraryapi.service.AuthorService;

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
@RequestMapping("/author")
@PreAuthorize("hasAuthority('ADMIN')")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @GetMapping(path = "")
    public List<Author> getAuthors() {
        return authorService.getAuthors();
    }

    @GetMapping(path = "/{id}")
    public Optional<Author> getAuthor(@PathVariable BigInteger id) {
        return authorService.getAuthor(id);
    }

    @PostMapping(path = "")
    public Author saveAuthor(@RequestBody Author author) {
        return authorService.saveAuthor(author);
    }

    @PutMapping(path = "")
    public Author updateAuthor(@RequestBody Author author) {
        return authorService.updateAuthor(author);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteAuthor(@PathVariable BigInteger id) {
        authorService.deleteAuthor(id);
    }

}
