package com.library.springbootlibraryapi.dao;

import java.math.BigInteger;

import com.library.springbootlibraryapi.entity.Kind;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KindDao extends JpaRepository<Kind, BigInteger> {

}
