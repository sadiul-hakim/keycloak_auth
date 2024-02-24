package com.programming.techie.pkce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class HomeController {
    @GetMapping("/home")
    public ResponseEntity<?> home(){
        return ResponseEntity.ok(Collections.singletonMap("message","Hi"));
    }
}
