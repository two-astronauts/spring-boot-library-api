package com.library.springbootlibraryapi.controller;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import com.library.springbootlibraryapi.entity.Nationality;
import com.library.springbootlibraryapi.service.NationalityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nationality")
public class NationalityController {

    @Autowired
    NationalityService nationalityService;

    @GetMapping(path = "")
    public List<Nationality> getNationalities() {
        return nationalityService.getNationalities();
    }

    @GetMapping(path = "/{id}")
    public Optional<Nationality> getNationality(@PathVariable BigInteger id) {
        return nationalityService.getNationality(id);
    }

    @PostMapping(path = "")
    public Nationality saveNationality(@RequestBody Nationality nationality) {
        return nationalityService.saveNationality(nationality);
    }

    @PutMapping(path = "")
    public Nationality updateNationality(@RequestBody Nationality nationality) {
        return nationalityService.updateNationality(nationality);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteNationality(@PathVariable BigInteger id) {
        nationalityService.deleteNationality(id);
    }

}
