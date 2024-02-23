package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// For GitHub push testing, let's make some changes on this domain file

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Book {

    // Add something just for branch2
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // DECIMAL0
    private String title; // VARCHAR -- variable-lengthed string
    private String author;
    private double price;
}
// Check Status: (git status) -->Check the state of the working directory
// and the staging area