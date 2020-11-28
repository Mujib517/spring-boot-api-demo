package com.aws.api.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/persons")
public class PersonController {

    @GetMapping
    public ResponseEntity<String[]> get() {
        String persons[] = new String[]{"Person1", "Person2"};
        return ResponseEntity.ok(persons);
    }
}
