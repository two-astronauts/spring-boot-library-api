package com.library.springbootlibraryapi.controller;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import com.library.springbootlibraryapi.entity.Kind;
import com.library.springbootlibraryapi.service.KindService;

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
@RequestMapping("/kind")
public class KindController {

    @Autowired
    KindService kindService;

    @GetMapping(path = "")
    public List<Kind> getKinds() {
        return kindService.getKinds();
    }

    @GetMapping(path = "/{id}")
    public Optional<Kind> getKind(@PathVariable BigInteger id) {
        return kindService.getKind(id);
    }

    @PostMapping(path = "")
    public Kind saveKind(@RequestBody Kind kind) {
        return kindService.saveKind(kind);
    }

    @PutMapping(path = "")
    public Kind updateKind(@RequestBody Kind kind) {
        return kindService.updateKind(kind);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteKind(@PathVariable BigInteger id) {
        kindService.deleteKind(id);
    }

}
