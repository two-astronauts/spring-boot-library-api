package com.library.springbootlibraryapi.dao;

import java.math.BigInteger;
import java.util.List;

import com.library.springbootlibraryapi.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao extends JpaRepository<Book, BigInteger> {

    public List<Book> findByAuthorIdentificationOrderByNameAsc(String identification);

}
