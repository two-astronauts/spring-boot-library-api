package com.library.springbootlibraryapi.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import com.library.springbootlibraryapi.dao.KindDao;
import com.library.springbootlibraryapi.entity.Kind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KindService {

    @Autowired
    KindDao kindDao;

    public List<Kind> getKinds() {
        return kindDao.findAll();
    }

    public Optional<Kind> getKind(BigInteger id) {
        return kindDao.findById(id);
    }

    public Kind saveKind(Kind kind) {
        return kindDao.save(kind);
    }

    public Kind updateKind(Kind kind) {
        return kindDao.save(kind);
    }

    public void deleteKind(BigInteger id) {
        Optional<Kind> kind = this.getKind(id);
        if (kind.isPresent()) {
            this.kindDao.deleteById(id);
        }
    }

}
