package com.example.demo.controller;

import com.example.demo.domain.Book;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Timestamp;
import java.util.Date;
import java.util.TimerTask;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World from Harris!";
    }

    @GetMapping("/clock")
    public Date clock(){
        Date date = new Date();

        return date;
    }

    // Restful API: returns the status code, e.g., 200 means OK, 404, 500
    // HTTP methods: GET, POST, PUT, and DELETE

    @PostMapping("/book")
    public ResponseEntity<?> save(@RequestBody Book book){
        return new ResponseEntity<>(bookService.create(book), HttpStatus.CREATED);
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(bookService.findAll(), HttpStatus.OK);
    }

    // HttpStatus: 200-OK, 201-CREATED, 404-Not Found, 500-Bad Gateway (server down)
}
