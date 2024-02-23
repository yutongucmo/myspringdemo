package com.example.demo.service;

import com.example.demo.domain.Book;
import com.example.demo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService {
    // Make creation function for Book
    private final BookRepository bookRepository;

    @Transactional
    public Book create(Book book){
        return bookRepository.save(book);
    }

    @Transactional
    public List<Book> findAll(){
        return bookRepository.findAll();
    }
    // Dependency Injection: DI is a design pattern used in software engineering
    // to achieve Inversion of Control between classes and their dependencies.
    // Goal: It allows for decoupling components by making them independent of the
    // concrete implementations of classes that they rely on

//    @Autowired // This tells Spring to inject an instance of BookRepository into BookService
//    public BookService(BookRepository bookRepository){
//        this.bookRepository = bookRepository;
//    } // In this example, BookService depends on BookRepository to access and
    // manipulate the book object data

}
