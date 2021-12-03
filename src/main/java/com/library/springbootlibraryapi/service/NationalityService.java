package com.library.springbootlibraryapi.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import com.library.springbootlibraryapi.dao.NationalityDao;
import com.library.springbootlibraryapi.entity.Nationality;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NationalityService {

    @Autowired
    NationalityDao nationalityDao;

    public List<Nationality> getNationalities() {
        return nationalityDao.findAll();
    }

    public Optional<Nationality> getNationality(BigInteger id) {
        return nationalityDao.findById(id);
    }

    public Nationality saveNationality(Nationality nationality) {
        return nationalityDao.save(nationality);
    }

    public Nationality updateNationality(Nationality nationality) {
        return nationalityDao.save(nationality);
    }

    public void deleteNationality(BigInteger id) {
        Optional<Nationality> nationality = this.getNationality(id);
        if (nationality.isPresent()) {
            this.nationalityDao.deleteById(id);
        }
    }

}
