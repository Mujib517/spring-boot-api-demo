package com.aws.api.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/values")
public class ValuesController {

    @GetMapping
    public ResponseEntity<String[]> Get() {
        String[] values = new String[]{"Value 1", "Value 2"};
        return ResponseEntity.ok(values);
    }
}
