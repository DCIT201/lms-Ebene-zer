package org.example;

public class App {
    public static void main(String[] args) {
        // Create library
        Library library = new Library();

        // Add books to the library
        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        library.addBook(book1);
        library.addBook(book2);

        // Register patrons
        Patron patron1 = new Patron("Alice", 1);
        Patron patron2 = new Patron("Bob", 2);
        library.registerPatron(patron1);
        library.registerPatron(patron2);

        // Display available books
        library.displayBooks();

        // Lend books
        System.out.println("\nLending '1984' to Alice:");
        library.lendBook("1984", 1);
        library.displayBooks();

        // Return books
        System.out.println("\nReturning '1984' from Alice:");
        library.returnBook(book1, 1);
        library.displayBooks();
    }
}

