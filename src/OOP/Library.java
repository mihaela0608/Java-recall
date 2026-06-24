package OOP;

import java.util.ArrayList;
import java.util.Collection;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public boolean removeBook(String title){
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getTitle().equals(title)){
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
