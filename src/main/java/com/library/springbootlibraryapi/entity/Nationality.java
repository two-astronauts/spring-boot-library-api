package com.library.springbootlibraryapi.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "nationality", schema = "public")
public class Nationality {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nationality_seq")
    @SequenceGenerator(name = "nationality_seq", sequenceName = "nationality_seq", allocationSize = 1)
    @Column(name = "id", updatable = false, nullable = false)
    private BigInteger id;

    @Column(name = "name", nullable = false, length = 64)
    private String name;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
