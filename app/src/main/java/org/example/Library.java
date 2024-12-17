package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Register a new patron
    public void registerPatron(Patron patron) {
        patrons.add(patron);
    }

    // Lend a book to a patron
    public boolean lendBook(String title, int patronId) {
        Book bookToLend = null;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                bookToLend = book;
                break;
            }
        }

        for (Patron patron : patrons) {
            if (patron.getId() == patronId && bookToLend != null) {
                patron.borrowBook(bookToLend);
                books.remove(bookToLend); // Remove from library inventory
                return true;
            }
        }
        return false; // Lending failed
    }

    // Accept a returned book
    public boolean returnBook(Book book, int patronId) {
        for (Patron patron : patrons) {
            if (patron.getId() == patronId && patron.getBorrowedBooks().contains(book)) {
                patron.returnBook(book);
                books.add(book); // Add back to library inventory
                return true;
            }
        }
        return false; // Return failed
    }

    // Display available books
    public void displayBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

