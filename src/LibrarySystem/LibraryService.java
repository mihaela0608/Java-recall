package LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private List<Book> books;
    private List<User> users;

    public LibraryService() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }


    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getAllBooks(){
        return books;
    }

    public List<Book> getAvailableBooks(){
        return books.stream().filter(b -> !b.isBorrowed()).toList();
    }

    public List<Book> getBorrowedBooks(){
        return books.stream().filter(Book::isBorrowed).toList();
    }

    public void addUser(User user){
        users.add(user);
    }

    public List<User> getAllUsers(){
        return users;
    }

    public void borrowBook(int userId, int bookId){
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == bookId){
                if (books.get(i).isBorrowed() == false){
                    for (int j = 0; j < users.size(); j++) {
                        if (users.get(j).getId() == userId){
                            users.get(j).getBorrowedBooks().add(books.get(i));
                            books.get(i).setBorrowed(true);
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }

    public void returnBook(int userId, int bookId){
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == bookId){
                books.get(i).setBorrowed(false);
                break;
            }
        }
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getId() == userId){
                List<Book> userBooks = users.get(i).getBorrowedBooks();
                for (int j = 0; j < userBooks.size(); j++) {
                    if (userBooks.get(j).getId() == bookId){
                        userBooks.remove(j);
                        users.get(i).setBorrowedBooks(userBooks);
                        break;
                    }
                }
                break;
            }
        }
    }
}
