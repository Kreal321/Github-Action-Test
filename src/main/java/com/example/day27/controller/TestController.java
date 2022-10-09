package com.example.day27.controller;

import com.example.day27.domain.response.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<ResponseStatus> serverTest() {
        return new ResponseEntity<>(ResponseStatus.builder().success(true).message("Server is online.").build(), HttpStatus.OK);
    }

}
