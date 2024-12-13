package com.qa.Relationship;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int id;
    private String name;
    private List<Books> bookslist; // To hold the books issued to the student

    
    public Student() {
        this.bookslist = new ArrayList<>();
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public List<Books> getBookslist() {
        return bookslist;
    }

    
    public void addBook(Books book) {
        this.bookslist.add(book);
    }
}
