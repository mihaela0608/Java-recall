package LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static int ID = 0;
    private int id;
    private String name;
    private List<Book> borrowedBooks;

    public User(String name) {
        this.id = ++ID;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
