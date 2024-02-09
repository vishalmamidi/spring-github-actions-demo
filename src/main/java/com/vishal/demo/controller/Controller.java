package com.vishal.demo.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public ResponseEntity<String> getApi(){
        return new ResponseEntity<>("Hello Srija Shenkeshi", new HttpHeaders(),HttpStatus.OK);
    }
}
