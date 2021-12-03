package com.library.springbootlibraryapi.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping(path = "")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String test() {
        return "Esto es una prueba";
    }

}
