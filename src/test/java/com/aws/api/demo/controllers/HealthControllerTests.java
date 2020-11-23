package com.aws.api.demo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class HealthControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturn200Status() throws Exception {
        mockMvc.perform(get("/health")).andExpect(status().isOk());
    }
}