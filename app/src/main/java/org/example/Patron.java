package org.example;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private int id;
    private List<Book> borrowedBooks;

    // Constructor
    public Patron(String name, int id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Borrow a book
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    // Return a book
      public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        return "Patron{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}

