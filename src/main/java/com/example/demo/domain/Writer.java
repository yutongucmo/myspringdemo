package com.example.demo.domain;

public class Writer {
    // Initially, the file_name "Author" is red --> it means this file has NOT been added to github
    // Then, let's manually add it
    // After doing so, the file_name turns to be green --> it means this file has been added
    // Next, let's manually commit it
    // After committing, the file_name turns to be blue --> it means this file has been committed

    private String firstname;
    private String lastname;
    private String email;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
